package Day11;

import java.util.Scanner;

class Rectangle{
	private double lenght, width, area;
	public void getdata() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter lenght of rectangle");
		lenght = sc.nextDouble();
		System.out.println("Enter width of rectangle");
		width = sc.nextDouble();
		 area = lenght * width;
	}
	public void setdata() {
		System.out.println("Area of rectangle : " + area);
	}
}
public class Areas_ {
	public static void main(String args[]) {
		Rectangle rc = new Rectangle();
		rc.getdata();
		rc.setdata();
	}
}
