package pars;

public class Person {
	String city;
	String name;
	Integer age;

	public Person() {

	}

	public Person(String name, String city, int age) {
		this.name = name;
		this.city = city;
		this.age = age;

	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

}