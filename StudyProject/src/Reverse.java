import java.lang.reflect.Array;

public class Reverse {
	
	public static void main(String[] args)
	
	{
		String output= "";
		
	String str = "ABCDEFGH";
	System.out.println("hello");
	char reverse[] = str.toCharArray();
	
		for(int i=reverse.length-1;i>=0;i--)
		{
			
			System.out.println(reverse[i]);
			 output= output+reverse[i];
	
		}
		
		System.out.println(output);
	}
	

}
