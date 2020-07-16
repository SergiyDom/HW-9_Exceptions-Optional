package com.domaranskiy.application_with_integer.service;

public class SafeDivision {
    public double safeDivision(int A, int B) throws DivisionByZeroDoubleExeption {
        if (B == 0) throw new DivisionByZeroDoubleExeption("reenter the value of B");
        return Math.round(((double) A / B) * 100) / 100.0;
    }
}