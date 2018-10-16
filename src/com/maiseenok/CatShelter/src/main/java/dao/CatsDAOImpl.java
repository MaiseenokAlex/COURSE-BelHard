package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import model.Cats;

public class CatsDAOImpl implements CatsDAO {
	final String GET_ALL_CATS = "SELECT c FROM Cats c";
	final String GET_CATS_BY_ID = "SELECT c FROM Cats c WHERE c.id = ";
	final String GET_CATS_BY_NAME = "SELECT c FROM Cats c WHERE c.name = ?1";

	EntityManager em = Persistence.createEntityManagerFactory("jpa_cats").createEntityManager();
	TypedQuery<Cats> q;

	public List<Cats> getAllCats() {
		q = em.createQuery(GET_ALL_CATS, Cats.class);
		return q.getResultList();
	}

	public Cats addCat(String name, String dad, String mom, String gender, String age, String color) {
		Cats cat = new Cats();
		cat.setId(Integer.parseInt(em.createQuery("SELECT MAX(c.id) FROM Cats c").getSingleResult().toString())+1);
		cat.setName(name);
		cat.setDad(dad.isEmpty() ? null : getCatById(Integer.parseInt(dad)).get(0));
		cat.setMom(mom.isEmpty() ? null : getCatById(Integer.parseInt(mom)).get(0));
		cat.setGender(gender);
		cat.setAge(age.isEmpty() ? 0 : Double.parseDouble(age));
		cat.setColor(color.isEmpty() ? "NONE" : color);

		try {
			em.getTransaction().begin();
			em.persist(cat);
			em.getTransaction().commit();
		}
		catch(Exception e) {
			em.getTransaction().rollback();
			e.printStackTrace();
		}
		return cat;
	}
	
	public Cats mergeCat(String id, String name, String dad, String mom, String age, String color) {
		Cats cat = getCatById(Integer.parseInt(id)).get(0);
		cat.setName(name);
		cat.setDad(dad.isEmpty() ? null : getCatById(Integer.parseInt(dad)).get(0));
		cat.setMom(mom.isEmpty() ? null : getCatById(Integer.parseInt(mom)).get(0));
		cat.setAge(age.isEmpty() ? 0 : Double.parseDouble(age));
		cat.setColor(color.isEmpty() ? "NONE" : color);

		try {
			em.getTransaction().begin();
			em.merge(cat);
			em.getTransaction().commit();
		}
		catch(Exception e) {
			em.getTransaction().rollback();
			e.printStackTrace();
		}
		return cat;
	}

	public List<Cats> getCatById(int id) {
		q = em.createQuery(GET_CATS_BY_ID + id, Cats.class);
		return q.getResultList();
	}

	public int getCatIdByName(String name) {
		System.out.println(">> Ищем кота по имени " + name);
		if (name.isEmpty())
			return 0;
		q = em.createQuery(GET_CATS_BY_NAME, Cats.class);
		q.setParameter(1, name);
		return q.getResultList().get(0).getId();
	}

	public List<Cats> getChildrenById(int i) {
		q = em.createQuery("SELECT c FROM Cats c WHERE c.dad = " + i + " OR c.mom = " + i, Cats.class);
		return q.getResultList();
	}

	public void removeCat(Cats cat) {
		System.out.println(">> Удаление " + cat.getName());
	try {
		em.getTransaction().begin();
		List<Cats> list = getChildrenById(cat.getId());
		if(cat.getGender().equals("MALE"))
			for(Cats c:list) {
				c.setDad(null);
				em.merge(c);
				}
		else
			for(Cats c:list) {
				c.setMom(null);
				em.merge(c);
		}
		em.remove(cat);
		em.getTransaction().commit();
	}
		catch(Exception e) {
			em.getTransaction().rollback();
			e.printStackTrace();
		}
	}
	
	public List<Cats> getDadList(){
		q = em.createQuery("SELECT c FROM Cats c WHERE c.gender = 'MALE'", Cats.class);
		return q.getResultList();
	}
	
	public List<Cats> getMomList(){
		q = em.createQuery("SELECT c FROM Cats c WHERE c.gender = 'FEMALE'", Cats.class);
		return q.getResultList();
	}
}
