package com.singtel.codingtest.solution.problem2;

import com.singtel.codingtest.solution.problem1.Bird;
import com.singtel.codingtest.solution.problem1.Soundable;

public class Duck extends Bird implements Soundable {

    @Override
    public void makeSound() {
       System.out.println("Quack , quack");
    }

    public void canSwim(){
        System.out.println("I can Swim");
    }
}
