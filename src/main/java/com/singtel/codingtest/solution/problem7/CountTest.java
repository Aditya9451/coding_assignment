
package com.singtel.codingtest.solution.problem7;

import com.singtel.codingtest.solution.problem1.Animal;
import com.singtel.codingtest.solution.problem1.Bird;
import com.singtel.codingtest.solution.problem2.Duck;

import java.lang.reflect.Method;
import java.util.Arrays;

public class CountTest {


    public static void main(String[] args) {
        Animal[] animals = new Animal[2];

        //animals[0] = new Dog();
        animals[0] = new Bird();
        animals[1] = new Duck();
        //animals[3] = new Dog();

        int count = 0;
        for (int i = 0; i < animals.length; i++) {
            Method[] methods = animals[i].getClass().getDeclaredMethods();
            if (Arrays.asList(methods).toString().contains("walk")) {
                ++count;
                System.out.println("count of walk implementation>>" + count);
            }
        }


    }

}