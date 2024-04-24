package myPackage;

public class Forloop1 {

	public static void main(String[] args)
	{
		int x=0, y=0;
		 
			for(x=0; x < 5; x++)
			{
		     for(y = 0; y < 5; y++) 
		      { 
			   if(y == 2)
				break;
		        System.out.println("x and y: " + x + " " + y);
		      }
		   }
		System.out.println();
		for(x=0; x < 5; x++) 
		{
		for(y = 0; y < 5; y++)
		{ 
			if(y == 2)
				break;
		System.out.println("x and y: " + x + " " + y);
		}
		}

	}

}
