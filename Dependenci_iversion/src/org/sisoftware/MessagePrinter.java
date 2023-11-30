package org.sisoftware;

import org.sisoftware.model.Message;
import org.sisoftware.service.AltPrintWriter;
import org.sisoftware.service.Formatter;
import org.sisoftware.service.JSONFormatter;


import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MessagePrinter {

	//Writes message to a file
	public void writeMessage(Message msg, String fileName) throws IOException {
		Formatter formatter = new JSONFormatter();//creates formatter
		try(AltPrintWriter writer = new AltPrintWriter(new FileWriter(fileName))) { //creates print writer
			writer.println(formatter.format(msg)); //formats and writes message
			writer.flush();
		}
	}
}
