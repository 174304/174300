package abc.org;
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

public class READWRITE {

//import com.google.common.collect.Table.Cell;


	public static void main(String[] args) throws IOException 
	{
		
			try{
		System.setProperty("webdriver.firefox.marionette","C:\\Selenium\\Firefox driver\\geckodriver.exe");
	System.out.println("Learn Reflection and use of array");
//	
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
//	Thread.sleep(2000);
    String appUrl = "https://accounts.google.com";
    driver.get(appUrl);
////    Thread.sleep(5000);
////   
    System.out.println("Learn Reflection and use of array it is must");
//    
    File src = new File("C:\\workspace\\StudyProject\\src\\study.xlsx");
   FileInputStream fis= new FileInputStream(src);
    XSSFWorkbook wb = new XSSFWorkbook(fis);
    XSSFSheet sheet1= wb.getSheetAt(0);
    String data0 = sheet1.getRow(0).getCell(0).getStringCellValue();
   System.out.println(data0);
////
    driver.findElement(By.xpath("//*[@id='Email']")).sendKeys(data0);
////   
    driver.findElement(By.xpath("//input[@id='next']")).click();
//   Thread.sleep(4000);
  driver.findElement(By.xpath("//*[@id='Passwd']")).sendKeys("black123");
    driver.findElement(By.xpath(" //*[contains(text(),'Stay signed in')]//preceding-sibling::input")).click();
////    
    File result = new File("C:\\workspace\\StudyProject\\Results\\Results.xlsx");
    FileInputStream fisa = new FileInputStream(result);
    XSSFWorkbook wb1 = new XSSFWorkbook(fisa);
    XSSFSheet sh1 = wb1.getSheetAt(0);
    sh1.getRow(0).createCell(3).setCellValue("pass");
    FileOutputStream fout = new FileOutputStream(result);
    wb1.write(fout);
    wb1.close();
    String str = "hello";
    System.out.println(str);
////    
   
   driver.close();
	}	catch(Exception e)
		{}

	 }

}
