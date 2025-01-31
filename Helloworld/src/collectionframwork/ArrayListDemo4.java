package collectionframwork;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo4 {

	public static void main(String[] args) {
		ArrayList<Employee> employeelist = new ArrayList<Employee>();
		int choice = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("!!!!!!!!! Employee Management System!!!!!!!!!");
		do {
			System.out.println("Enter 1 to add Employee");
			System.out.println("Enter 2 to remove Employee");
			System.out.println("Enter 3 to Update Emloyee");
			System.out.println("Enter 4 to Search/Find Employee");
			System.out.println("Enter 5 to see All Employee");
			System.out.println("Enter 6 to exit Application");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter Employee id ,name , salaray");
				int id = sc.nextInt();
				String name = sc.next();
				double salary = sc.nextDouble();
				employeelist.add(new Employee(id, name, salary));
				break;

			case 2:
				System.out.println("Enter Employee id  to remove");
				int removeId = sc.nextInt();
				for (int i = 0; i < employeelist.size(); i++) {
					if (employeelist.get(i).getEmpId() == removeId) {
						employeelist.remove(i);
					} else {
						System.out.println("Employee id is not fount in list!!!!!");
					}
				}

				break;

			case 3:
				System.out.println("Enter Employee id to Update");
				int updateId = sc.nextInt();
				for (int i = 0; i < employeelist.size(); i++) {
					if (employeelist.get(i).getEmpId() == updateId) {
						employeelist.set(i,new Employee(2002,"Prashant",79000.00));
						System.out.println("Update Empoyee Data Scuessfully");
					} else {
						System.out.println("id is invalid !!!!!");
					}
				}
				break;

			case 4:
				System.out.println("Enter Employee id to search the employee");
				int searchId = sc.nextInt();
				for (int i = 0; i < employeelist.size(); i++) {
					if (employeelist.get(i).getEmpId() == searchId) {
						System.out.println("Employee is Presnet with is for this is "+employeelist.get(i).getEmpName());
					} else {
						System.out.println("Employee is not Found in this list");
					}
				}
				break;

			case 5:
				System.out.println(employeelist);

				break;
			

			case 6:
				System.out.println("Thank You");
			}
		} while (choice != 6);
		sc.close();
	}
}
