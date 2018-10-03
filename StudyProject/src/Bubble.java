import java.util.Arrays;

public class Bubble {
	
	
	public static void main  (String[] args)
	{
		bubble();
	}
	public static void bubble()
	{
		
			int [] i = new int[] {64,34,25,12,22,11,90};
			System.out.println( Arrays.toString(i));
			int l=i.length;
			System.out.println(l);
			for(int j=0;j<l;j++)
			{
			for(int k=0;k<l-1;k++)
			{
				int swap=0;
				if(i[k]>i[k+1])
				{
					swap=i[k];
					i[k]=i[k+1];
					i[k+1]=swap;
				}
				
			}			
			System.out.println("the sorted array for bubble sort"+Arrays.toString(i));
			System.out.println("============================ \n");
			
		
	}

	}}
