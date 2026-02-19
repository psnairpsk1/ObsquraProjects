package Inheritance;

public class MultiLevelChild extends MultiLevelParent {

	public void mul()
	{
		int i = 10;
		int k = 20;
		System.out.println(k*i);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiLevelChild ch = new MultiLevelChild();
		ch.mul();
		ch.display();
		System.out.println(ch.p);
		System.out.println(ch.s);
		ch.sub();

	}

}
