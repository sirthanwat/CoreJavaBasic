package Basics.ConditionHandling;

import java.util.Scanner;

public class TableForLoop {

	public void verifyInc(int a) {
		for (int i =1; i<= a; i++)
			System.out.println(a +" "+ "*" +" " +i+ " " + "= "+a*i);
	}

	public static void main(String[] args) {
		TableForLoop con = new TableForLoop();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the nth num :");
		int no = sc.nextInt();		
		con.verifyInc(no);
	}
}
