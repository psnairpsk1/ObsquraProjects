package Inheritance;

public class SuperCar extends SuperVehicle {

	public void display()
	{
		System.out.println(super.speed);
		super.print();
	}
	public SuperCar()
	{
		super();//this should be in the first line of code.
		System.out.println("SuperCar constructor");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperCar sc = new SuperCar();
		sc.display();

	}
	


}
