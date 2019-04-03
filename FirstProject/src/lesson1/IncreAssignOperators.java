package lesson1;

public class IncreAssignOperators {

	public static void main(StringClass[] args) {
		// TODO Auto-generated method stub
		int x=10;
		x++;
		System.out.println(x);
		
		System.out.println(x++); //post incrementation (value of x will change after its display
		System.out.println(x);
		
		System.out.println(++x); //pre incrementation value is first incremented then printed
		System.out.println(x);
		
		x += 5;  // x= x+5
		System.out.println(x);
		
		x *= 5;  // x= x*5
		System.out.println(x);    // = sign is assignment operator
	
		x /= 5;  // x= x/5
		System.out.println(x);
		
		x -= 5;  // x= x-5
		System.out.println(x);
	}

}
