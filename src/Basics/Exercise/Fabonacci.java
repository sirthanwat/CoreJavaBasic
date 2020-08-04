//Perform fabonacci
package Basics.Exercise;

import java.util.Scanner;

public class Fabonacci {
	// 0, 1, 1, 2, 3, 5....
	public void fabonacciTest(int x) {
		int a = 0;
		int b = 1;
        int c = a+b;
		while (x > 0) {
			a = b;
			b = c;
			c = a + b;
			System.out.println("series...:" + a);
			x--;
		}
	}
	public static void main(String[] args) {
		Fabonacci ex = new Fabonacci();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the nth num :");
		int no = sc.nextInt();
		ex.fabonacciTest(no);
	}
}
