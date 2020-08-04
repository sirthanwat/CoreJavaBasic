package stringsBasics;

//concat strings and getting lenght
public class Exersise7 {
	char str2;
	String str = "";

	public void reverse(String str1, String str2) {

		System.out.println("concat :" + str1.concat(str2));
		System.out.println("concat lenght :" + str1.concat(str2).length());

	}

	public static void main(java.lang.String[] args) {
		Exersise7 str = new Exersise7();
		str.reverse("ara", "hi");
	}
}
