package Inheritance;

public class HierarchicalChildA extends HierarchicalParent {
	int c = 30;
	public void mul()
	{
		System.out.println("The multiplication result from HierarchicalChildA class is "+(c*b));
	}
	public static void main(String args[])
	{
		HierarchicalChildA obj1 = new HierarchicalChildA();
		obj1.mul();
		System.out.println("The value of a in HierarchalParaent class is "+obj1.a);
		System.out.println("Invoking the add method using object from HierarchicalChildA");
		obj1.add();
		System.out.println("*** End of code from HierarchicalChildA ***");
	}

}
