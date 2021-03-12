package com.company.CustomMath;

public class CustomMath {
    //region Properties
    private int number;
    //endregion

    //region Constructors
    public CustomMath() {
    }

    public CustomMath(int number) {
        this.number = number;
    }
    //endregion

    //region Public Methods
    public void getNextPrime(int number) {
        boolean prime = true;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                prime = false;
                break;
            }
        }
        if (prime) {
            System.out.println(number);
            ;
        } else {
            int i;
            do {
                boolean flag = false;

                for (i = 2; i <= number / 2; ++i) {
                    if (number % i == 0) {
                        flag = true;
                        break;
                    }
                }

                if (!flag && number != 0 && number != 1)
                    System.out.print(number);
                ++number;
            } while (number % i != 0);
        }
    }
    //endregion

    //region Getters and Setters
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    //endregion
}
