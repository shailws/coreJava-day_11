package Day11;

import java.util.Scanner;

class Circle{
	private double radius;
	Scanner sc = new Scanner(System.in);
	public void getdata() {
		System.out.println("Enter radius of circle");
		radius = sc.nextDouble();
	}
	public double calculateArea() {
		double area = 3.14 * radius * radius;
		return area;
	}
	public double calculateCircuference() {
			double peri = 2*3.14 *radius;
			return peri;
	}
	public void display() {
		System.out.println("Area of circle : " + calculateArea());
		System.out.println("Perimeter of circle : " + calculateCircuference());
	}
}
public class Circle_ {
	public static void main(String args[]) {
		Circle cr = new Circle();
		cr.getdata();
		cr.calculateArea();
		cr.calculateCircuference();
		cr.display();
	}
}
