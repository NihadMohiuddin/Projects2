package Ecommerce.Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
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

public class ExcelUtils {

	
	public static FileInputStream fi;
	public static FileOutputStream fo;
	public static Workbook wb;
	public static Sheet sheet;
	public static Row row;
	public static Cell cell;
	public static CellStyle style;

	
	
	public static int getRowCount(String xlfilepath, String sheetname) throws IOException 
	{
		fi=new FileInputStream(xlfilepath);
		wb=new XSSFWorkbook(fi);
		int totalrowcount=wb.getSheet(sheetname).getLastRowNum();
		wb.close();
		fi.close();
		return totalrowcount;

	}
	
	
	
	public static short getColumnCount(String xlfilepath, String sheetname, int rowno) throws IOException 
	{
		fi=new FileInputStream(xlfilepath);
		wb=new XSSFWorkbook(fi);
		short totalColumcount=wb.getSheet(sheetname).getRow(rowno).getLastCellNum();
		wb.close();
		fi.close();
		return totalColumcount;
	}
	
	
	
	
	public static String getStringCellData(String xlfilepath, String sheetname, int rowno, int cellno) throws IOException 
	{
		fi=new FileInputStream(xlfilepath);
		wb=new XSSFWorkbook(fi);
	
		String stringdata;
		
		try 
		{
		 stringdata = wb.getSheet(sheetname).getRow(rowno).getCell(cellno).getStringCellValue();
		
		}
       
		catch (Exception e) 
		{
			stringdata="";
		}
		
        wb.close();
		fi.close();
		return stringdata;
		
	}
	
	
	
	
	
	public static boolean getBooleanCellData(String xlfilepath, String sheetname, int rowno, int cellno) throws IOException 
	 {
		fi=new FileInputStream(xlfilepath);
		wb=new XSSFWorkbook(fi);
		
		Boolean Booleancellvalue;
		try 
		{
		 Booleancellvalue = wb.getSheet(sheetname).getRow(rowno).getCell(cellno).getBooleanCellValue();

		} 
		
		catch (Exception e)
		{
			
			Booleancellvalue=false;
		}
		
		wb.close();
		fi.close();
		return Booleancellvalue;
		
	}
	
	
	
	public static double getNumericCellData(String xlfilepath, String sheetname, int rowno, int cellno) throws IOException 
	{
		fi=new FileInputStream(xlfilepath);
		wb=new XSSFWorkbook(fi);
		double doublecellvalue;
		
		try 
		{
			 doublecellvalue = wb.getSheet(sheetname).getRow(rowno).getCell(cellno).getNumericCellValue();

		} 
		
		catch (Exception e) 
		{
			doublecellvalue=0.0;
		
		}
		wb.close();
		fi.close();
		return doublecellvalue;
    }
	
	
	
	
	

	
	
	public static void setCellData(String xlfilepath, String sheetname, int rowno, int cellno, int IntDatatoSet) throws IOException 
	{
		fi=new FileInputStream(xlfilepath);
		wb=new XSSFWorkbook(fi);
		 wb.getSheet(sheetname).getRow(rowno).getCell(cellno).setCellValue(IntDatatoSet);;
		fo=new FileOutputStream(xlfilepath);
		wb.write(fo);
		wb.close();
		fi.close();
		fo.close();

	}
	
	

	

	public static void setRedColor(String xlfilepath, String sheetname, int rowno, int cellno) throws IOException 
	{
		
		fi=new FileInputStream(xlfilepath);
		wb=new XSSFWorkbook(fi);
		cell= wb.getSheet(sheetname).getRow(rowno).getCell(cellno);
		style=wb.createCellStyle();
		style.setFillForegroundColor(IndexedColors.RED.getIndex());
		style.setFillPattern(FillPatternType.SOLID_FOREGROUND); 
		cell.setCellStyle(style);
		fo=new FileOutputStream(xlfilepath);
		wb.write(fo);
		wb.close();
		fi.close();
		fo.close();
		

	}
	
	
	public static void setGreenColor(String xlfilepath, String sheetname, int rowno, int cellno) throws IOException 
	{
		fi=new FileInputStream(xlfilepath);
		wb=new XSSFWorkbook(fi);
		cell= wb.getSheet(sheetname).getRow(rowno).getCell(cellno);
		style=wb.createCellStyle();
		style.setFillForegroundColor(IndexedColors.BRIGHT_GREEN.getIndex());
		style.setFillPattern(FillPatternType.SOLID_FOREGROUND); 
		cell.setCellStyle(style);
		fo=new FileOutputStream(xlfilepath);
		wb.write(fo);
		wb.close();
		fi.close();
		fo.close();
		

	}
	
	
	
	
	
	
	
	
	
	
	
}
