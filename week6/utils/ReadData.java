package utils;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData {

	public static void main(String[] args) {

		// locate the file
		XSSFWorkbook wbook = null;
		try {
			wbook = new XSSFWorkbook("./data/TC001_Data.xlsx");
		} catch (IOException e) {
			System.err.println("File not found");
		}

		// locate sheet
		XSSFSheet sheet = wbook.getSheetAt(0);
		int lastRowNum = sheet.getLastRowNum();
		int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
		System.out.println(physicalNumberOfRows);
		System.out.println("Row " + lastRowNum);
		short columns = sheet.getRow(0).getLastCellNum();
		System.out.println("Columns " + columns);

		for (int i = 1; i <= lastRowNum; i++) { 
			// locate row 
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < columns; j++) { 
				// locate column
				XSSFCell cell = row.getCell(j); 
				// read that data 
				DataFormatter dft = new DataFormatter();
				String formatCellValue = dft.formatCellValue(cell);
				System.out.println(formatCellValue);
				// no need this;
//				String value = cell.getStringCellValue();
//				System.out.println(value);
			}
		}

	}

}
