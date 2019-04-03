package lesson1;

public class learnMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sayHello("john");
		add(6,9);
	}
	
	public static void sayHello(String name)  //parameter passing
	{
		System.out.println("hello " + name);
	}
	
	public static void add(int a, int b)
	{
		System.out.println(a+b);
	}

}


