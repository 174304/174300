package codebind;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class codebind {

	
	@Test
	public void test ()
	{
		//fail("passed");
		int x =2;
		int y =3;
		int z =x+y;
		assertEquals(z,5);
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nadeesh\\Downloads\\ChromeSetup.exe");
		ChromeDriver driver = new ChromeDriver();
		
		String Url = "www.youtube.com";
		driver.get(Url);;
	}
}
