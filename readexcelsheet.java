package DataDriven;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class readexcelsheet {

	public static void main(String[] args) throws IOException {

		File file = new File("/Users/Lunge/Downloads/Datasheet.xlsx");

		FileInputStream inputStream = new FileInputStream(file);

		try (XSSFWorkbook wb = new XSSFWorkbook(inputStream)) 
		{

			XSSFSheet sheet = wb.getSheet("Sheet1");
			XSSFRow row2 = sheet.getRow(1);

			XSSFCell cell1 = row2.getCell(0);
			XSSFCell cell2 = row2.getCell(1);
			XSSFCell cell3 = row2.getCell(2);
			XSSFCell cell4 = row2.getCell(3);
			
			String Name = cell1.getStringCellValue();
			String Surname = cell2.getStringCellValue();
			String Email = cell3.getStringCellValue();
			String Address = cell4.getStringCellValue();
			
			System.out.println("Here is the Name: " + Name);
			System.out.println("Here is the Surname: " + Surname);
			System.out.println("Here is the Email: " + Email);
			System.out.println("Here is the Address: " + Address);
		}
	}

}