package org.sisoftware.service;

import org.sisoftware.exception.FormatException;
import org.sisoftware.model.Message;

public interface IJson {
    public String format(Message message) throws FormatException;
}
