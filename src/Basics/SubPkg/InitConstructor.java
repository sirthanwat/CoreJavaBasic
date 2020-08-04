package Basics.SubPkg;

import stringsBasics.StringBaseic;

public class InitConstructor {
   
	public  InitConstructor() {		
		System.out.println("Launch browser");// define the initialization method , this will called by every test cases
	}	
		
	public void login() {
		//System.out.println("Launch browser");
		System.out.println("login"); 
	}	
	
	public void registration() {
		//System.out.println("Launch browser");
		System.out.println("registration");
	}
	
	public void withdraw() {
		//System.out.println("Launch browser");
		System.out.println("withdraw");
	}

	public static void main(StringBaseic args[]) {		
		InitConstructor obj = new InitConstructor();
		obj.login();
		obj.registration();
		obj.withdraw();
	}
}