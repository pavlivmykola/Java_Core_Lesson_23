package ua.lviv.lgs.lesson13;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		SupremeCouncil.getInstance().initialisation();
		boolean run = true;
		while (run) {		
			System.out.println();
			System.out.println("������ 1 ��� ������ �������");
			System.out.println("������ 2 ��� �������� ��������� �������");
			System.out.println("������ 3 ��� ������� ��  �������");
			System.out.println("������ 4 ��� �������� ��������� �������");
			System.out.println("������ 5 ��� ������� ��������� �������");
			System.out.println("������ 6 ��� ������ �������� � �������");
			System.out.println("������ 7 ��� �������� �������� � �������");
			System.out.println("������ 8 ��� ������� ������ ���������");
			System.out.println("������ 9 ��� ������� ���������� ���������");
		
			Scanner sc = new Scanner(System.in);
			int i = sc.nextInt();
			
			switch (i) {
			case 1:
				SupremeCouncil.getInstance().addFraction();
				break;
			case 2:
				SupremeCouncil.getInstance().deleteFraction();
				break;
			case 3:
				SupremeCouncil.getInstance().getAllFractions();
				break;
			case 4:
				SupremeCouncil.getInstance().clearFraction();
				break;
			case 5:
				SupremeCouncil.getInstance().getFraction();
				break;
			case 6:
				SupremeCouncil.getInstance().addDeputy();
				break;
			case 7:
				SupremeCouncil.getInstance().deleteDeputy();
				break;
			case 8:
				SupremeCouncil.getInstance().getCorruptionist();
				break;
			case 9:
				SupremeCouncil.getInstance().getMostCorruptionist();
				break;
			default: run=false;
			}
		}

	}

}
