package Basics.SubPkg;

import java.util.Scanner;

import stringsBasics.StringBaseic;

public class TakeDataRunTime {   	
	
	public void sub(int a, int b) {
		System.out.println("Value is :" +(a - b));
	}	

	public static void main(StringBaseic args[]) {			
		TakeDataRunTime obj = new TakeDataRunTime();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a");
		int a = sc.nextInt();
		System.out.println("Enter b");
		int b = sc.nextInt();//for int
		obj.sub(a, b);
		//String
		System.out.println("Enter string");
		String str = sc.next();//for string
		System.out.println("Enter str value :" +str);
		
		int y = Integer.parseInt(str);//converting string to int
		System.out.println("Enter str value :" +(y+10));		
	}
}