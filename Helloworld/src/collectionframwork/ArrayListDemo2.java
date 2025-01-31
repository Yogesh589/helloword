package collectionframwork;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo2 {
	public static void main(String[] args) {
		ArrayList student = new ArrayList();
		System.out.println("Welcome");
		Scanner scan = new Scanner(System.in);
		int choice=0;
		do{		
			System.out.println("Enter 1 to add student");
			System.out.println("Enter 2 to remove student");
			System.out.println("Enter 3 to check student");
			System.out.println("Enter 4 to list all the  students");
			System.out.println("Enter 5 to exit");
			choice =scan.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter name of studenmt you want to add");
				String name=scan.next();
				student.add(name);
				break;		
			case 2:
				System.out.println("Enter student you want to remove");
				String nametoremove=scan.next();
				if(student.contains(nametoremove)) {
					student.remove(nametoremove);
					System.out.println(nametoremove + "is removed");
				}else {
					System.out.println(nametoremove+" Not Present");
				}
				break;
			case 3:
				System.out.println("Enter student you want to serach");
				String nametofind=scan.next();
				if(student.contains(nametofind)) {
					System.out.println(nametofind+ " is Present in class");
				}else {
					System.out.println(nametofind+" Not Present");
				}
				break;
			case 4:
				System.out.println(student);
				break;
			case 5:
				System.out.println("Thank you");
			}	
		}while(choice!=5);

		}
	}

