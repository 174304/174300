
import java.io.IOException;
import java.util.Arrays;
import java.io.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import org.apache.poi.ss.usermodel.Row;

import org.apache.poi.ss.usermodel.Sheet;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


import java.io.File;

import java.io.FileInputStream;

import java.io.FileOutputStream;

import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import org.apache.poi.ss.usermodel.Cell;

import org.apache.poi.ss.usermodel.Row;

import org.apache.poi.ss.usermodel.Sheet;

import org.apache.poi.ss.usermodel.Workbook;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;


//import com.google.common.collect.Table.Cell;

public class StudyProject {

	public static void main(String[] args) throws IOException 
	{
		
		prime();
		
		/*try {
			//int arm=0;
			int l=0;
			//l=armstrong();
		//	System.out.println(l);
			int c=5;
			int x=0;
			x= number(c);
		//	floyd();
		//	fact2();
			
		//	bubble();
	//	selection();
//		int i=4;
//		int j=0;
//		j= factorial(i);
		System.out.println(x);	
		} catch (Exception e) {
			// TODO: handle exception
		}*/
	
//		try{
//		System.setProperty("webdriver.firefox.marionette","C:\\Selenium\\Firefox driver\\geckodriver.exe");
//	
//	System.out.println("Learn Reflection and use of array");
//	
//	WebDriver driver = new FirefoxDriver();
//	driver.manage().window().maximize();
//	Thread.sleep(2000);
//    String appUrl = "https://accounts.google.com";
//    driver.get(appUrl);
////    Thread.sleep(5000);
////   
////    System.out.println("Learn Reflection and use of array it is must");
//    
//    File src = new File("C:\\workspace\\StudyProject\\src\\study.xlsx");
//   FileInputStream fis= new FileInputStream(src);
//    XSSFWorkbook wb = new XSSFWorkbook(fis);
//    XSSFSheet sheet1= wb.getSheetAt(0);
//    String data0 = sheet1.getRow(0).getCell(0).getStringCellValue();
//   System.out.println(data0);
////
//    driver.findElement(By.xpath("//*[@id='Email']")).sendKeys(data0);
////   
//    driver.findElement(By.xpath("//input[@id='next']")).click();
//   Thread.sleep(4000);
//  driver.findElement(By.xpath("//*[@id='Passwd']")).sendKeys("black123");
//    driver.findElement(By.xpath(" //*[contains(text(),'Stay signed in')]//preceding-sibling::input")).click();
////    
////    File result = new File("C:\\workspace\\StudyProject\\Results\\Results.xlsx");
////    FileInputStream fisa = new FileInputStream(result);
////    XSSFWorkbook wb1 = new XSSFWorkbook(fisa);
////    XSSFSheet sh1 = wb1.getSheetAt(0);
////    sh1.getRow(0).createCell(3).setCellValue("pass");
////    FileOutputStream fout = new FileOutputStream(result);
////    wb1.write(fout);
////    wb1.close();
////    String str = "hello";
////    System.out.println(str);
////    
//////    
////   driver.close();
//////
//////	
//////	
//		}
//		catch(Exception e)
//		{}
//
	 }
//

	public static void bubble()
	{
		try {
			int [] i = new int[] {3,7,5,2,4,1,6};
			System.out.println( Arrays.toString(i));
			int l=i.length;
			System.out.println(l);
			for(int j=0;j<l;j++)
			{
			for(int k=0;k<l-1;k++)
			{
				int swap=0;
				if(i[k]>i[k+1])
				{
					swap=i[k];
					i[k]=i[k+1];
					i[k+1]=swap;
				}
				
			}
			}
			System.out.println("the sorted array for bubble sort"+Arrays.toString(i));
			System.out.println("============================ \n");
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public static void selection()
	{
		try {
				int [] cards = new int[] {3,7,5,2,4,1,6};
				System.out.println(Arrays.toString(cards));
				int j= cards.length;
				System.out.println(j);
				for(int k=0;k<j;k++)
				{
					// to have the minimum number stored in it.
					int min = k;
					for(int l=k+1;l<j-1;l++)
					{					
					if(cards[min]>cards[l])
					min =l;
					}
					int swap=0;
					swap=cards[min];
					cards[min]=cards[k];
					cards[k]=swap;
					
				}
				System.out.println("the sorted array for selection sort"+Arrays.toString(cards));
				System.out.println("============================ \n");
			} 
		catch (Exception e) 
			{
			// TODO: handle exception
			}
	}

	public static int factorial(int i)
	{
		
		if(i==1)
		{
			//System.out.println("factorial is 1");
			return 1;
		}
		else
		{
			return (i*factorial(i-1));
		}
		
	
	}
	
	public static void prime()
	{
		int flag=0;
		int m=10;
		int n=m/2;
		for(int i=2;i<=n;i++)
		{
			if(m%i==0)
			{
				flag=1;
			}
		}
	if(flag==0)
	{System.out.println("prime\n");}
	else
	{System.out.println(" not prime");}	
}
	
	public static void fact2()
	{
		try {
			int fact=1;
			int i=8;
			for(int j=1;j<=i;j++)
				
			{
				
				fact=fact*j;
				System.out.println(fact);
				
				
				
			}
			System.out.println(fact);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	
public static void floyd()
		{
		int a=1; 
			for(int i=1;i<=4;i++)
			{
				for(int j=1;j<=i;j++)
				{
					
					System.out.print(a);
					a++;
				}
				System.out.println("\n");
			}
		}

public static int number(int i)
{
	
	if(i==1)
		{
		return 1;
		}
	else
		{
		return(i*number(i-1));
		}
}

public static int  armstrong()
{
	int temp=0;
	int a=153;
	int x=0;
	while(a>0)
	{
		a=a%10;
		x=x+a*a*a;
		System.out.println(x);
	}
	
	return 1;
}

/*public static void captureScreenShot(WebDriver ldriver){
	 
	  // Take screenshot and store as a file format
	 File src = new File("C:/selenium/");
	  File src1= ((TakesScreenshot)ldriver).getScreenshotAs(OutputType.FILE);
	try {
	  // now copy the  screenshot to desired location using copyFile method
	 
	 src.copyFile(src1, new File("C:/selenium/"+System.currentTimeMillis()+".png"));
	    }*/
	 
	/*catch (IOException e)
	 
	{
	 
	System.out.println(e.getMessage());
	 
	   }
	 
	}*/


	
}



