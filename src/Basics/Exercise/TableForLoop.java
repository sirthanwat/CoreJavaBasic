//Print table but only disply no which are not multiple of 3, 5, 7 
package Basics.Exercise;

import java.util.Scanner;

public class TableForLoop {

	public void verifyInc(int a) {
		for (int i =1; i<= a; i++)
			if(!((a*i)%3==0 || (a*i)%3==5|| (a*i)%3==7))
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
