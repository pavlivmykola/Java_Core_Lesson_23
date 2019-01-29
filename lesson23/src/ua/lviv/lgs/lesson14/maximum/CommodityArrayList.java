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
		commodityList.add(new Commodity("�����1", 17, 49, 17.5));
		commodityList.add(new Commodity("�����2", 27, 55, 21.4));
		commodityList.add(new Commodity("�����3", 39, 34, 11.8));
		commodityList.add(new Commodity("�����4", 42, 22, 97.4));
		commodityList.add(new Commodity("�����5", 55, 64, 58.8));
		commodityList.add(new Commodity("�����6", 68, 46, 64.7));
		commodityList.add(new Commodity("�����7", 93, 49, 22.7));
		commodityList.add(new Commodity("�����8", 11, 98, 38.1));
		commodityList.add(new Commodity("�����9", 24, 82, 92.8));
		commodityList.add(new Commodity("�����10", 85, 48, 81.5));
		commodityList.add(new Commodity("�����11", 67, 69, 68.4));
		commodityList.add(new Commodity("�����12", 35, 74, 49.7));
	}
	
	public void addCommodity() {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("������� ����� �����");
		System.out.println("������ ����� ������");
		String name = sc.nextLine();
		System.out.println("������ ������� ������");
		int length = sc.nextInt();
		System.out.println("������ ������ ������");
		int width = sc.nextInt();
		System.out.println("������ ���� ������");
		double weight = sc.nextDouble();
		commodityList.add(new Commodity(name,length,width, weight));
		System.out.println(commodityList);
	}

	public void deleteCommodity() {
		Scanner sc = new Scanner(System.in);
		System.out.println("��������� �����");
		System.out.println("������ ����� ������");
		String name = sc.nextLine();
		System.out.println("������ ������� ������");
		int length = sc.nextInt();
		System.out.println("������ ������ ������");
		int width = sc.nextInt();
		System.out.println("������ ���� ������");
		double weight = sc.nextDouble();
		Optional<Commodity> findFirst = commodityList.stream()
				.filter(c->c.getName().equals(name))
				.filter(c->c.getLength()==length)
				.filter(c->c.getWidth()==width)
				.filter(c->c.getWeight()==weight)
				.findFirst();
		if (findFirst.isPresent()) {
			commodityList.remove(findFirst.get());
			System.out.println("����� ��������");
			System.out.println(commodityList);
		}
	}
	

	public void changeCommodity() {
		Scanner sc = new Scanner(System.in);
		System.out.println("������� �����");
		System.out.println("������ ����� ����� ������");
		String oldName = sc.nextLine();
		System.out.println("������ ����� ������� ������");
		int oldLength = sc.nextInt();
		System.out.println("������ ����� ������ ������");
		int oldWidth = sc.nextInt();
		System.out.println("������ ����� ���� ������");
		double oldWeight = sc.nextDouble();
		System.out.println("������ ���� ����� ������");
		String newName = sc.next();
		System.out.println("������ ���� ������� ������");
		int newLength = sc.nextInt();
		System.out.println("������ ���� ������ ������");
		int newWidth = sc.nextInt();
		System.out.println("������ ���� ���� ������");
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
		System.out.println("������ ������ �������� �������� �� 0 �� "+(commodityList.size()-1));
		int i = sc.nextInt();
		if (i>(commodityList.size()-1)) {
			System.out.println("�������� ������ ���� ������ ��������");
		} else {
			System.out.println(i+" ������� �������� "+commodityList.get(i));
		}
	}
	
}
