package com.javastudy.Chapter05;

public class NullPointerExceptionExample {
    public static void main(String[] args) {
        int[] intArray = null;
//        intArray[0] = 10; //NullPointerException

        String string = null;
//        System.out.println("총 문자 수: " + string.length() ); //NullPointerException
    }
}
