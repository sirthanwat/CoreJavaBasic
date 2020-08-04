package keywords;

// Differentiate b/w local and global variable
//we can access our own class members

public class This1 {

	int i = 10;
	public void getData() {
		System.out.println("getting data ...");// will call loacl
	}
	
	public void getDataBythis() {
		this.getData();
		System.out.println("getting int ..." +this.i);
	}

	public static void main(String[] args) {
		This1 th = new This1();

		th.getDataBythis();
	}
}
