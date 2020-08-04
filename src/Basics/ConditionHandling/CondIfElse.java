package Basics.ConditionHandling;

import java.util.Scanner;

public class CondIfElse {

	public void verify(int a) {
		if (a % 2 == 0)
			System.out.print("Number is even ");
		else 
			System.out.print("Number is odd ");
	}

	public static void main(String[] args) {
		CondIfElse con = new CondIfElse();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number :");
		int no = sc.nextInt();		
		con.verify(no);
	}
}
