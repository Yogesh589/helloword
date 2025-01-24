package interfacedemo;

import java.util.Scanner;

// Interface demo
interface Shape {
	float PI = 3.142f; // static and final

	void acceptInput(); // public and abstract

	void area();

	void displayResult();
}

class Circle implements Shape {
	float r, a;

	public void acceptInput() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter radius");
		r = scan.nextFloat();
	}

	public void area() {
		a = PI * r * r;
	}

	public void displayResult() {
		System.out.println("areas of a circle is : " + r);
	}
}

class Rectangle implements Shape {
	float area, a, b;

	public void acceptInput() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter length and height");
		a = scan.nextInt();
		b = scan.nextInt();
	}

	public void area() {
		area = a * b;
	}

	public void displayResult() {
		System.out.println("areas of a Rectangle is : " + area);
	}
}

class Square implements Shape {
	float side, a;

	public void acceptInput() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter side");
		side = scan.nextInt();
	}

	public void area() {
		a = side * side;
	}

	public void displayResult() {
		System.out.println("areas of a square is : " + a);
	}
}

class Calculation {
	static void permit(Shape c) {
		c.acceptInput();
		c.area();
		c.displayResult();
	}
}

public class InterfaceDemo {
	public static void main(String[] args) {
		Calculation.permit(new Circle());
		Calculation.permit(new Square());
		Calculation.permit(new Rectangle());
	}
}
