package Basics.ConditionHandling;

import java.util.Scanner;

public class TableDoWhileLoop {

	//Exit control loop
	public void verifyInc(int a) {
		int i=1;
		do{		
			System.out.println(a +" "+ "*" +" " +i+ " " + "= "+a*i);
			i++;
		}while(i<=a);
		
	}
	public static void main(String[] args) {
		TableDoWhileLoop con = new TableDoWhileLoop();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the nth num :");
		int no = sc.nextInt();		
		con.verifyInc(no);
	}
}
