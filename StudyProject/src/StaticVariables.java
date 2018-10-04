public class StaticVariables
{

	static  int a=10;
	static String str= "Stirng";
	
	public static void main(String [] args)
	{
		//creating object of first static int
		StaticVariables b= new StaticVariables();
		// creating object of staic string
		StaticVariables vstr = new StaticVariables();
		//printing the static values using 1st object
		try {
			System.out.println(StaticVariables.a);
			System.out.println(b.str+"\n================");
			//printing the static values using the 2nd object
			System.out.println(vstr.a);
			System.out.println(vstr.str+"\n================");
			
			//changing the value of static variable using one object
			b.a=20;
			b.str="Nadeesh";
			
			//printing  the values of static variable by using above objects
			System.out.println(b.a);
			System.out.println(b.str+"\n================");
			//printing the values of static variables using 2nd object
			System.out.println(vstr.a);
			System.out.println(vstr.str+"\n================");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}

