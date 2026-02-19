package Inheritance;

public class HierarchicalChildB extends HierarchicalParent {
double d = 45.0d;
public void div()
{
System.out.println("The division result from HierarchicalChildB is "+(d/a));	//a is from HierarchicalParent only 
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HierarchicalChildB obj2 = new HierarchicalChildB();
		obj2.div();
		System.out.println("Accessing the values of HierarchicalParent using HierarchicalChildB object is starts here ");
		System.out.println("The value of a from HierarchicalParent is "+obj2.a);
		System.out.println("The value of b from HierarchicalParent is "+obj2.b);
		System.out.println("Accessing the add method in HierarchicalChildB");
		obj2.add();
		System.out.println("*** End of code from HierarchicalChildB ***");
		

	}

}
