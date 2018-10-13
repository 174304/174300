package codebind;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class codebind {

	
	@Test
	public void test1 ()
	{
		//fail("passed");
		int x =2;
		int y =3;
		int z =x+y;
		assertEquals(z,5);
		
	}
}
