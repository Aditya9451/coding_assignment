package com.singtel.codingtest;

import com.singtel.codingtest.solution.problem1.Bird;
import com.singtel.codingtest.solution.problem2.Chicken;
import com.singtel.codingtest.solution.problem2.Duck;
import com.singtel.codingtest.solution.problem3.Rooster;
import com.singtel.codingtest.solution.problem5.Clownfish;
import com.singtel.codingtest.solution.problem5.Shark;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CodingTestApplication {

	public static void main(String[] args) {


		//SpringApplication.run(CodingTestApplication.class, args);
		//Problem1
		System.out.println("Problem1 output:");
		Bird bird = new Bird();
		bird.walk();
		bird.fly();
		bird.sing();


		//Problem 2
		System.out.println("Problem2 output:");
		Duck duck = new Duck();
		Chicken chicken =new Chicken();
		duck.canSwim();
		duck.makeSound();
		chicken.makeSound();


		//Problem 3
		System.out.println("Problem3 output:");
		Rooster rooster = new Rooster();
		rooster.makeSound();

		//Problem 5
		System.out.println("Problem5 output:");
		Shark shark = new Shark();
		shark.setColor();
		shark.setSize();
		shark.setEatFish();
		System.out.println("Size:"+shark.getSize());
		System.out.println("Color:"+shark.getColor());
		System.out.println("EatFish:"+shark.isEatFish());

		Clownfish clownFish = new Clownfish();
		clownFish.setColor();
		clownFish.setSize();
		clownFish.setMakeJokes();
		System.out.println("Size:"+clownFish.getSize());
		System.out.println("Color:"+clownFish.getColor());
		System.out.println("MakeJokes:"+clownFish.isMakeJokes());

	}

}
