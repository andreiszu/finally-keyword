package com.example.finallykeyword;

public class FinallyExamples {

    public void tryCatchFinally() {
        try {
            System.out.println("Try block");

            int x = 1;
            int y = 0;

            int z = x / y;
        } catch (ArithmeticException e) {
            System.out.println("Catch block");
        } finally {
            System.out.println("Finally block");
        }
    }

    public void tryCatchDifferentExceptionFinally() {
        try {
            System.out.println("Try block");
            throw new RuntimeException();
        } catch (ArithmeticException e) {
            System.out.println("Catch block");
        } finally {
            System.out.println("Finally block");
        }
    }

    public void tryFinally() {
        try {
            System.out.println("Try block");

            int x = 1;
            int y = 0;

            int z = x / y;
        } finally {
            System.out.println("Finally block");
        }
    }

    public void callTryReturnFinally() {
        String returnedValue = tryReturnFinally();
        System.out.println(returnedValue);
    }

    private String tryReturnFinally() {
        try {
            System.out.println("Try block");
            return "Returned from try";
        } finally {
            System.out.println("Finally block");
        }
    }

    public void callTryCatchReturnFinally() {
        String returnedValue = tryCatchReturnFinally();
        System.out.println(returnedValue);
    }

    private String tryCatchReturnFinally() {
        try {
            System.out.println("Try block");
            throw new ArithmeticException();
        } catch (ArithmeticException exception) {
            return "Returned from catch";
        } finally {
            System.out.println("Finally block");
        }
    }

    public void callTryReturnFinallyReturn() {
        String returnedValue = tryReturnFinallyReturn();
        System.out.println(returnedValue);
    }

    private String tryReturnFinallyReturn() {
        try {
            System.out.println("Try block");
            return "Returned from try";
        } finally {
            System.out.println("Finally block");
            return "Returned from finally";
        }
    }


    public void callTryReturnFinallyThrow() {
        String returnedValue = tryReturnFinallyThrow();
        System.out.println(returnedValue);
    }

    private String tryReturnFinallyThrow() {
        try {
            System.out.println("Try block");
            return "Returned from try";
        } finally {
            System.out.println("Finally block");
            throw new ArithmeticException();
        }
    }

    public void trySystemExitFinally() {
        try {
            System.out.println("Try block");

            System.exit(1);
        } finally {
            System.out.println("Finally block");
        }
    }

}
