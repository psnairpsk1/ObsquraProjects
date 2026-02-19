package Inheritance;

public class Employee extends Person {
int empId = 21;
String empSalary = "10 LPA";
public void employeeDetails()
{
System.out.println("The name of employee is "+name);
System.out.println("The employee id is "+empId);
System.out.println("The employee salary is "+empSalary);
}
}
