package keywords;

// Differentiate b/w local and global variable

public class This {

	 int i =10;//global
	 public void getInt()
	 {
		 int i =1000; //loacl
		 System.out.println(this.i);//will call global
	 }
	 public void getInt1()
	 {
		 int i =1000; //loacl
		 System.out.println(i);//will call loacl
	 }
	 
		static int j =20;//global
	 //if i want to assign local to  global 
	 public void getInt2(int j)
	 {
		 this.j = j;
		 System.out.println(j);//will call loacl
	 }
	 int k =20;
	 public void getInt3(int k)
	 {
		 this.j = k;
		 System.out.println(k);//will call loacl
	 }
	
	public static void main(String[] args) {
		This th = new This();
		th.getInt();
		th.getInt1();
		th.getInt2(j);//will take globle
		th.getInt3(100);//assigning local var
	}
}
