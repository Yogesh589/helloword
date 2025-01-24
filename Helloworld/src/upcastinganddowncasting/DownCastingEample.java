package upcastinganddowncasting;

/*
 Downcasting means 
 Parent ---- > Child object  Conversion
*/
class DownCastingParent {
	String name;

	// A method which prints the data of the parent class
	void showMessage() {
		System.out.println("Parent method is called");
	}
}

// Child class   
class DownCastingChild extends DownCastingParent {
	int age;

	// Performing overriding
	@Override
	void showMessage() {
		System.out.println("Child method is called");
	}
}

public class DownCastingEample {
	public static void main(String[] args) {
		DownCastingParent p = new DownCastingChild();
		p.name = "Shubham";
		// Performing Downcasting Implicitly
		// Child c = new Parent(); // it gives compile-time error
		// Performing Downcasting Explicitly
		DownCastingChild c = (DownCastingChild) p;
		c.age = 18;
		System.out.println(c.name);
		System.out.println(c.age);
		c.showMessage();
	}

}
