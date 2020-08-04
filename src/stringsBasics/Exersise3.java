package stringsBasics;

//checking string exist in another string if yes then how many time
public class Exersise3 {

	public void checkingSubstring(String str1, String str2) {
		if (str1.contains(str2)) {
			int sLen = str1.length();
			System.out.println("Actual lenght " + sLen);
			System.out.println(str1.replace(str2, ""));
			int slen1 = str1.replace(str2, "").length();
			System.out.println("After romoving substr lenght " + slen1);
			//
			System.out.println((sLen - slen1) / str2.length());
			// (actual len- lenght withour substring)/substring lenght
		}
		else
			System.out.println("Sub string not present");
	}

	public static void main(java.lang.String[] args) {
		Exersise3 str = new Exersise3();
		str.checkingSubstring("hello how are you hello, you are hello fine", "you");
	}
}
