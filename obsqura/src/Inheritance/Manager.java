package Inheritance;

public class Manager extends Employee {
String mngrName = "Sarat";
String department = "Technology & Engineering";
public void displayMangerDetails()
{
System.out.println("The manager name is "+mngrName);	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager mgr = new Manager();
		mgr.displayMangerDetails();
		System.out.println("The department is "+mgr.department);
		mgr.employeeDetails();
		mgr.personDetails();

	}

}
