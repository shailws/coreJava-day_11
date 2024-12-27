package Day11;

import java.util.Scanner;

class BankAccount{
	private String accountNumber;
	private int balance, add, debit;
	
	public void getdata() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter account number : ");
		accountNumber = sc.nextLine();
		System.out.println("Add sum amount in your account");
		add = sc.nextInt();
		System.out.println("Debit sum amount from your account");
		debit = sc.nextInt();
	}
	public void setdata() {
		int cuur_balance = add - debit;
		System.out.println("Current balance of your accout : " + cuur_balance);
	}
}
public class Bank {
	public static void main(String args[]) {
		BankAccount ba = new BankAccount();
		ba.getdata();
		ba.setdata();
	}
}
