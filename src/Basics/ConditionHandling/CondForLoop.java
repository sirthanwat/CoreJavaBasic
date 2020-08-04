package Basics.ConditionHandling;

import java.util.Scanner;

public class CondForLoop {

	public void verifyInc(int a) {
		for (int i =0; i< a; i++)
			System.out.println("Number print inc count :" +i);
	}
	public void verifyDec(int a) {
		for (int i=a; i > 0; i--)
			System.out.println("Number print dec count :" +i);
	}

	public static void main(String[] args) {
		CondForLoop con = new CondForLoop();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the nth num :");
		int no = sc.nextInt();		
		con.verifyInc(no);
		System.out.println("***********************");
		con.verifyDec(no);
	}
}
