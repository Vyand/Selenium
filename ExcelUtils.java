package Utilities;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelUtils {
	
	private static XSSFWorkbook workbook;
	private static XSSFSheet sheet;
	private static XSSFRow row;
	private static XSSFCell cell;
	
	public void setFile (String excelPath, String sheetname) throws IOException {
	
	File file = new File(excelPath);
	
	FileInputStream inputStream = new FileInputStream(file);

	workbook = new XSSFWorkbook(inputStream);
	sheet = workbook.getSheet(sheetname);
	}
	
	public String getCellData(int rowNumber, int cellNumber) {
		
		cell = sheet.getRow(rowNumber).getCell(cellNumber);
		
		return cell.getStringCellValue();

	}
	public int get_rowCount() {
		int rowcount = sheet.getLastRowNum()-sheet.getFirstRowNum();
	return rowcount;	
	
	}
	public void setCell(int rowNum, int cellNum, String cellValue,String excelPath ) throws IOException {
		sheet.getRow(rowNum).createCell(cellNum).setCellValue(cellValue);
		
		FileOutputStream outputStream = new FileOutputStream (excelPath);
		workbook.write(outputStream);
	}
	
	
}
