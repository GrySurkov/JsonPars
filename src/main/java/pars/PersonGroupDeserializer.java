package pars;

import java.lang.reflect.Type;
import java.util.Map;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

public class PersonGroupDeserializer implements JsonDeserializer<PersonGroup> {

	public PersonGroup deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
		PersonGroup result = new PersonGroup();
		JsonObject jsonObject = json.getAsJsonObject();

		for (Map.Entry<String, JsonElement> entry : jsonObject.entrySet()) {
			Person person = context.deserialize(entry.getValue(), Person.class);
			person.setName(entry.getKey());
			result.addPersons(person);
		}
		return result;
	}

}
