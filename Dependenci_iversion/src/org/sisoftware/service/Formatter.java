package org.sisoftware.service;

import org.sisoftware.exception.FormatException;
import org.sisoftware.model.Message;

//Common interface for classes formatting Message object
public interface Formatter {
	
	public String format(Message message) throws FormatException;
	
}
