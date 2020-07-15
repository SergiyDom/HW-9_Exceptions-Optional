package com.homework_9.caught_except;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryBlocks {

    private void tryBlocks() throws ExceptionA, ExceptionB, NullPointerException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter your name");
        String name = reader.readLine();
        if ((name.matches("-?\\d+(\\.\\d+)?"))) throw new ExceptionA("You enter wrong name");
        if (name.isEmpty()) throw new NullPointerException("Your name can not be empty");
        System.out.println("Hello " + name + " You enter incorrect age");
        String strAge = reader.readLine();
        if (!(strAge.matches("-?\\d+(\\.\\d+)?"))) throw new ExceptionB("You must enter Integer number");
        int age = Integer.parseInt(strAge);
        if (age < 0 || age > 100) throw new ExceptionB("You enter incorrect age");
        System.out.println(name + " pleas enter what language do you learn at  your " + age + " age");
        name = reader.readLine();
        if (!name.equalsIgnoreCase("java")) throw new IOException("You'er wrong \n try again");
    }

    public static class CaughtExceptManager {
        public static void run() {
            try {
                new TryBlocks().tryBlocks();
            } catch (ExceptionA | IOException e) {
                System.out.println(e.getMessage());
            } finally {
                System.out.println("Try again");
            }
        }
    }
}