//Perform prime no : divisible by 1 or itself
package Basics.Exercise;

import java.util.Scanner;

public class PrimeNum {
	// 2, 3, 5, 7, 11....
	int i;
	int temp =0;
	public void primeNumTest(int x) {
		if (x == 2)
			System.out.println("its  prime no..");		
		else {
			for (i = 2; i <= x-1; i++){
				if (x % i == 0) {
					temp++;
					break;
				}
			}
			if(temp>0)
				System.out.println("No is not prime...:");
			else
				System.out.println("No is prime...:");
		}
		
	}
	public static void main(String[] args) {
		PrimeNum ex = new PrimeNum();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the nth num :");
		int no = sc.nextInt();
		ex.primeNumTest(no);
	}
}
