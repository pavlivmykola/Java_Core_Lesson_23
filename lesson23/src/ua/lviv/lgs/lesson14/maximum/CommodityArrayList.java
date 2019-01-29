package ua.lviv.lgs.lesson14.maximum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Optional;
import java.util.Scanner;

import ua.lviv.lgs.lesson14.minimum.Car;

public class CommodityArrayList {
	ArrayList<Commodity> commodityList = new ArrayList();
	
	public void initialisation() {
		commodityList.add(new Commodity("товар1", 17, 49, 17.5));
		commodityList.add(new Commodity("товар2", 27, 55, 21.4));
		commodityList.add(new Commodity("товар3", 39, 34, 11.8));
		commodityList.add(new Commodity("товар4", 42, 22, 97.4));
		commodityList.add(new Commodity("товар5", 55, 64, 58.8));
		commodityList.add(new Commodity("товар6", 68, 46, 64.7));
		commodityList.add(new Commodity("товар7", 93, 49, 22.7));
		commodityList.add(new Commodity("товар8", 11, 98, 38.1));
		commodityList.add(new Commodity("товар9", 24, 82, 92.8));
		commodityList.add(new Commodity("товар10", 85, 48, 81.5));
		commodityList.add(new Commodity("товар11", 67, 69, 68.4));
		commodityList.add(new Commodity("товар12", 35, 74, 49.7));
	}
	
	public void addCommodity() {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("¬водимо новий товар");
		System.out.println("¬вед≥ть назву товару");
		String name = sc.nextLine();
		System.out.println("¬вед≥ть довжину товару");
		int length = sc.nextInt();
		System.out.println("¬вед≥ть ширину товару");
		int width = sc.nextInt();
		System.out.println("¬вед≥ть вагу товару");
		double weight = sc.nextDouble();
		commodityList.add(new Commodity(name,length,width, weight));
		System.out.println(commodityList);
	}

	public void deleteCommodity() {
		Scanner sc = new Scanner(System.in);
		System.out.println("¬идал€Їмо товар");
		System.out.println("¬вед≥ть назву товару");
		String name = sc.nextLine();
		System.out.println("¬вед≥ть довжину товару");
		int length = sc.nextInt();
		System.out.println("¬вед≥ть ширину товару");
		int width = sc.nextInt();
		System.out.println("¬вед≥ть вагу товару");
		double weight = sc.nextDouble();
		Optional<Commodity> findFirst = commodityList.stream()
				.filter(c->c.getName().equals(name))
				.filter(c->c.getLength()==length)
				.filter(c->c.getWidth()==width)
				.filter(c->c.getWeight()==weight)
				.findFirst();
		if (findFirst.isPresent()) {
			commodityList.remove(findFirst.get());
			System.out.println("“овар видалено");
			System.out.println(commodityList);
		}
	}
	

	public void changeCommodity() {
		Scanner sc = new Scanner(System.in);
		System.out.println("«м≥нюЇмо товар");
		System.out.println("¬вед≥ть стару назву товару");
		String oldName = sc.nextLine();
		System.out.println("¬вед≥ть стару довжину товару");
		int oldLength = sc.nextInt();
		System.out.println("¬вед≥ть стару ширину товару");
		int oldWidth = sc.nextInt();
		System.out.println("¬вед≥ть стару вагу товару");
		double oldWeight = sc.nextDouble();
		System.out.println("¬вед≥ть нову назву товару");
		String newName = sc.next();
		System.out.println("¬вед≥ть нову довжину товару");
		int newLength = sc.nextInt();
		System.out.println("¬вед≥ть нову ширину товару");
		int newWidth = sc.nextInt();
		System.out.println("¬вед≥ть нову вагу товару");
		double newWeight = sc.nextDouble();

		Optional<Commodity> findFirst = commodityList.stream()
				.filter(c->c.getName().equals(oldName))
				.filter(c->c.getLength()==oldLength)
				.filter(c->c.getWidth()==oldWidth)
				.filter(c->c.getWeight()==oldWeight)
				.findFirst();
		if (findFirst.isPresent()) {
			Commodity commodity = new Commodity();
			commodity =	findFirst.get();
			commodity.setName(newName);
			commodity.setLength(newLength);
			commodity.setWidth(newWidth);
			commodity.setWeight(newWeight);
		}
		System.out.println(commodityList);
	}
	
	
	
	public void sortByName() {
		Comparator<Commodity> comparator = Comparator.comparing( Commodity::getName);
		commodityList.stream().sorted(comparator).forEach(System.out::println);
	}

	
	public void sortByLength() {
		Comparator<Commodity> comparator = Comparator.comparing( Commodity::getLength);
		commodityList.stream().sorted(comparator).forEach(System.out::println);
	}
	
	public void sortByWidth() {
		Comparator<Commodity> comparator = Comparator.comparing( Commodity::getWidth);
		commodityList.stream().sorted(comparator).forEach(System.out::println);
	}

	
	public void sortByWeight() {
		Comparator<Commodity> comparator = Comparator.comparing( Commodity::getWeight);
		commodityList.stream().sorted(comparator).forEach(System.out::println);
	}
	
	
	public void getElement() {
		Scanner sc = new Scanner(System.in);
		System.out.println("¬вед≥ть ≥ндекс елемента колекц≥њ в≥д 0 до "+(commodityList.size()-1));
		int i = sc.nextInt();
		if (i>(commodityList.size()-1)) {
			System.out.println("¬ведений ≥ндекс поза межами колекц≥њ");
		} else {
			System.out.println(i+" елемент колекц≥њ "+commodityList.get(i));
		}
	}
	
}
