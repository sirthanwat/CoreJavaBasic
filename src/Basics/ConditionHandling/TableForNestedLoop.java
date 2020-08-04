package Basics.ConditionHandling;

import java.util.Scanner;

public class TableForNestedLoop {

	//for each iteration i , j will be iterate till the condition meet. 
	//eg i= 1, j will run 5 times
	public void verifyInc(int a) {
		for (int i = 1; i <= a; i++) 
			for (int j = 1; j < a; j++)
				System.out.print(j);
		System.out.println("\n");
	}

	public static void main(String[] args) {
		TableForNestedLoop con = new TableForNestedLoop();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the nth num :");
		int no = sc.nextInt();
		con.verifyInc(no);
	}
}
