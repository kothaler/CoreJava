package myPackage;

public class Example2 {

	public static void main(String[] args)
	{
		byte b;
		int i;
		b = 10;
		
		i = b * b; // OK, no cast needed 
		b = 10;
		
		b = (byte) (b * b); // cast needed!! as cannot assing int to byte
		
		System.out.println("i and b: " + i + " " + b);

	}

}
