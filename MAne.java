package Day11;

import java.util.Scanner;

class Average{
	public void calculation(int mark1, int mark2) {
		int avg = (mark1 + mark2)/2;
		System.out.println("Average of marks : " + avg);
	}
}
public class MAne {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first subject marks : ");
		int sub1 = sc.nextInt();
		System.out.println("Enter second subject marks : ");
		int sub2 = sc.nextInt();
		
		Average av = new Average();
		av.calculation(sub1, sub2);
	}
}
