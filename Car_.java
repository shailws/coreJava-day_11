package Day11;

import java.util.Scanner;

class Car{
	private String company_name, model_name;
	private int year, mileage;
	
	public void getdata() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter company name : ");
		company_name = sc.nextLine();
		System.out.println("Enter model name : ");
		model_name = sc.nextLine();
		System.out.println("Enter year : ");
		year = sc.nextInt();
		System.out.println("Enter milege : ");
		mileage = sc.nextInt();
	}
	public void setdata() {
		System.out.println("Company name : " + company_name);
		System.out.println("Model name : " + model_name);
		System.out.println("Year : " + year);
		System.out.println("Milage : " + mileage);
	}
}
public class Car_ {
	public static void main(String args[]) {
		Car c = new Car();
		c.getdata();
		c.setdata();
	}
}
