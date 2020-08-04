package Basics.ConditionHandling;

import java.util.Scanner;

public class CondfElseIfElse {

	public void verify(int a) {
		if (a >0)
			System.out.print("Number is positive ");
		else if (a == 0)
			System.out.print("Number is zero ");
		else if (a < 0)
			System.out.print("Number is negative ");
		else 
			System.out.print("Number is odd ");
	}

	public static void main(String[] args) {
		CondfElseIfElse con = new CondfElseIfElse();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number :");
		int no = sc.nextInt();		
		con.verify(no);
	}
}
