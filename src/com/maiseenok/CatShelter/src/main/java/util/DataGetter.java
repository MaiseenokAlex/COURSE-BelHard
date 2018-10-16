package util;

import java.util.List;

import dao.CatsDAO;
import dao.CatsDAOImpl;
import model.Cats;

public class DataGetter {
	private static CatsDAO catDAO = new CatsDAOImpl();

	public static List<Cats> getAllCats() {
		return catDAO.getAllCats();
	}

	public static Cats addCat(String name, String dad, String mom, String gender, String age, String color) {
		return catDAO.addCat(name, dad, mom, gender, age, color);
	}

	public static Cats mergeCat(String id, String name, String dad, String mom, String age, String color) {
		return catDAO.mergeCat(id, name, dad, mom, age, color);
	}

	public static List<Cats> getCatById(int id) {
		return catDAO.getCatById(id);
	}

	public static void removeCat(int i) {
		catDAO.removeCat(getCatById(i).get(0));
	}

	public static String validate(String name, String dad, String mom, String age, String color) {
		String result = "";

		// name
		if (!name.matches("^[а-яА-ЯёЁa-zA-Z0-9\\s]+$")) {
			if (name.isEmpty())
				result += "Имя обязательно для заполнения. ";
			else
				result += "Имя некорректно. ";
		}

		// age
		if (age.matches("\\d+(\\.\\d)?")) {
			if (Double.parseDouble(age) > 20)
				result += "Увы, кошки столько не живут. ";
		} else if (!age.isEmpty())
			result += "Возраст некорректен. ";

		// color
		if (!color.isEmpty())
			if (!color.matches("^[а-яА-ЯёЁa-zA-Z0-9\\s]+$"))
				result += "Цвет некорректен.";
		return result;
	}

	public static List<Cats> getDadList() {
		return catDAO.getDadList();
	}

	public static List<Cats> getMomList() {
		return catDAO.getMomList();
	}
}
