package stringsBasics;

//checking how many words in strings and identify duplicate word
public class Exersise8 {
	char str2;
	String str = "";

	public void reverse(String str1) {

		String arr[] = str1.split(" ");
		System.out.println(arr.length);
		for (int i = arr.length - 1; i >= 0; i--) {
			for (int j = 0; i > j; j++) {
				if (arr[i].equals(arr[j])) {
					int count = 1;
					count++;
					System.out.println(count);
					System.out.println(arr[i]);
					System.out.println(arr[j]);
				} else
					continue;
			}
		}
	}

	public static void main(java.lang.String[] args) {
		Exersise8 str = new Exersise8();
		str.reverse("hope you are fine how are you");
	}
}
