
public class Armstrong {
public static void main(String[] args)
{
	int number=153 ;
	int sum = 0;
while (number !=0)
{
	 
	int digit =number%10;
	System.out.println(digit);
	number =number/10;
	
	sum = sum+digit*digit*digit;
	
	
}
System.out.println(sum);
}
}
