package com.company.Person;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Donald", 16);
        Person p2 = new Person("Leo", 32);
        Person p3 = new Person("Carla", 64);

        p1.compareAge(p2);
        p2.compareAge(p3);
        p3.compareAge(p1);
    }
}