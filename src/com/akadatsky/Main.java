package com.akadatsky;

public class Main {

    // test
    public static void main(String[] args) {

        try {
            test1(10);
        } catch (Exception e) {
        }

        test2(10);

    }

    private static void test1(int i) throws MyException, ArithmeticException {
        if (i > 0) {
            throw new OutOfMemoryError("no memory for test");
        }
    }

    /**
     * @param i
     * @throws MyRuntimeException
     */
    private static void test2(int i) throws MyRuntimeException {
        if (i > 0) {
            throw new MyRuntimeException("message", "Exception in test1");
        }
    }


}
