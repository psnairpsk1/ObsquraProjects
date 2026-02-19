package Inheritance;

public class SuperChild extends SuperParent {
    String s="Hi";
	public void print()
	
	{
		super.display();
		System.out.println(super.s);
		System.out.println("This is a Child Class");
		
	}
	
	public SuperChild()
	{
		super();
		System.out.println("This is a child class constructor");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperChild obj = new  SuperChild();
		obj.print();
		//System.out.println(.s);

	}

}
