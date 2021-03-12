package com.company.Luke;

public class Main {
    public static void main(String[] args) {
        Family member0 = new DarthVader();
        Family member1 = new Han();
        Family member2 = new Leia();
        Family member3 = new R2D2();
        Family member4 = new LukeSkywalker();

        member0.relationToLuke();
        member1.relationToLuke();
        member2.relationToLuke();
        member3.relationToLuke();
        member4.relationToLuke();
    }
}