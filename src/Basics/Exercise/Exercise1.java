//Perform calculation square 2 + square 5
package Basics.Exercise;

public class Exercise1 {
	
	public int add(int a, int b)
	{
		System.out.println(a+b);
		return (a+b);
	}	
	public int square(int a)
	{
		System.out.println(a*a);
		return (a*a);
	}
	public static void main(String[] args) {
		Exercise1 ex = new Exercise1();
		int x= ex.square(2);
		int y= ex.square(5);
		ex.add(x, y);
	}
}
