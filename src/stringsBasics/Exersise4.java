package stringsBasics;

//comparing string with out leading and trailing spaces
public class Exersise4 {

	public void checkingSubstring(String str1, String str2) {
		if (str1.trim().equalsIgnoreCase(str2.trim())) {
			System.out.println("same");
		} else
			System.out.println("not same");
	}

	public static void main(java.lang.String[] args) {
		Exersise4 str = new Exersise4();
		str.checkingSubstring("hello ", " hellO");
	}
}
