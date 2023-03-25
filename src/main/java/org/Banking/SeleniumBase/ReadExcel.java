package org.Banking.SeleniumBase;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	public static String[][] getExcel(String filename) {
		
		//String fileLocation = "./data/ExcelData.xlsx";
		XSSFWorkbook wbook = null;
		try {
			wbook = new XSSFWorkbook("./data/"+filename+".xlsx");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		XSSFSheet sheetAt = wbook.getSheetAt(0);
		int lastRowNum = sheetAt.getLastRowNum();
		int physicalNumberOfRows = sheetAt.getPhysicalNumberOfRows();
		System.out.println("Row Count "+lastRowNum);
		//System.out.println("with header row count "+physicalNumberOfRows);
		short lastCellNum = sheetAt.getRow(0).getLastCellNum();
		System.out.println("Last Cell "+lastCellNum);
		
		String[][] data = new String [lastRowNum][lastCellNum];
		for (int i = 1; i <= lastRowNum; i++) {
			XSSFRow row = sheetAt.getRow(i);
		
		for (int j = 0; j < lastCellNum; j++) {
			XSSFCell cell = row.getCell(j);
			String stringCellValue = cell.getStringCellValue();
			//System.out.println(stringCellValue);
			
			data [i-1][j] = stringCellValue;
		}
		}
		try {
			wbook.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return data;
	}

}


