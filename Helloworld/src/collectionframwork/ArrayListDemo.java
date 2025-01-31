package collectionframwork;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {

	public static void main(String[] args) {
		System.out.println("Enter Student names ");
		Scanner sc = new Scanner(System.in);
		ArrayList arrayList = new ArrayList();
		for (int i = 0; i < 5; i++) {
			String studentName = sc.next();
			arrayList.add(studentName);
		}
		System.out.println(arrayList);
		System.out.println("Enter 0 for remove element");
		System.out.println("Enter 1 add element for specific location");
		System.out.println("Enter 2 add element for specific first location");
		System.out.println("Enter 3 add element for specific last location");
		System.out.println("Enter 4 add remove all");
		int choice = sc.nextInt();
		switch (choice) {

		case 0: {
			System.out.println("enter the index which you want to remove");
			int pos = sc.nextInt();
			arrayList.remove(pos);
			System.out.println(arrayList);
			break;
		}

		case 1: {
			System.out.println("enter the index which you want to add");
			int pos = sc.nextInt();
			arrayList.add(pos);
			System.out.println(arrayList);
			break;
		}

		case 2: {
			arrayList.addFirst("Fusion");
			System.out.println(arrayList);
			break;

		}

		case 3: {
			arrayList.addLast("Pune");
			System.out.println(arrayList);
			break;

		}
		case 4: {
			arrayList.addAll(arrayList);
		}

		}

	}

}
