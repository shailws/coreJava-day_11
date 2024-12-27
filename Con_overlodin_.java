package Day11;

import java.util.Scanner;

class Student{
	
	public Student() {
		System.out.println("It is a default constructor");
	}
	
	public Student(String schoole, String city, int pin) {
		System.out.println("Name of shcoole : " + schoole);
		System.out.println("Name of city : " + city);
		System.out.println("Pin code of city : " + pin);
	}
}
public class Con_overlodin_ {
	public static void main(String args[]) {
		Student st1 = new Student();
		Student st2 = new Student("ecti", "risod", 444506);
	}
}
