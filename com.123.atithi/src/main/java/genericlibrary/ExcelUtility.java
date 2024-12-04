package genericlibrary;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;





public class ExcelUtility {
	
	public String readDataFromExcel(String sheetname,int rowNum,int cellNum) throws Exception
	{
		FileInputStream fis=new FileInputStream("C:\\Users\\FCI\\Documents\\atithi.xlsx");
		Workbook book= WorkbookFactory.create(fis);
		Sheet sh=book.getSheet("Sheet1");
		DataFormatter format=new DataFormatter();
		String value=format.formatCellValue(sh.getRow(rowNum).getCell(cellNum));
		return value;
	}

}



