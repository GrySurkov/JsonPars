package pars;

import java.lang.reflect.Type;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

public class PersonsSerializer implements JsonSerializer<Person> {

	public JsonElement serialize(Person src, Type typeOfSrc, JsonSerializationContext context) {
		JsonObject result = new JsonObject();
//		result.addProperty("name", src.getName());
		result.addProperty("city", src.getCity());
		result.addProperty("age", src.getAge());
		return result;
	}

}
