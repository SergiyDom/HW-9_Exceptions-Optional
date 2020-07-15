package com.homework_9.application_with_integer;

import com.homework_9.application_with_integer.io.Printer;
import com.homework_9.application_with_integer.io.ReaderConsole;
import com.homework_9.application_with_integer.model.InputNambers;
import com.homework_9.application_with_integer.service.SafeDivision;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SafeDivisionManager {
    public void run(){
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        ReaderConsole readerConsole = new ReaderConsole(bufferedReader);
        Printer printer = new Printer();
        SafeDivision safeDivision = new SafeDivision();
        InputNambers nambers = new InputNambers();
        nambers.init(printer,readerConsole);
        nambers.culculate(safeDivision);
        nambers.done(printer);
    }
}