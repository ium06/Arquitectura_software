package org.sisoftware.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.sisoftware.exception.FormatException;
import org.sisoftware.model.Message;

//Formats message to JSON format
public class JSONFormatter implements Formatter{

	private IJson ijson;

	public JSONFormatter(){
		this.ijson =  ijson;
	}

	public String format(Message message) throws FormatException {
		ObjectMapper mapper = new ObjectMapper();
		mapper.findAndRegisterModules();
		try {
			return mapper.writeValueAsString(message);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
			throw new FormatException(e);
		}
	}
}
