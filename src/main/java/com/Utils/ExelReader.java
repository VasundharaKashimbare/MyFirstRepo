package com.Utils;

import java.io.File;
import java.io.FileInputStream;


import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.BaseClass.BaseClass;

public class ExelReader  extends BaseClass{
	
	XSSFWorkbook workbook;
	
	public ExelReader(String path) throws Exception
	{
		File f=new File(path);
		try
		{
			FileInputStream fin=new FileInputStream(f);
			workbook=new XSSFWorkbook(fin);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	public String DatafromExcelsheet(int index,int row,int col)
	{
		return workbook.getSheetAt(index).getRow(row).getCell(col).getStringCellValue();
	}
	public int rowcount(int index)
	{
		return workbook.getSheetAt(index).getLastRowNum();
	}
	public int columcount(int index,int row)
	{
		return workbook.getSheetAt(index).getRow(row).getLastCellNum();
	}

}
