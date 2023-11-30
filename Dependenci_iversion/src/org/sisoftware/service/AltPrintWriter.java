package org.sisoftware.service;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;

public class AltPrintWriter extends PrintWriter {

    private PrintWriter printWriter;
    public AltPrintWriter(FileWriter fileName) throws FileNotFoundException {
        super(fileName);
    }
}
