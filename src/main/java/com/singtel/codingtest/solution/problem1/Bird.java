package com.singtel.codingtest.solution.problem1;

public class Bird extends Animal {

    public void fly() {
        System.out.println("I am flying");
    }

    @Override
    public  void walk() {
        System.out.println("I am walking");
    }

    public  void sing() {
        System.out.println("I am Singing");
    }
}
