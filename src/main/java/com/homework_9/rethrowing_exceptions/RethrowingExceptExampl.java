package com.homework_9.rethrowing_exceptions;

public class RethrowingExceptExampl {
    private static int someMethod2(int firstNumber, int secondNumber) throws ArithmeticException {
        return firstNumber / secondNumber;
    }

    private static String someMethod1(int a, int b) throws ArithmeticException {
        return "you getResult: " + someMethod2(a, b);
    }

    public static void run(int a, int b) {
        try {
            System.out.println(someMethod1(a, b));
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }
}