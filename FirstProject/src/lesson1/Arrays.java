package lesson1;

public class Arrays {

	//same as variable but can store same kind(data type) of multiple values at a time
	public static void main(StringClass[] args)
	{
		int[] intArray = {1,2,3,4,6}; //preferred way of declaring array
/*
		int intArray2[] = {1,3,2,4,6};
		int[] intarray3= new int[3];
		int[] intarray4 = new int[] {1,2,3};
*/		
		int index=0;
		while(index<5)
		{
			System.out.println(intArray[index]);
			index++;
		}
		}




}


