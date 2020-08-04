//Perform ractangle pattern
package Basics.Exercise;

public class PatternRactangle {
	// 2, 3, 5, 7, 11....
	int i;
	int temp = 0;

	public void ractPattern() {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 6; j++) {
				System.out.print("*");
			}
			System.out.println("\n");
		}
	}

	public static void main(String[] args) {
		PatternRactangle ex = new PatternRactangle();
		ex.ractPattern();
	}
}

// Note : i = 4, j= 6 output :
/*
 * ****** 
 * ****** 
 * ****** 
 * ******
 */