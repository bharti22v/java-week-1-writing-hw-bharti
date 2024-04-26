package week_1_Homework;

/**
 * 10.Write a Java program that takes two numbers as input and display the
 * product of two numbers.
 * Test Data:
 * Input First number: 25
 * Input second number: 5
 * Expected Output: 25 * 5 = 125
 */

public class Programme_10_ProductOfTwoNumbers {
    public static void main(String[] args) {
        //First Number declaration
        int firstNumber = 25;
        //Second Number declaration
        int secondNumber = 5;
        int produced = firstNumber * secondNumber;
        //Expected output
        System.out.println(firstNumber + " * " + secondNumber + " = " + produced);
    }
}
