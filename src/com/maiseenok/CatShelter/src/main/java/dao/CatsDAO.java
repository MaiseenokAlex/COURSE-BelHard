package dao;

import java.util.List;

import model.Cats;

public interface CatsDAO {
	List<Cats> getAllCats();
	List<Cats> getCatById(int i);
	Cats addCat(String name, String dad, String mom, String gender, String age, String color);
	Cats mergeCat(String id, String name, String dad, String mom, String age, String color);
	void removeCat(Cats cat);
	List<Cats> getDadList();
	List<Cats> getMomList();
}
