package ua.lviv.lgs.lesson14.maximum;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		CommodityArrayList al = new CommodityArrayList();
		al.initialisation();
		while (true) {
			System.out.println("¬вед≥ть 1 щоб додати товар");
			System.out.println("¬вед≥ть 2 щоб видалити товар");
			System.out.println("¬вед≥ть 3 щоб зам≥нити товар");
			System.out.println("¬вед≥ть 4 щоб сортувати за назвою");
			System.out.println("¬вед≥ть 5 щоб сортувати за довжиною");
			System.out.println("¬вед≥ть 6 щоб сортувати за шириною");
			System.out.println("¬вед≥ть 7 щоб сортувати за вагою");
			System.out.println("¬вед≥ть 8 щоб вивести елемент колекц≥њ");
			System.out.println("¬вед≥ть б≥льше 8 щоб вийти з програми");
			Scanner sc = new Scanner(System.in);
			int i = sc.nextInt();
			switch (i) {
			case 1:
				al.addCommodity();
				break;
			case 2:
				al.deleteCommodity();
				break;
			case 3:
				al.changeCommodity();
				break;
			case 4:
				al.sortByName();
				break;
			case 5:
				al.sortByLength();
				break;
			case 6:
				al.sortByWidth();
				break;
			case 7:
				al.sortByWeight();
				break;
			case 8:
				al.getElement();
				break;
			default:
				System.exit(0);
			}
		}

	}

}
