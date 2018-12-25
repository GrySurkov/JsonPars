package pars;

import java.util.LinkedList;
import java.util.List;

public class PersonGroup {
	List<Person> persons = new LinkedList<Person>();

	public List<Person> getPersons() {
		return persons;
	}

	public void addPersons(Person person) {
		this.persons.add(person);

	}

}
