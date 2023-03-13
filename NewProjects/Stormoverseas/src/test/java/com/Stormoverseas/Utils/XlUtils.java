package com.Stormoverseas.Utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;




public class XlUtils {

	
	public static FileInputStream fi;
	public static FileOutputStream fo;
	public static Row row;
	public static Cell cell;
	public static Sheet sht;
    public static Workbook wb;
    public static CellStyle style;
    
	
	public static int getRowCount(String path, String sheetname) throws IOException
	{
	
        fi=new FileInputStream(path);
        wb=new XSSFWorkbook(fi);
        int data=	wb.getSheet(sheetname).getLastRowNum();
        wb.close();
        fi.close();
        return data;
		
		
	}
	
	
	
	public static short getCellCount(String path, String sheetname, int rowno) throws IOException
	{
	  fi=new FileInputStream(path);
	  wb=new XSSFWorkbook(fi);
      short data=	wb.getSheet(sheetname).getRow(rowno).getLastCellNum();
      wb.close();
      fi.close();
      return data;
		
	}
	
	
	
	
	public static String getStringcelldata(String path, String sheetname, int rowno, int cellno) throws IOException
	{
		  fi=new FileInputStream(path);
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
	
	
	public static boolean getBooleancelldata(String path, String sheetname, int rowno, int cellno) throws IOException
	{
		  fi=new FileInputStream(path);
		  wb=new XSSFWorkbook(fi);
		 
		  boolean data;
		  try
		  {
	       data=	wb.getSheet(sheetname).getRow(rowno).getCell(cellno).getBooleanCellValue();
	    
		  }
	      
		  catch (Exception e) 
		  {
			  data =false;
		   }
		  wb.close();
          fi.close();
	
		  return data;
	
	}
	
	
	public static double getNumericelldata(String path, String sheetname, int rowno, int cellno) throws IOException
	{
		  fi=new FileInputStream(path);
		  wb=new XSSFWorkbook(fi);
	      double data;
		  try
	       {
	    	  data=	wb.getSheet(sheetname).getRow(rowno).getCell(cellno).getNumericCellValue();
	       }
		 
          catch (Exception e)
		  {
        	  data=0.0;
	      }          
		  wb.close();
          fi.close();
		  return data;
	}
	
	
	
	public static void setCelldata(String path, String sheetname, int rowno, int cellno,String data) throws IOException
	{
		  fi=new FileInputStream(path);
		  wb=new XSSFWorkbook(fi);
	      wb.getSheet(sheetname).getRow(rowno).getCell(cellno).setCellValue(data);
          fo=new FileOutputStream(path);
          wb.write(fo);
	      wb.close();
          fi.close();
          fo.close();
	      
	 
	}


	public static void fillGreencolor(String path, String sheetname, int rowno, int cellno) throws IOException
	{
		 fi=new FileInputStream(path);
		wb=new XSSFWorkbook(fi);
	    cell=wb.getSheet(sheetname).getRow(rowno).getCell(cellno);
       
	    style=wb.createCellStyle();
        style.setFillForegroundColor(IndexedColors.BRIGHT_GREEN.getIndex());
	    style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
	    
	     cell.setCellStyle(style);
	     fo=new FileOutputStream(path);
          wb.write(fo);
	      wb.close();
          fi.close();
          fo.close();
	      
	    
	
	}

	public static void fillRedcolor(String path, String sheetname, int rowno, int cellno) throws IOException
	{
		 fi=new FileInputStream(path);
		wb=new XSSFWorkbook(fi);
	    cell=wb.getSheet(sheetname).getRow(rowno).getCell(cellno);
     
	    style= wb.createCellStyle();
        style.setFillForegroundColor(IndexedColors.RED.getIndex());
	    style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
	    
	     cell.setCellStyle(style);
	     fo=new FileOutputStream(path);
          wb.write(fo);
	      wb.close();
          fi.close();
          fo.close();
	      
	    
	
	}










}
