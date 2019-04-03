package lesson1;

public class StringClass {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
		String myString = "Hello World";
		int StringLength = myString.length();
		System.out.println(StringLength);
		 String lowercase = myString.toLowerCase();
		 System.out.println(lowercase);
		 
		 System.out.println(myString.replace('e', 'a'));
	}

}
