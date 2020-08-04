package Basics.ConditionHandling;

import java.util.Scanner;

public class CondNested {

	public void verify(int a) {
		if (a > 0) {
			if (a % 3 == 0 && a % 4 == 0)
				System.out.print("Number is divisible by 3 and 4 ");
			else if (a % 3 == 0 || a % 4 == 0)
				System.out.print("Number is divisible by 3 only ");
			else
				System.out.print("Number is not divisible ");
		}
		else
			System.out.print("Number is negative ");
	}

	public static void main(String[] args) {
		CondNested con = new CondNested();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number :");
		int no = sc.nextInt();
		con.verify(no);
	}
}
