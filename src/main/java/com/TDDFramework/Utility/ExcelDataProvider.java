package com.TDDFramework.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	
	   XSSFWorkbook wb;
	
 public ExcelDataProvider() throws IOException {
	
	  String filename=System.getProperty("user.dir")+"\\TestData\\TestData.xlsx";             
	  File src=new File(filename);
	  try {
 	     FileInputStream fis=new FileInputStream(src);
	     wb=new XSSFWorkbook(fis);
	  }catch(Exception e) {
		  System.out.println(e);
	  }
	}
	
  public String getStringData(int SheetIndex,int row,int column) {
		return wb.getSheetAt(SheetIndex).getRow(row).getCell(column).getStringCellValue();
	}
  public double getNumericData(int SheetIndex,int row,int column) {
	  return wb.getSheetAt(SheetIndex).getRow(row).getCell(column).getNumericCellValue();
  }
}
