package com.Ecommerce.genericLib;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelLib 
{
	String Path="./TestData/EcommerceTestData.xlsx";

	public String GetdatafromExcel(String SheetName,int RowNum,int CellNum) throws Throwable
	{
		FileInputStream fis= new FileInputStream(Path);
		Workbook Wb= WorkbookFactory.create(fis);
		Sheet Sh=Wb.getSheet(SheetName);
		Row Rw=Sh.getRow(RowNum);
		String Celvalue=Rw.getCell(CellNum).getStringCellValue();
		Wb.close();
		return Celvalue;
	}

	public void SetdatatoExcel(String SheetName,int RowNum,int CelNum,String InputData) throws Throwable
	{
		FileInputStream Fis= new FileInputStream(Path);
		Workbook Wb= WorkbookFactory.create(Fis);
		Sheet Sh=Wb.getSheet(SheetName);
		Row Rw=Sh.getRow(RowNum);
		Cell cel=Rw.createCell(CelNum);
		cel.setCellValue(InputData);
		FileOutputStream Fos=new FileOutputStream(Path);
		Wb.write(Fos);
		Wb.close();
	}
}
