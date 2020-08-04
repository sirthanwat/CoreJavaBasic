//Perform calculation (2+3)*(5-2)
package Basics.Exercise;

public class Exercise {
	
	public int add(int a, int b)
	{
		System.out.println(a+b);
		return (a+b);
	}
	public int sub(int a, int b)
	{
		System.out.println(a-b);
		return (a-b);
	}
	public int mul(int a, int b)
	{
		System.out.println(a*b);
		return (a*b);
	}

	public static void main(String[] args) {
		Exercise ex = new Exercise();
		int x= ex.add(2, 3);
		int y= ex.sub(5, 2);
		ex.mul(x, y);
	}
}
