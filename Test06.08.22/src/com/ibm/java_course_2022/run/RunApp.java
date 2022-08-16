package com.ibm.java_course_2022.run;


import java.util.Scanner;

/**
 * @author siyanastoyanova
 * @version 1.0
 * This class is the entry point of our app
 */

public class RunApp {
    public static int result = 111; //variable for result global
    public static long op5; // 64 bit 2^64
    public static byte op1 = 122 ;
    public static short op2; // 2^16 0-65535
    public static float op3 = 0.33F; //32 bits floating point 0.3333
    public static double op4 = 0.44; //64 bit floating point
    public static char op6 = 'C'; //16 bits 0-65535
    public static boolean op7 = true; //true or false
    public String literal = "this is the test string";


    public static void main(String []arg) {
        RunApp app = new RunApp();
        app.literal = "first instance";
        System.out.println(app.literal);
        RunApp app1 = new RunApp();
        app1.literal = "second instance";
        System.out.println(app1.literal);
        RunApp app2 = new RunApp();
        System.out.println(app2.literal);
        System.out.println("Starting program...");
        System.out.println("Please enter first operand:");
        Scanner scanner = new Scanner(System.in);
        int operand1 = scanner.nextInt(); //local variable
        System.out.println("Please enter second operand:");
        int operand2 = scanner.nextInt(); //local variable
        result = doSum(operand1, operand2);
        System.out.println("Result of the sum is: "+result);
    }

    /**
     *
     * @param operand1
     * @param operand2
     * @return
     */
    public static int doSum(int operand1, int operand2){
        return operand1 + operand2;
    }

    /**
     *
     * @param operand1
     * @param operand2
     * @return
     */
    public static int doMinus(int operand1, int operand2){
        return operand1 - operand2;
    }
}
