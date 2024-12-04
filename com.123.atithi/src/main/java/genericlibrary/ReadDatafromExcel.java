package genericlibrary;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class ReadDatafromExcel {
	
	public static void main(String[] args) throws Exception 
	{
		FileInputStream fis=new FileInputStream("C:\\Users\\LENOVO\\OneDrive\\Documents\\Applicationform.xlsx");
		Workbook book=WorkbookFactory.create(fis);
		Sheet sh=book.getSheet("app1");
		//Row r=sh.getRow(2);
		//Cell c=r.getCell(1);
		String value=sh.getRow(2).getCell(1).getStringCellValue();
		System.out.println(value);
		
		
	}

}
