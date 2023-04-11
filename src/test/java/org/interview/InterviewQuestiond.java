package org.interview;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class InterviewQuestiond {
	
	public static Object[][] getData() throws IOException  {
	  
		File loc=new File("C:\\Users\\pavithra\\eclipse-workspace\\TestNGClass\\src\\test\\resources\\sharma.xlsx");

		FileInputStream fi=new FileInputStream(loc);
		
	Workbook w=new XSSFWorkbook(fi);
		Sheet s = w.getSheet("Sheet1");
		Row r = s.getRow(1);
		Cell c = r.getCell(0);
		int rowcount = s.getPhysicalNumberOfRows();
		int cellcount = r.getPhysicalNumberOfCells();
		
		Object[][] obj=new Object[rowcount-1][cellcount];
		
		for(int i=0;i<rowcount-1;i++) {
			Row row = s.getRow(i+1);
			for(int j=0;j<cellcount;j++) {
				Cell cell = row.getCell(j);
				
				String value;
				
				int type = cell.getCellType();
				if(type==1) {
					 value = cell.getStringCellValue();
				}
				else {
					if(DateUtil.isCellDateFormatted(cell)) {
						 value = new SimpleDateFormat("dd.mm.yyyy").format(cell.getDateCellValue());
						 
					}
					else {
						 value = String.valueOf((long)cell.getNumericCellValue());
						
					}
				}
				
				obj[i][j]=value;
			}
		}
		return obj;
}
	
	
	public static void main(String[] args) throws IOException {
		Object[][] data = getData();
		System.out.println(data);
		System.out.println(data[0]);
		System.out.println(data[0][0]);
		
		for(Object[] x:data) {
			for(Object y:x) {
				System.out.println(y);
			}
			
			
		}
	}
		
		@DataProvider(name="login",indices= {1,2})
		private Object[][] data() throws IOException {
			Object[][] d = getData();
			return d;

		}
		@Test(dataProvider="login")
		private void test(String user,String pass) {
			System.out.println(user);
			System.out.println(pass);

		}
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


