public class base 
{

	public static void main(String args[])
	{
		SBI obj= new SBI();
		obj.typeofbank();
		System.out.println(obj.rateofInterest());
		obj.country();
//		bank b= new bank();
	}
}

 class SBI extends bank{
	
	public int rateofInterest()
	{
		return 8;
	}
	public void typeofbank()
	{
		System.out.println("Non government");
	}
}
 class PNB{
	
	public int rateofInterest()
	{
		return 7;
	}
	
}

 abstract class bank{
	 
	 public abstract void typeofbank();
	 
	 public void country()
	 {
		 System.out.println("India");
	 }
 }


 