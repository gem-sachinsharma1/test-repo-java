package com.gemini.training;


/**
 * Calculator class
 * used for calculation of two operands
 */
public class Calculator {

    /**
     * this function is responsible for addition
     *
     * @param a - integer type param - operand 1
     * @param b - integer type param - operand 2
     */
    public static void add(int a, int b){
        System.out.println(a+b);
    }


    /**
     * This is the main function or driver function
     * @param args
     *
     *
     */
    public static void main(String[] args) {
        int a = 5;
        int b = 7;

        add(a,b);
    }
}
