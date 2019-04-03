package lesson1;

import java.util.Scanner;

public class MyClass {
/*
 * this is my first java program
 * byte (number, 1 byte)  
 * short(number, 2 bytes)
 * int(number, 4 bytes)
 * long(number, 8 bytes)
 * float(float number, 4 bytes)
 * double(float number, 8 bytes)
 * char(a haracter, 2 bytes)
 * boolean(true or false, 1 byte)
 * 
 */
	public static void main(StringClass[] args){
		//VARIABLE DECLARATION
	
		int my_integer = 10;
		float my_decimal= (float)4.5; //here we typecasted float value over double
		double my_double = 32.6;
		char my_char= 'A';
		boolean is_true = false;
		System.out.println(my_integer);
		System.out.println(my_decimal);
		System.out.println(my_double);
		System.out.println(my_char);
		System.out.println(is_true);
		
		//GETTING USER INPUT
		Scanner scan = new Scanner(System.in);
		System.out.println("enter some no");
		int user_input_num = scan.nextInt();
		System.out.println("the entered value is");
		System.out.print(user_input_num);   //print the value without breaking the line
		
		Scanner scan1 = new Scanner(System.in);
		System.out.println("enter some decimal value");
		double user_input_double = scan1.nextDouble()   ;
		System.out.println("the entered value is");
		System.out.print(user_input_double);
		
		Scanner scan2 = new Scanner(System.in);
		System.out.println("enter some string");
		String user_input_string = scan2.nextLine()   ;
		
		System.out.println("the entered string is");
		System.out.print(user_input_string);
	
	
	}
}
