
public class Reversefunction {
public static void main(String [] args)
{
String str= "Hello";
String reversed = reversed(str);
System.out.println(reversed);
}

public static String reversed(String str)
	{
if (str.isEmpty())
return str;
else
	return reversed(str.substring(1))+str.charAt(0);
	
	}
}
