package stringexamples;

import java.util.Scanner;

class Demo {
	Scanner sc = new Scanner(System.in);
	
	//Question 1 Print the length of string  
	void findLenghtOfString() {
		System.out.println("Enter the Stringto find out the length");
		String str = sc.next();
		System.out.println("Lenght of String is " + str.length());
	}
	
	//Question 2 Convert the string to Lowercase / Uppercase and print it.

	void convertStringLowerCaseAndUppercase() {
		System.out.println("Enter String in lowercase"); 
		String lowerCaseString = sc.nextLine();
		System.out.println("Coversion Lowercase to Uppercase : " + lowerCaseString.toUpperCase());
		System.out.println("Enter String in Uppercase");
		String upperCaseString  = sc.nextLine();
		System.out.println("Coversion Uppercase to Lowercase : " + upperCaseString.toLowerCase());
}
	
	//Question 3 Print the string in reverse order without reverse()
	void stringReverseWithoutUsingReverse() {
		String reverseString="";
		System.out.println("Enter string do you want to reverse it");
		String str = sc.next();
		for (int i = 0; i < str.length(); i++) {
			reverseString = str.charAt(i) + reverseString;	
		}
		System.out.println("reverse string : " +reverseString);
	}
	
	void checkpalindromString() {
		String reverseString="";
		System.out.println("Enter string do you want to reverse it");
		String str = sc.next();
		for (int i = 0; i < str.length(); i++) {
			reverseString = str.charAt(i) + reverseString;	
		}
		if(str.equals(reverseString)) {
			System.out.println(str  + " is Palindrom String");
			
		}else {
			System.out.println(str  + " is  not Palindrom String");
		}
	}

}

public class StringExample {
	public static void main(String[] args) {
		Demo demo = new Demo();
		//demo.findLenghtOfString();
		//demo.convertStringLowerCaseAndUppercase();
		demo.stringReverseWithoutUsingReverse();
		
		demo.sc.close();
	}

}
