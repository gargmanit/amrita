package lesson1;

public class ForLoop {

	public static void main(StringClass[] args) {
		// TODO Auto-generated method stub
		int[] myArray= {1,2,5,7,9};
		
		for (int index=0; index<5;index++)
		/*initialization; expression;increment*/
		{
			System.out.println(myArray[index]);
		}
		
		for(int x : myArray)
		{
			System.out.println(x);
		}
		
	}

}
