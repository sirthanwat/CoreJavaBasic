//Perform calculation (2+8)*(2+5+7)
package Basics.Exercise;

public class Exercise2 {
	
	public int addTwo(int a, int b)
	{
		System.out.println(a+b);
		return (a+b);
	}	
	public int addThree(int a, int b, int c)
	{
		System.out.println(a+b+c);
		return (a+b+c);
	}
	public void mul(int a, int b)
	{
		System.out.println(a*b);
	}
	public static void main(String[] args) {
		Exercise2 ex = new Exercise2();
		int x= ex.addTwo(2, 8);
		int y= ex.addThree(2, 5, 7);
		ex.mul(x, y);
	}
}
