package com.singtel.codingtest.solution.problem3;

import com.singtel.codingtest.solution.problem1.Soundable;
import com.singtel.codingtest.solution.problem2.Chicken;

public class Rooster extends Chicken implements Soundable {
    @Override
    public void makeSound() {
        System.out.println("Cock-a-doodle-doo");
    }
}
