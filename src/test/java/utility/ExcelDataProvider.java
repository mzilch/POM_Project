package utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	
	XSSFWorkbook wb;
	XSSFSheet wbSheet;
	
	public ExcelDataProvider()
	{		
		File src= new File("./TestData/Data.xlsx");
		try {
			FileInputStream fis = new FileInputStream(src);
			wb = new XSSFWorkbook(fis);
		} catch (Exception e) {
			System.out.println("Unable to Read Excel File\r\n" + e.getMessage());			
		} 
	}
	
	public ArrayList<String> readDataSet(int sheetIndex, int rowindex , int columnIndex)
	{
		wbSheet = wb.getSheetAt(sheetIndex);
		
		Iterator<Row> rowIterator = wbSheet.iterator();
		//rowIterator.next(); // use if first row are header descriptor row
		ArrayList<String> list = new ArrayList<String>();
		
		while(rowIterator.hasNext() ) {
			list.add(rowIterator.next().getCell(columnIndex).getStringCellValue());
		}
		return list;
	}
	
	public String getStringData(int sheetIndex,int row, int column)
	{
		return wb.getSheetAt(sheetIndex).getRow(row).getCell(column).getStringCellValue();
	}
	public String getStringData(String sheetName,int row, int column)
	{
		return wb.getSheet(sheetName).getRow(row).getCell(column).getStringCellValue();
	}	
	public double getNumericData(String sheetName,int row, int column)
	{
		return wb.getSheet(sheetName).getRow(row).getCell(column).getNumericCellValue();
	}
	public int getRowCount(int sheetIndex)
	{
		int row = wb.getSheetAt(sheetIndex).getLastRowNum();
		row = row + 1;
		return row;
	}
	
}
