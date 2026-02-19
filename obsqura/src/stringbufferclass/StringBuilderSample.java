package stringbufferclass;

public class StringBuilderSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder ob = new StringBuilder("Hello");
		System.out.println(ob);
		
		//append()
		ob.append("World");
		System.out.println(ob);
		
		//insert()
		ob.insert(5, " ");//added a sapce as string in 5th place
		System.out.println(ob);
		
		//replace()
		ob.replace(6, 11, "Prasanthss");
		System.out.println(ob);

		//delete()
		ob.delete(14, 16);
		System.out.println(ob);
		
		//reverse()
		ob.reverse();
		System.out.println(ob);
		
		

	}

}
