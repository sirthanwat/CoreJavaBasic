package stringsBasics;

//concate string without spaces 
public class Exersise9 {
	char str2;
	String str = "";

	public void concate(String str1) {

		String arr[] = str1.trim().split(" ");
		for (int i = 0; i <= arr.length - 1; i++) {
			String str = "";
			str = str + arr[i];
			System.out.print(str.toString());
		}
	}

	public static void main(java.lang.String[] args) {
		Exersise9 str = new Exersise9();
		str.concate(" hope you are fine   ");
	}
}
