package com.core.student;

/**
 * Hello world!
 *
 */
public class StudentEntity {
	private String name;
	private String classes;
	private int age;
	private String city;
	private StudentPojo pojo;

	@Override
	public String toString() {
		return "StudentEntity [name=" + name + ", classes=" + classes + ", age=" + age + ", city=" + city + ", pojo="
				+ pojo + "]";
	}

	public String getClasses() {
		return classes;
	}

	public void setClasses(String classes) {
		this.classes = classes;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public StudentPojo getPojo() {
		return pojo;
	}

	public void setPojo(StudentPojo pojo) {
		this.pojo = pojo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}