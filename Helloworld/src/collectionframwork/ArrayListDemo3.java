package collectionframwork;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo3 {

	public static void main(String[] args) {
		ArrayList<Student> student = new ArrayList<Student>();
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
				System.out.println("Enter name of student you want to add in the from of id name and std");
				int id = scan.nextInt();
				String name=scan.next();
				int std = scan.nextInt();
				student.add(new Student(id,name,std));
				
				break;		
			case 2:
				System.out.println("Enter student id you want to remove");
				int nametoremove=scan.nextInt();
				for (int i=0; i<student.size();i++) {
					if(student.get(i).getId() == nametoremove) {
						student.remove(i);
						System.out.println("Student Removed Sucessfully");
						
				}else {
					System.out.println("Student is not presentin this list");
				}
				}
				break;
			case 3:
				System.out.println("Enter student Name you want to serach");
				String nametofind = scan.next();
				for (int i=0; i<student.size();i++) {
					if(student.get(i).getStudentName().equals(nametofind) ) {
						System.out.println("Student is Present");
				}else {
					System.out.println("Student is not Present in this List");
				}
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


