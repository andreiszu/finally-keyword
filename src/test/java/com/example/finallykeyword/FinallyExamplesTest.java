package com.example.finallykeyword;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FinallyExamplesTest {

    @Test
    void tryCatchFinally() {
        FinallyExamples finallyExamples = new FinallyExamples();

        finallyExamples.tryCatchFinally();
    }

    @Test
    void tryCatchDifferentExceptionFinally() {
        FinallyExamples finallyExamples = new FinallyExamples();

        finallyExamples.tryCatchDifferentExceptionFinally();
    }

    @Test
    void tryFinally() {
        FinallyExamples finallyExamples = new FinallyExamples();

        finallyExamples.tryFinally();
    }

    @Test
    void tryReturnFinally() {
        FinallyExamples finallyExamples = new FinallyExamples();

        finallyExamples.callTryReturnFinally();
    }

    @Test
    void tryCatchReturnFinally() {
        FinallyExamples finallyExamples = new FinallyExamples();

        finallyExamples.callTryCatchReturnFinally();
    }

    @Test
    void tryReturnFinallyReturn() {
        FinallyExamples finallyExamples = new FinallyExamples();

        finallyExamples.callTryReturnFinallyReturn();
    }

    @Test
    void tryReturnFinallyThrow() {
        FinallyExamples finallyExamples = new FinallyExamples();

        finallyExamples.callTryReturnFinallyThrow();
    }

    @Test
    void trySystemExitFinally() {
        FinallyExamples finallyExamples = new FinallyExamples();

        finallyExamples.trySystemExitFinally();
    }
}