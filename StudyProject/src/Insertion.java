
public class Insertion {
public static void main(String[] args)
{
	int list [] = {10,34,2,56,7,67,88,42};
	int arr[]  = insertion_sort(list);
	 for(int i:arr)
	 {
         System.out.print(i);
         System.out.println(",");

	 }
}
	

public static int[] insertion_sort(int[] sort)
{
int temp;
for (int i=1;i<sort.length;i++)
	{	
	for(int j=i;j>0;j--)
		{
		
			if(sort[j]<sort[j-1])
				{
					temp =sort[j];
					sort[j]= sort[j-1];
					sort[j-1]= temp;
					
					
				}					
		}	
}
return sort;

	
}
}



