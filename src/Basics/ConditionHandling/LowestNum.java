package Basics.ConditionHandling;

import java.util.Scanner;

public class LowestNum {

	public void largestTestNum(int a, int b, int c)
	{
		if(a < b && a < c)
		{
			System.out.print("a is the lowest num :" +a);
		}
		else if(a < b && a > c)
		{
			System.out.print("c is the lowest num :" +c);
		}
		else if(b<c)
		{
			System.out.print("b is the lowest num :" +b);
		}
		else 
			System.out.print("c is the lowest num :" +c);
	}
	public static void main(String[] args) {
		LowestNum ln= new LowestNum();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the nums :");
		int x= sc.nextInt();
		int y= sc.nextInt();
		int z= sc.nextInt();
		//ln.largestTestNum(12, 13, 14);
		ln.largestTestNum(x, y, z);		
	}
}
