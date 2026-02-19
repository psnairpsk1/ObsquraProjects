package stringbufferclass;

public class StringBufferSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer obj = new StringBuffer("Hello");//StringBuffer is a predefined class
		System.out.println(obj);
		
		//append() to append or add two strings
		obj.append("team");
		System.out.println(obj);
		
		//insert() - tod adda new element in a particular index of string
		obj.insert(9,"welcome to the class.");
		System.out.println(obj);
		
		//replace()--to replace the string
		obj.replace(5, 9, "guys");
		System.out.println(obj);
		
		//delete--to delete string
		obj.delete(0, 5);
		System.out.println(obj);
		
		//reverse()--to reverse a string
		obj.reverse();
		System.out.println(obj);
		
	}

}
