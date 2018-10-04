
public class strRev {
	
	public static void main(String[] args)
	{
		/*String str = "Hello how are You";
		
		String change[] =str.split(" ");
		System.out.println(change[3]+ " "+change[2]+change[1]+change[0]);*/
		
		
			      String strOrig = "Hello world ,Hello Reader";
			      int lastIndex = strOrig.lastIndexOf("H");
			      
			      if(lastIndex == - 1){
			         System.out.println("Hello not found");
			      } 
			      else
			      {
			         System.out.println("Last occurrence of Hello is at index "+ lastIndex);
			      }
			  
		
	}

}
