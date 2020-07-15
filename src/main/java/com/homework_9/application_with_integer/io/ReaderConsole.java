package com.homework_9.application_with_integer.io;

import java.io.BufferedReader;
import java.io.IOException;

public class ReaderConsole {
    BufferedReader reader;

    public ReaderConsole(BufferedReader reader) {
        this.reader = reader;
    }

    public int read() throws IOException {
        return Integer.parseInt(reader.readLine());
    }
}