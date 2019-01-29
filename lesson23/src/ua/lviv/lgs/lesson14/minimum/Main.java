package ua.lviv.lgs.lesson14.minimum;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import ua.lviv.lgs.lesson13.Deputy;

public class Main {

	public static void main(String[] args) {

		
		List<Integer> i = new ArrayList<Integer>();
		List<Car> car = new ArrayList<>();
		car.add(new Car("Accord", 1020));
		car.add(new Car("Juke", 1560));
		car.add(new Car("Juke", 1270));
		car.add(new Car("Juke", 1340));
		car.add(new Car("Sens", 850));
		car.add(new Car("Duster", 1330));
		car.add(new Car("I30", 940));
		car.add(new Car("Ceed", 870));
		
		car.stream().sorted().forEach(System.out::println);

		System.out.println();
		Comparator<Car> comparator = Comparator.comparing( Car::getWeight);
		car.stream().sorted(comparator).forEach(System.out::println);

	}

}
