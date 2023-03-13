package com.Guru99demo.Testdata;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XlUtils {

	
	public static FileInputStream fi;
	public static FileOutputStream fo;
	public static Workbook wb;
	public static Cell cell;
	public static Sheet sht;
	public static Row row;
	public static  CellStyle style;
	
	
	
	public static int getRowCount(String filepath, String sheetname) throws IOException 
	{
		fi=new FileInputStream(filepath);
		 wb=new XSSFWorkbook(fi);
		 int data=wb.getSheet(sheetname).getLastRowNum();
		 wb.close();
		 fi.close();
		 return data;
		
	}
	
	
	
	public static short getColumCount(String filepath, String sheetname, int rowno) throws IOException 
	{
	    fi=new FileInputStream(filepath);
		wb=new XSSFWorkbook(fi);
		short data=wb.getSheet(sheetname).getRow(rowno).getLastCellNum();
	    wb.close();
		fi.close();
		return data;
		
	}
	
	
	
	
	public static void SetcellData(String filepath, String sheetname, int rowno, int cellno, String data) throws IOException 
	{
		fi=new FileInputStream(filepath);
		wb=new XSSFWorkbook(fi);
		wb.getSheet(sheetname).getRow(rowno).getCell(cellno).setCellValue(data);
		fo=new FileOutputStream(filepath);
		wb.write(fo);
		wb.close();
		fi.close();
		fo.close();
		
	}
	
	
	
	
	
	public  static String getStringcellvalue(String filepath, String sheetname, int rowno, int cellno) throws IOException 
	{
		fi=new FileInputStream(filepath);
		wb=new XSSFWorkbook(fi);
	   
		String data;
		try
	    {
		 data=wb.getSheet(sheetname).getRow(rowno).getCell(cellno).getStringCellValue();
	    }
	   
	   catch (Exception e)
	   {
		   data="";
	   }
	   
		wb.close();
		fi.close();
	
	    return data;
		
	}
	
	
	
	
	public static Boolean getBooleancellvalue(String filepath, String sheetname, int rowno, int cellno) throws IOException 
	{
		fi=new FileInputStream(filepath);
		wb=new XSSFWorkbook(fi);
	   
		Boolean data;
	
		try
	    {
		 data=wb.getSheet(sheetname).getRow(rowno).getCell(cellno).getBooleanCellValue();
	    }
	
	
		catch (Exception e)
		   {
			   data=false;
		   }
		
		wb.close();
		
		fi.close();
	    return data;
	
	}
	
	
	
	
	public  static double getNumericcellvalue(String filepath, String sheetname, int rowno, int cellno) throws IOException 
	{
	
		fi=new FileInputStream(filepath);
		wb=new XSSFWorkbook(fi);
	   
		double data;
	
		try
	    {
		 data=(int) wb.getSheet(sheetname).getRow(rowno).getCell(cellno).getNumericCellValue();
	    }
		
		catch (Exception e)
		   {
			   data=0.0;
		   }
		wb.close();
		
		fi.close();
	    return data;
	}
	

	
	
	
	public static void FillGreencolor(String filepath, String sheetname, int rowno, int cellno) throws IOException 
	{
	
		fi=new FileInputStream(filepath);
		wb=new XSSFWorkbook(fi);
		cell=wb.getSheet(sheetname).getRow(rowno).getCell(cellno);
		style=wb.createCellStyle();
		
		style.setFillForegroundColor(IndexedColors.BRIGHT_GREEN.getIndex());
		style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		
		cell.setCellStyle(style);
		fo=new FileOutputStream(filepath);
		wb.write(fo);
		wb.close();
		fi.close();
		fo.close();
		
		
	}
	
	
	public static void FillRedcolor(String filepath, String sheetname, int rowno, int cellno) throws IOException 
	{
		fi=new FileInputStream(filepath);
		wb=new XSSFWorkbook(fi);
		cell=wb.getSheet(sheetname).getRow(rowno).getCell(cellno);
		style=wb.createCellStyle();
		
		style.setFillForegroundColor(IndexedColors.RED.getIndex());
		style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		
		cell.setCellStyle(style);
		fo=new FileOutputStream(filepath);
		wb.write(fo);
		wb.close();
		fi.close();
		fo.close();
		
	}
	
	
	
	
}
