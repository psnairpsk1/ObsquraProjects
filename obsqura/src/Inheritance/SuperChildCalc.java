package Inheritance;

public class SuperChildCalc extends SuperCalc {

	public SuperChildCalc(int e, int f) {
		super(e, f);
		System.out.println("The multiplication result from SuperChildCalc is "+ (e *  f));

		// TODO Auto-generated constructor stub
	}
	
	public void mul()
	{
		System.out.println("Acceesing the variable a and b from SuperCalc Class");
		System.out.println("The Multiplication Result Is "+(super.a * super.b));
		System.out.println("The division result is "  +(super.a /10 ));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperChildCalc ob = new SuperChildCalc(30,500);
		ob.mul();
		SuperChildCalc ob2 = new SuperChildCalc(60,50);
		ob2.add();
		
	}

}
