package model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cats")
public class Cats {

	@Id
	@Column(name = "id")
	private int id;

	@Column(name = "name")
	private String name;

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "dad")
	private Cats dad;

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "mom")
	private Cats mom;

	@Column(name = "gender")
//	@Enumerated(EnumType.STRING)
	private String gender;

	@Column(name = "age")
	private double age;

	@Column(name = "color")
	private String color;

	public Cats() {
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Cats getDad() {
		return dad;
	}

	public void setDad(Cats dad) {
		this.dad = dad;
	}

	public Cats getMom() {
		return mom;
	}

	public void setMom(Cats mom) {
		this.mom = mom;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public double getAge() {
		return age;
	}

	public void setAge(double age) {
		this.age = age;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String toString() {
		return "Кошка № " + id + ". Имя: " + name /*+ " (пол - " + gender + ", возраст - " + age + ", цвет - " + color
				+ "). Отец: " + dad.getName() + ". Мать: "
				+ mom.getName() + ". "*/;
	}

}
