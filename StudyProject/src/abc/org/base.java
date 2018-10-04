package abc.org;
public class base implements myaccount  
{
	public void myamount()
	{
		System.out.println("200000");
	}
	
	public void rate()
	{
		System.out.println("7%");
	}
	
	public static void main(String args[])
	{
		
		PNB j= new PNB();
		System.out.println(j.rateofInterest());
		System.out.println("=======\n");
		SBI obj= new SBI();
		obj.typeofbank();
		System.out.println("=======\n");
		System.out.println(obj.rateofInterest());
		System.out.println("=======\n");
		obj.country();
		System.out.println("=======\n");
		base b= new base();
		b.myamount();
		System.out.println("=======\n");
		b.rate();
			
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

 interface myaccount
{
	
	public abstract void myamount();
	public abstract void rate();
	
}
 