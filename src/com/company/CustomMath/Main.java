package com.company.CustomMath;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number:  ");
        CustomMath number = new CustomMath();
        number.getNextPrime(scanner.nextInt());
    }
}