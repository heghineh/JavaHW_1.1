package com.company.Calculator;

public class Calculator {
    //region Properties
    private double a;
    private double b;
    //endregion

    //region Constructors

    public Calculator() {
    }

    public Calculator(double a, double b) {
        this.a = a;
        this.b = b;
    }
    //endregion

    //region Public Methods
    public double addNumbers() {
        return a + b;
    }

    public double subtractNumbers() {
        return a - b;
    }

    public double multiplyNumbers() {
        return a * b;
    }

    public void divideNumbers() {
        if (b == 0) {
            System.out.println("This operation is not valid.");
        } else {
            System.out.println("a / b = " + a / b);
        }
    }
    //endregion

    //region Getters and Setters
    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
    //endregion
}