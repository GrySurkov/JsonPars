package pars;

import java.lang.reflect.Type;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

public class PersonDeserializer implements JsonDeserializer<Person> {

	public Person deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
		JsonObject jsonObject = new JsonObject();
		Person person = new Person();
		person.setName(jsonObject.get("name").getAsString());
		person.setCity(jsonObject.get("city").getAsString());
		person.setAge(jsonObject.get("age").getAsInt());
		return person;
	}

}
