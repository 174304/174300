package codebind;


import static org.junit.Assert.assertEquals;

import org.testng.annotations.Test;


public class Coded {

	
	@Test
	public void test ()
	{
		//fail("passed");
		int x =2;
		int y =3;
		int z =x+y;
		assertEquals(z,5);
		
	}
	
	@Test
	public void test21 ()
	{
		//fail("passed");
		int x =3;
		int y =4;
		int z =x+y;
		assertEquals(z,7);
		
	}
	@Test
	public void test22 ()
	{
		//fail("passed");
		int x =4;;
		int y =4;
		int z =x+y;
		assertEquals(z,8);
		
	}
}
