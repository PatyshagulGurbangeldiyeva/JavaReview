package com.rewiev11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelMap {

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
		
		
		
		// lets suppose same number of cells i every row
		
		// we will create a map for excel data: Mary
		
		Map <String, String> maryMap=new LinkedHashMap<>();
		for (int cell=0;cell<rows; cell++) {
			 //--> first we need to create a map after getting rows, as we want to save them in the map
																// here we did  not use List as we are getting one map
			String header =sheet.getRow(0).getCell(cell).toString();
			String maryCell=sheet.getRow(2).getCell(cell).toString();

			maryMap.put(header,maryCell);
	}
		System.out.println(maryMap);
		
		// If I will have 3 rows to itterate it means I have 3 maps----> I will store those 3 maps into List
		
		List<Map<String, String>>listMap=new LinkedList<>(); 
		
		for (int r=1; r<rows; r++) {
			// for every data row I will create a map
			Map <String, String> map=new LinkedHashMap<>();
			
			for (int c=0; c<cells; c++) { // itteratig cells
				map.put(sheet.getRow(0).getCell(c).toString(), sheet.getRow(r).getCell(c).toString());
								//key , 						 		values
				
			}
			listMap.add(map); // after creating map, adding it to the list
			 
		}
		System.out.println(listMap);

}
}
