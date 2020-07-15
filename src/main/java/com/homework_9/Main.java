package com.homework_9;

import com.homework_9.application_with_integer.SafeDivisionManager;
import com.homework_9.caught_except.TryBlocks;
import com.homework_9.rethrowing_exceptions.RethrowingExceptExampl;

public class Main {
    public static void main(String[] args) {
        TryBlocks.CaughtExceptManager.run();
        new SafeDivisionManager().run();
        RethrowingExceptExampl.run(8, 0);
    }
}