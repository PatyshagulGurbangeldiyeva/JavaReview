package com.rewiev11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDemo {

	public static void main(String[] args) throws IOException {
	
		String projectPath=System.getProperty("user.dir");
		String filePath=projectPath+"/extra/Test.xlsx";
		FileInputStream fis=new FileInputStream(filePath);
		
		// get the whole file
		Workbook book=new XSSFWorkbook(fis);
	
		// get the sheet from the file
	Sheet sheet=book.getSheet("Sheet3");
	
	//get the rows, the last one that has data
	int rows=sheet.getPhysicalNumberOfRows();
	
	
	Row row0=sheet.getRow(0);//--> getting header/one row (you must write the index where the header is)
	
	int cells=row0.getLastCellNum();//--> getting the number of cells in the current row
	
	for (int i=0; i<cells; i++) {// iterate the cells of the header/row0
		String data=row0.getCell(i).toString();
		System.out.print(data+" / ");
	}
	
	System.out.println();
	System.out.println("**********");
	
	// let's iterate all the data in excel(except header)
	
	for (int row=1; row<rows; row++) {
		// for every row we will iterate the cells
		
		Row curRow=sheet.getRow(row);//------> getting the row  / we used it in order to get each row as some of the rows will not have the colum that is filled
		
		// how many cells are there in curRow?
		int curCell=curRow.getLastCellNum();
		for (int cell=0; cell<curCell; cell++) {
//			Cell cellData=curRow.getCell(cell);
//			String cellStringData=cellData.toString();
//			System.out.print(cellStringData+" ");
			
			
			// we can do in onne linne
			
			String c=curRow.getCell(cell).toString();
			System.out.print(c+" ");
		}
		System.out.println();	
	}
	
	
}
	
	
	
}
