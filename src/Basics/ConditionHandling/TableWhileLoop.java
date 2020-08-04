package Basics.ConditionHandling;

import java.util.Scanner;

public class TableWhileLoop {

	//Entry control loop
	public void verifyInc(int a) {
		int i=1;
		while(i<a)
		{		
			System.out.println(a +" "+ "*" +" " +i+ " " + "= "+a*i);
			i++;
		}
	}

	public static void main(String[] args) {
		TableWhileLoop con = new TableWhileLoop();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the nth num :");
		int no = sc.nextInt();		
		con.verifyInc(no);
	}
}
