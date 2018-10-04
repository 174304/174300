import java.awt.event.FocusAdapter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DI {
	
	public static <Workbook> void main(String args[]) throws IOException
	{
		HashMap<String, String>	hash = new HashMap<>();	
		hash.put("coke", "hello");	
		System.out.println(hash.get("coke"));
		
		//hash.remove("coke");
		System.out.println(hash.isEmpty());
		hash.replace("coke", "hello", "zila pehalwan");
		System.out.println(hash);
		XSSFWorkbook workbook = null;
		try {
			
			File file = new File("C:\\workspace\\StudyProject\\sheet.xlsx");
			file.createNewFile();
			FileInputStream fos =new FileInputStream(file);
			 workbook = new XSSFWorkbook();
			XSSFSheet sheet =workbook.createSheet();
			//XSSFSheet sheet1= workbook.getSheetAt(0);
			Row rw =sheet.createRow(1);
			Cell cl =rw.createCell(3);
			
			sheet.getRow(0).getCell(3).setCellValue("hash");
			FileOutputStream fos1 = new FileOutputStream(file);
			workbook.write(fos1);
			
			System.out.println("created");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try{
			workbook.close();	
			}
			catch(IOException e){
				e.printStackTrace();
			}
		}
		
		
	}

}