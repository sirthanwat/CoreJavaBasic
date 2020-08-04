package stringsBasics;
//== is for data comparison but not for object comparison and here we are comparing object not data
public class StringBaseic4 {
	String str = "Aarti is the best girl";
	String str1 = "AARTI is the best girl";

	public void equals() {
		if (str.equals(str1))
			System.out.println("same");
		else
			System.out.println("No same");
	}

	public void equals1() {
		if (str.equalsIgnoreCase(str1))
			System.out.println("same");
		else
			System.out.println("No same");
	}
	//
	public void equals2() {
		if (str.toUpperCase().equals(str1.toUpperCase()))
			System.out.println("same");
		else
			System.out.println("No same");
	}
	public static void main(java.lang.String[] args) {
		StringBaseic4 str = new StringBaseic4();
		str.equals();
		str.equals1();
		str.equals2();
	}
}
