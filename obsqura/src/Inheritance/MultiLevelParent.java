package Inheritance;

public class MultiLevelParent extends MultiLevelGrandParent {

	String p = "You are accessing the variable from parent class";
	public void display()
	{
		System.out.println("You acceessed the instance methode of parent class");
		System.out.println(ss);
	}

}
