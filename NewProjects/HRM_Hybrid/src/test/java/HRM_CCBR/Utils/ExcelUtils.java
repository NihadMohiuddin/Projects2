package HRM_CCBR.Utils;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.ss.format.CellDateFormatter;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.github.dockerjava.core.util.FilePathUtil;

import freemarker.core.ReturnInstruction.Return;

public class ExcelUtils {

	
	public static FileInputStream fi;
	public static FileOutputStream fo;
	public static Workbook wb;
	public static Sheet sht;
	public static Cell cell;
	public static Row row;
	public static CellStyle Style;
	
	
	
	
	public static int getRowCount(String Filepath, String Sheetname) throws IOException  
	{
		
		fi=new FileInputStream(Filepath);
		wb = new XSSFWorkbook(fi);
		int res=wb.getSheet(Sheetname).getLastRowNum();
		return res;
   }
	
	
	
	public static Short getColumCount(String Filepath,String Sheetname, int rowno) throws IOException 
	{
		fi=new FileInputStream(Filepath);
        wb=new XSSFWorkbook(fi);
	    Short res=wb.getSheet(Sheetname).getRow(rowno).getLastCellNum();
	    return res;
	   }
		
	
	
	public static String getStringCellValue(String Filepath, String Sheetname, int Rowno, int Cellno) throws IOException 
	{
		
		
		String res;
		fi=new FileInputStream(Filepath);
		wb=new XSSFWorkbook(fi);
		
		try 
		{
	    
			res=wb.getSheet(Sheetname).getRow(Rowno).getCell(Cellno).getStringCellValue();
		
		} 
		
		catch (Exception e) 
		{
			res="";
			
		}
		
		wb.close();
		fi.close();
	    return res;
		
		
	}
	
	
	public static boolean getBooleanCellValue(String filepath, String Sheetname, int Rowno, int Cellno) throws IOException 
	{
		
		boolean data;
		
		fi=new FileInputStream(filepath);
		wb=new XSSFWorkbook(fi);
		
		try 
		{
	        data=wb.getSheet(Sheetname).getRow(Rowno).getCell(Cellno).getBooleanCellValue();

		} 
		catch (Exception e) 
		{
			data=false;
		}
		wb.close();
		fi.close();
		return data;

	}
	
	
	
	
	public static double getNumericCellValue(String filepath, String Sheetname, int Rowno, int Cellno) throws IOException 
	{
		fi=new FileInputStream(filepath);
		wb=new XSSFWorkbook(fi);
		
		double data;
		try 
		{      
			
	      data = wb.getSheet(Sheetname). getRow(Rowno).getCell(Cellno).getNumericCellValue();
         
		} 
		catch (Exception e) 
		{
			  data=0.0;
		}
		
		return data;
		
		
	}
	
	public static String getLargeNumericCellValue(String filepath, String Sheetname, int Rowno, int Cellno) throws IOException 
	{      //to format cell numer to string for Phno
		 DataFormatter fr=new DataFormatter();

		fi=new FileInputStream(filepath);
		wb=new XSSFWorkbook(fi);
	    
		cell= wb.getSheet(Sheetname). getRow(Rowno).getCell(Cellno);
		String data;
		try 
		{
			data=fr.formatCellValue(cell);
		}
		
		catch (Exception e) 
		{
			data="";
		}
		
	        wb.close();
	        fi.close();
	        return data;
        }
	
	
	
	
	public static void setCellData(String filepath, String Sheetname, int Rowno, int Cellno, String StringDatatoenter) throws IOException 
	{
		
		fi=new FileInputStream(filepath);
		wb=new XSSFWorkbook(fi);
	    
		wb.getSheet(Sheetname). getRow(Rowno).getCell(Cellno).setCellValue(StringDatatoenter);
		fo=new FileOutputStream(filepath);
		wb.write(fo);
		wb.close();
		fi.close();
		fo.close();
		

	}
	
	

	public static void setCellData(String filepath, String Sheetname, int Rowno, int Cellno, int intdatatoenter) throws IOException 
	{
		
		fi=new FileInputStream(filepath);
		wb=new XSSFWorkbook(fi);
	    
		wb.getSheet(Sheetname). getRow(Rowno).getCell(Cellno).setCellValue(intdatatoenter);
		fo=new FileOutputStream(filepath);
		wb.write(fo);
		wb.close();
		fi.close();
		fo.close();
		

	}
	
	

	public static void setCellData(String filepath, String Sheetname, int Rowno, int Cellno, boolean Booleandatatoenter) throws IOException 
	{
		
		fi=new FileInputStream(filepath);
		wb=new XSSFWorkbook(fi);
	    
		wb.getSheet(Sheetname). getRow(Rowno).getCell(Cellno).setCellValue(Booleandatatoenter);
		fo=new FileOutputStream(filepath);
		wb.write(fo);
		wb.close();
		fi.close();
		fo.close();
		

	}
	
	
	public static void setGreenColor(String filepath, String Sheetname, int Rowno, int Cellno) throws IOException 
	{
		fi=new FileInputStream(filepath);
		wb=new XSSFWorkbook(fi);
		cell=wb.getSheet(Sheetname).getRow(Rowno).getCell(Cellno);
	   
		Style=wb.createCellStyle();
	   
	   Style.setFillForegroundColor(IndexedColors.BRIGHT_GREEN.getIndex());
	   Style.setFillPattern(FillPatternType.SOLID_FOREGROUND);

	   cell.setCellStyle(Style);
	   fo=new FileOutputStream(filepath);
	   wb.write(fo);
	   wb.close();
	   fi.close();
	   fo.close();
	
	
	}
	
	
	public static void setRedColor(String filepath, String Sheetname, int Rowno, int Cellno) throws IOException 
	{fi=new FileInputStream(filepath);
	wb=new XSSFWorkbook(fi);
	cell=wb.getSheet(Sheetname).getRow(Rowno).getCell(Cellno);
   
	Style=wb.createCellStyle();
   
   Style.setFillForegroundColor(IndexedColors.RED.getIndex());
   Style.setFillPattern(FillPatternType.SOLID_FOREGROUND);

   cell.setCellStyle(Style);
   fo=new FileOutputStream(filepath);
   wb.write(fo);
   wb.close();
   fi.close();
   fo.close();
		

	}
	
	
	
	
	
	
	
	
}
