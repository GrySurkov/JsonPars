package pars;

import java.lang.reflect.Type;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

public class PersonGroupSerializer implements JsonSerializer<PersonGroup> {

	public JsonElement serialize(PersonGroup src, Type typeOfSrc, JsonSerializationContext context) {
		JsonObject result = new JsonObject();
		for (Person person : src.getPersons())
			result.add(person.getName(), context.serialize(person));
		return result;
	}

}
