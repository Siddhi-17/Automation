package DDT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelReading {
  @Test
  public void f() throws IOException {
	  FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\testData\\TextFile.xlsx");
	// create an instance of required workbook class and pass FileInputStream instance to its constructor
			Workbook workbook = new XSSFWorkbook(fis);
			// get the number of sheets present in the excel
			int sheetCount = workbook.getNumberOfSheets();
			System.out.println("Sheet count: " + sheetCount);
  }
}
