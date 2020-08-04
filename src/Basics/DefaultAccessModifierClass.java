package Basics;

//Access modifier
//class is created public and default but not protected and private
//if class is public then all access modifier is not impacted it will be same
//if class is default then access modifier method is impacted 

class DefaultAccessModifierClass{
	
	// will access throughout the project
	public void testPublic() {
		System.out.println("using public ");
	}	
	
	
	//will not be visible , access within class only
	private void testPrivate() {
		System.out.println("using private ");
	}	
	
	// within same pkg only it will be accessible
	void testDefault() {
		System.out.println("using default ");
	}
	
	// within same pkg and sub pkg it will be accessible
	protected void testProtected() {
		System.out.println("using protected ");
	}
}