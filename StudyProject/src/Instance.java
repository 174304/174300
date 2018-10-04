
public class Instance {
	
	int a=10;
	String str="String";
	public static void main(String [] args)
	{
		//creating objects of the class
		Instance b = new Instance();
		Instance v= new Instance();
		//printing the value of instance variables through objects
		
		System.out.println(b.a);
		System.out.println(b.str+"\n====================="+ StaticVariables.a);
		//printing the valure of instance variables throuhgh 2nd object
		
		System.out.println(v.a);
		System.out.println(v.str+"\n=====================");
		
		//changing the values of the varaibles through object 1
		b.a=20;
		b.str="Nadeesh";
		
		//printing using object b
		 System.out.println(b.a);
		 System.out.println(b.str+"\n=====================");
		 
		 //printing using 2nd object
		 
		 System.out.println(v.a);
		 System.out.println(v.str+"\n=====================");
	}

}
