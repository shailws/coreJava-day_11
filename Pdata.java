package Day11;

import java.util.Scanner;

class Person{
	private String name, country;
	private int age;
//	private String country;
	
	public void getdata() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name of person: ");
		name = sc.nextLine();
		
		System.out.println("Enter name of country: ");
		country = sc.nextLine();
		
		System.out.println("Enter age of person: ");
		age = sc.nextInt();
	}
	public void setdata() {
		System.out.println("name of person : " + name);
		System.out.println("age of person : " + age);
		System.out.println("name of country : " + country);
	}
}

public class Pdata {
	public static void main(String args[]) {
		Person p = new Person();
		p.getdata();
		p.setdata();
	}
}
