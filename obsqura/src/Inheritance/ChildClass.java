package Inheritance;

public class ChildClass extends ParentClass{
	//String s = "hi";
	public void print()
	{
		System.out.println("This is a child class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClass ob = new ChildClass();
		ob.print();
		ob.add();
		//System.out.println(ob.s);
		System.out.println(ob.s);
		//creating a parent class object
		ParentClass obj = new ParentClass();
		obj.add();
		System.out.println(obj.s);
		//obj.print();

	}

}
