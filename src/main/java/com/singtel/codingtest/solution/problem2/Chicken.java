package com.singtel.codingtest.solution.problem2;

import com.singtel.codingtest.solution.problem1.Bird;
import com.singtel.codingtest.solution.problem1.Flyable;
import com.singtel.codingtest.solution.problem1.Soundable;

public class Chicken extends Bird implements Soundable, Flyable {

    @Override
    public void makeSound() {
        System.out.println("Cluck, cluck");
    }

    @Override
    public void fly(){
        System.out.println("I cannot fly as my wings are clipped");
    }
}
