package ua.lviv.lgs.lesson13;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Fraction {
	
	
	private String name;

	public Fraction(String name) {
		super();
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private List<Deputy> fraction = new ArrayList<Deputy>();
	
	public void addDeputyInitial(String lastName, String firstName, int age, int weight, int height,
				boolean corruptionist, int sizeOfBribe) {
		Deputy deputy = new Deputy(weight,height,lastName,firstName,age,corruptionist);
		deputy.setSizeOfBribe(sizeOfBribe);
		fraction.add(deputy);
	}
	
	public void addDeputy() {
		Scanner sc = new Scanner(System.in);
		System.out.println("¬вед≥ть вагу");
		Integer weight = sc.nextInt();
		System.out.println("¬вед≥ть р≥ст");
		Integer height = sc.nextInt();	
		System.out.println("¬вед≥ть пр≥звище");
		String lastName = sc.next();	
		System.out.println("¬вед≥ть ≥м'€");
		String firstName = sc.next();	
		System.out.println("¬вед≥ть в≥к");
		Integer age = sc.nextInt();		
		System.out.println("÷ей депутат хабарник?");
		Boolean corruptionist = sc.nextBoolean();
		fraction.add(new Deputy(weight,height,lastName,firstName,age,corruptionist));
		fraction.get(fraction.size()-1).giveBribe();
		System.out.println("ƒодано депутата "+fraction.get(fraction.size()-1).toString());
		
	}
	
	public void deleteDeputy(){
		Scanner sc = new Scanner(System.in);
		System.out.println("¬вед≥ть пр≥звище");
		String lastName = sc.next();
		Optional<Deputy> findFirst = fraction.stream().filter(s->s.getLastName().equals(lastName)).findFirst();
		if (findFirst.isPresent()) {
			fraction.remove(findFirst.get());
		} else System.out.println("ƒепутата "+lastName+" не знайдено");
	}
	
	public void getCorruptionist() {
		fraction.stream().filter(n->n.isCorruptionist()).forEach(System.out::println);
	}
	
	
	public void getMostCorruptionist() {
		Comparator<Deputy> comparator = Comparator.comparing( Deputy::getSizeOfBribe);
		int maxBribe = fraction.stream().max(comparator).get().getSizeOfBribe();
		fraction.stream().filter(n->n.getSizeOfBribe()==maxBribe).forEach(System.out::println);
	}	
	
	
	public void getAllDeputies() {
		fraction.stream().collect(Collectors.toList());
	}	
	
	
	public void clearFraction() {
		Iterator<Deputy> iterator = fraction.iterator();
		while (iterator.hasNext()) {
			iterator.remove();
		}
	}		
}
