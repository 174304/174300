
public class Pattren {


	public static void main( String [] args)
	{
		int factorial=1;
		int number=5;
		 factorial = fact(number);
		
			System.out.println(factorial);
	}
	public static int fact(int i)
	{
		if(i==0)
		return 1;
		else
		return (i*fact(i-1));
	}
}




