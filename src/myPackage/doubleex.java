package myPackage;

public class doubleex {

	public static void main(String[] args)
	{
		double x, y;
		byte b;
		int i; 
		char ch;
		x = 10.0;
		y = 3.0;

		i = (int) (x / y); // cast double to int 
		System.out.println("Integer outcome of x / y: " + i); 
		
		i = 100;
		b = (byte) i;

		System.out.println("Value of b: " + b);
		
		i = 259;
		b = (byte) i;

		System.out.println("Value of b: " + b);
		
		b = 120; // ASCII code for X
		ch = (char) b;
		System.out.println("ch: " + ch);

	}

}
