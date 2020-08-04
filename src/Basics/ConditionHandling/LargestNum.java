package Basics.ConditionHandling;

import java.util.Scanner;

public class LargestNum {

	public void largestTestNum(int a, int b, int c)
	{
		if(a > b && a > c)
		{
			System.out.print("a is the largest num :" +a);
		}
		else if(a > b && a < c)
		{
			System.out.print("c is the largest num :" +c);
		}
		else if(b>c)
		{
			System.out.print("b is the largest num :" +b);
		}
		else 
			System.out.print("c is the largest num :" +c);
	}
	public static void main(String[] args) {
		LargestNum ln= new LargestNum();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the nums :");
		int x= sc.nextInt();
		int y= sc.nextInt();
		int z= sc.nextInt();
		//ln.largestTestNum(12, 13, 14);
		ln.largestTestNum(x, y, z);		
	}
}
