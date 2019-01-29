package ua.lviv.lgs.lesson13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

public final class SupremeCouncil {
	private List<Fraction> supremeCouncil = new ArrayList<Fraction>();
	private static SupremeCouncil _instance = null;
	
	private static final SupremeCouncil INSTANCE = new SupremeCouncil();
	
	private SupremeCouncil() {
		super();
	}

	  public static SupremeCouncil getInstance() {
	        if (_instance == null)
	            _instance = new SupremeCouncil();
	        return _instance;
	    }
	
	private String getFractionName() {
		System.out.println("Введіть назву фракції");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		return name;
	}  
	  
	public void addFraction(){
		String name = getFractionName();
		supremeCouncil.add(new Fraction(name));
		System.out.println("Додано фракцію "+name);
	}
	
	public void deleteFraction(){
		String name = getFractionName();
		Optional<Fraction> findFirst = supremeCouncil.stream().filter(s->s.getName().equals(name)).findFirst();
		if (findFirst.isPresent()) {
			supremeCouncil.remove(findFirst.get());	
			System.out.println("Фракцію "+name+" видалено");
		}
	}
	
	
	public void clearFraction(){
		String name = getFractionName();
		Optional<Fraction> findFirst = supremeCouncil.stream().filter(s->s.getName().equals(name)).findFirst();
		if (findFirst.isPresent()) {
			findFirst.get().clearFraction();
		} else System.out.println("Такої фракції не знайдено");
	}	
	
	public void getAllFractions(){
		System.out.println("Фракції Верховної Ради");
		supremeCouncil.stream().forEach(n->	System.out.println(n.getName()));
		
	}

	
	public void getFraction(){
		String name = getFractionName();
		System.out.print("Фракція ");
		Optional<Fraction> findFirst = supremeCouncil.stream().filter(s->s.getName().equals(name)).findFirst();
		if (findFirst.isPresent()) {
			System.out.println(findFirst.get().getName());
		} else System.out.println("Такої фракції не знайдено");
		
	}
	
	public void addDeputy(){
		String name = getFractionName();
		Optional<Fraction> findFirst = supremeCouncil.stream().filter(s->s.getName().equals(name)).findFirst();
		if (findFirst.isPresent()) {
			findFirst.get().addDeputy();
		} else System.out.println("Такої фракції не знайдено");
	}
	
	
	public void deleteDeputy(){
		String name = getFractionName();
		Optional<Fraction> findFirst = supremeCouncil.stream().filter(s->s.getName().equals(name)).findFirst();
		if (findFirst.isPresent()) {
			findFirst.get().deleteDeputy();
		} else System.out.println("Такої фракції не знайдено");
	}
	
	
	public void getCorruptionist(){
		String name = getFractionName();
		System.out.println("Корупціонери з фракції "+name);
		supremeCouncil.stream().filter(s->s.getName().equals(name)).forEach(k->k.getCorruptionist());
	}
	
	
	
	public void getMostCorruptionist(){
		String name = getFractionName();
		System.out.println("Найбільший корупціонер з фракції "+name);
		Optional<Fraction> findFirst = supremeCouncil.stream().filter(s->s.getName().equals(name)).findFirst();
		if (findFirst.isPresent()) {
			findFirst.get().getMostCorruptionist();
		} else System.out.println("Такої фракції не знайдено");
	}	
	
	
	
	public void getAllDeputies(){
		String name = getFractionName();
		Optional<Fraction> findFirst = supremeCouncil.stream().filter(s->s.getName().equals(name)).findFirst();
		if (findFirst.isPresent()) {
			findFirst.get().getAllDeputies();
		} else System.out.println("Такої фракції не знайдено");
	}	
	
	public void initialisation () {
		supremeCouncil.add(new Fraction("one"));
		supremeCouncil.get(0).addDeputyInitial("Petrov", "Vasyl", 52, 98, 160, true, 975);
		supremeCouncil.get(0).addDeputyInitial("Azarov", "Ivan", 45, 75, 155, true, 1040);
		supremeCouncil.get(0).addDeputyInitial("Pravda", "Petro", 37, 85, 172, false, 0);
		supremeCouncil.get(0).addDeputyInitial("Val", "Igor", 51, 69, 167, true, 2045);
		supremeCouncil.add(new Fraction("two"));
		supremeCouncil.get(1).addDeputyInitial("Petrov2", "Vasyl", 52, 98, 160, true, 2975);
		supremeCouncil.get(1).addDeputyInitial("Azarov3", "Ivan", 45, 75, 155, true, 6040);
		supremeCouncil.get(1).addDeputyInitial("Pravda2", "Petro", 37, 85, 172, false, 0);
		supremeCouncil.get(1).addDeputyInitial("Val2", "Igor", 51, 69, 167, true, 4045);
		supremeCouncil.add(new Fraction("three"));
		supremeCouncil.add(new Fraction("four"));
		supremeCouncil.add(new Fraction("five"));
	}
	
}
