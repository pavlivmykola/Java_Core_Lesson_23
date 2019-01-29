package ua.lviv.lgs.lesson14.maximum;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		CommodityArrayList al = new CommodityArrayList();
		al.initialisation();
		while (true) {
			System.out.println("������ 1 ��� ������ �����");
			System.out.println("������ 2 ��� �������� �����");
			System.out.println("������ 3 ��� ������� �����");
			System.out.println("������ 4 ��� ��������� �� ������");
			System.out.println("������ 5 ��� ��������� �� ��������");
			System.out.println("������ 6 ��� ��������� �� �������");
			System.out.println("������ 7 ��� ��������� �� �����");
			System.out.println("������ 8 ��� ������� ������� ��������");
			System.out.println("������ ����� 8 ��� ����� � ��������");
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
