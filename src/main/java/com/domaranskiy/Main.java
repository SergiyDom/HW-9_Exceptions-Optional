package com.domaranskiy;

import com.domaranskiy.application_with_integer.SafeDivisionManager;
import com.domaranskiy.caught_except.TryBlocks;
import com.domaranskiy.rethrowing_exceptions.RethrowingExceptExampl;

public class Main {
    public static void main(String[] args) {
        TryBlocks.CaughtExceptManager.run();
        new SafeDivisionManager().run();
        RethrowingExceptExampl.run(8, 0);
    }
}