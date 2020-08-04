package Basics.SubPkg;

import stringsBasics.StringBaseic;

public class StaticProg {
   static int x=10; 
	
	public static void add() {
		//static  int a = 1;// inside method static varible cant define so use final 
		final  int a = 1;
		int b = 2;
		System.out.println(a + b);
		System.out.println("x value inside add method " + x++); //10
		//System.out.println("x value inside add method " + ++x); //11
	}	
	
	public static void sub() {
		final  int a = 1;
		int b = 2;
		System.out.println(a - b);
		System.out.println("x value inside sub method " + x++); //10
	}	

	public static void main(StringBaseic args[]) {
		StaticProg.add();
		System.out.println("x value outside method " +x);//10
		
		StaticProg.sub();
		
		StaticProg obj = new StaticProg();
		System.out.println("x value using object " +obj.x);//10
	}
}