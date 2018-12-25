package pars;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.List;

import com.google.gson.Gson;

public class ParsJson {

	public static void main(String[] args) throws IOException {
		URL url = new URL("http://main3.mysender.ru/persons.json");
		BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"));
		String json = br.readLine();
		br.close();
		System.out.println(json);
		Gson gson = new Gson();
		PersonGroup person = gson.fromJson(json, PersonGroup.class);
		List<Person> personList = person.getPersons();
		FileWriter writer = new FileWriter("Result.txt", false);
		for (int i = 0; i < personList.size(); i++) {
			writer.append(personList.get(i).getName() + " " + personList.get(i).getCity() + " " + personList.get(i).getAge() + "\r\n");
			System.out.println(personList.get(i).getName() + " " + personList.get(i).getCity() + " " + personList.get(i).getAge());
		}
		writer.close();

	}

}
