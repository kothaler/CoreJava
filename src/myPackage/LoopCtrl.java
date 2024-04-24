package myPackage;

public class LoopCtrl
{

	public static void main(String[] args)
	{
		int i;
		i = 0; // move initialization out of loop 
		for(; i < 10; )
		{
		System.out.println("Pass #" + i);
		i++; // increment loop control var
		}

	}

}
