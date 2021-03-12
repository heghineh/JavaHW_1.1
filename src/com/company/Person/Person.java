package com.company.Person;

public class Person {
    //region Properties
    private String name;
    private int age;
    //endregion

    //region Constructors
    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //endregion

    //region Public Methods
    public void compareAge(Person person) {
        if (age < 0 || person.getAge() < 0) {
            System.out.println("Invalid action.");
        } else {
            if (age > person.getAge()) {
                System.out.println("I'm " + name + " and " + person.getName() + " is younger than me.");
            } else if (age < person.getAge()) {
                System.out.println("I'm " + name + " and " + person.getName() + " is older than me.");
            } else {
                System.out.println("I'm " + name + " and " + person.getName() + " the same age as me.");
            }
        }
    }
    //endregion

    //region Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    //endregion
}
