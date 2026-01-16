package com.javastudy.Chapter04;

public class SumFrom1To100Example {
    public static void main(String[] args) {
        int sum = 0;
        int i;

        for (i=1; i<=100; i++) {
            sum += i;
        }

//        while(i<=100) {
//            sum += i;
//            i++;
//        }

        System.out.println("1~" + (i-1) + " 합 : " + sum);
    }
}
