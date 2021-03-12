package com.company.Calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number:  ");
        int a = scanner.nextInt();
        System.out.print("Enter your second number:  ");
        int b = scanner.nextInt();

        Calculator operation = new Calculator(a, b);
        System.out.println();
        System.out.println("""
                Tap '+' to add. \s
                Tap '-' to subtract. 
                Tap '*' to multiply. 
                Tap '/' to divide. 
                Enter your option below.\s""");

        char option = scanner.next().charAt(0);
        switch (option) {
            case '+' -> {
                System.out.println("a + b = " + operation.addNumbers());
            }
            case '-' -> {
                System.out.println("a - b = " + operation.subtractNumbers());
            }
            case '*' -> {
                System.out.println("a * b = " + operation.multiplyNumbers());
            }
            case '/' -> {
                operation.divideNumbers();
            }
        }
    }
}