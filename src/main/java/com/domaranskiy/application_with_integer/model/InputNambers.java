package com.domaranskiy.application_with_integer.model;

import com.domaranskiy.application_with_integer.io.Printer;
import com.domaranskiy.application_with_integer.io.ReaderConsole;
import com.domaranskiy.application_with_integer.service.DivisionByZeroDoubleExeption;
import com.domaranskiy.application_with_integer.service.SafeDivision;

import java.io.IOException;

public class InputNambers {
    private int A;
    private int B;
    private double division;

    public void init(Printer printer, ReaderConsole reader) {
        printer.print("Enter value A: ");
        try {
            A = reader.read();
        } catch (NumberFormatException | IOException e) {
            System.out.println("you enter incorrect value");
            System.exit(999);
        }
        printer.print("Enter value B: ");
        try {
            B = reader.read();
        } catch (NumberFormatException | IOException e) {
            System.out.println("you enter incorrect value");
            System.exit(999);
        }
    }

    public void culculate(SafeDivision divide) {
        try {
            division = divide.safeDivision(A, B);
        } catch (ArithmeticException | DivisionByZeroDoubleExeption e) {
            System.out.println(e.getMessage());
            System.exit(999);
        }
    }

    public void done(Printer printer) {
        printer.print("Result of division A/B: ");
        printer.print(division);
    }
}