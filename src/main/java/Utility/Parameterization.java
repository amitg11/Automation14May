package Utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parameterization {
	
  public static String Exceldata(String name, int r1, int c1) throws EncryptedDocumentException, IOException {
	
	  FileInputStream file= new FileInputStream("C:\\Users\\Amit\\eclipse-workspace\\KiteZerodha\\src\\test\\resources\\zerodha.xlsx");
	 String data= WorkbookFactory.create(file).getSheet(name).getRow(r1).getCell(c1).getStringCellValue();
	 return data;
}
  
}
