package Basics;

class A {
	static int a = 40;// non static
	int x;
	int y = 2;
	// final static int b1;//must be initialize
	final static int b = 100;

	/*
	 * 1. without static keyword : Error: Main method is not static in class
	 * Program.A, please define the main method as: public static void
	 * main(String[] args) .
	 * 
	 * 2. change name of main method like main1: Error: Main
	 * method not found in class Program.A, please define the main method as:
	 * public static void main(String[] args) or a JavaFX application class must
	 * extend javafx.application.Application
	 * 
	 * 
	 */

	public static void main(String args[]) {
		System.out.println(a);
		System.out.println(b);

	}
}