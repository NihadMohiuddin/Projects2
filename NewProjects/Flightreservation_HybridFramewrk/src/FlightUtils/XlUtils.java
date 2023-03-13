package FlightUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XlUtils {

	public static FileInputStream fi;
	public static FileOutputStream fo;
	public static Workbook wb;
	public static Sheet sheet;
	public static Cell cell;
	public static CellStyle Style;
	
	
	
	public static int getRowCount(String XLfilePath, String Sheetname) throws IOException 
	{
		 fi=new FileInputStream(XLfilePath);
		 wb=new XSSFWorkbook(fi);
		 sheet= wb.getSheet(Sheetname);
		 int totalrows= sheet.getLastRowNum();
	     wb.close();
	     fi.close();
	     return totalrows;
	 }
	
	
	public static int getColumCount(String XLfilePath, String Sheetname, int Rowno) throws IOException 
	{
		 fi=new FileInputStream(XLfilePath);
		 wb=new XSSFWorkbook(fi);
		 sheet= wb.getSheet(Sheetname);
		 short totalcolumns= sheet.getRow(Rowno).getLastCellNum();
	     wb.close();
	     fi.close();
	     return totalcolumns;
	 }
	
	
	public static String getStringCelldata(String XLfilePath, String Sheetname, int Rowno, int Cellno) throws IOException 
	{
		 fi=new FileInputStream(XLfilePath);
		 wb=new XSSFWorkbook(fi);
		 sheet= wb.getSheet(Sheetname);
		 String celldata= sheet.getRow(Rowno).getCell(Cellno).getStringCellValue();
	     wb.close(); 
	     fi.close();
	     return celldata;
	 }
	
	
	public static double getNumericCelldata(String XLfilePath, String Sheetname, int Rowno, int Cellno) throws IOException 
	{
		 fi=new FileInputStream(XLfilePath);
		 wb=new XSSFWorkbook(fi);
		 sheet= wb.getSheet(Sheetname);
		 double celldata= sheet.getRow(Rowno).getCell(Cellno).getNumericCellValue();
	     wb.close(); 
	     fi.close();
	     return celldata;
	 }
	
	
	public static boolean getBooleanCelldata(String XLfilePath, String Sheetname, int Rowno, int Cellno) throws IOException 
	{
		 fi=new FileInputStream(XLfilePath);
		 wb=new XSSFWorkbook(fi);
		 sheet= wb.getSheet(Sheetname);
		 boolean celldata= sheet.getRow(Rowno).getCell(Cellno).getBooleanCellValue();
	     wb.close(); 
	     fi.close();
	     return celldata;
	 }
	
	
	//string
	
	public static void setCelldata(String XLfilePath, String Sheetname, int Rowno, int Cellno, String DataToSet) throws IOException 
	{
		 fi=new FileInputStream(XLfilePath);
		 wb=new XSSFWorkbook(fi);
		 sheet= wb.getSheet(Sheetname);
		 sheet.getRow(Rowno).getCell(Cellno).setCellValue(DataToSet);
		 fo=new FileOutputStream(XLfilePath);
		 wb.write(fo);
		 wb.close(); 
	     fi.close();
	     fo.close();
	 }
	
	//boolean 
	public static void setCelldata(String XLfilePath, String Sheetname, int Rowno, int Cellno, Boolean data) throws IOException 
	{
		 fi=new FileInputStream(XLfilePath);
		 wb=new XSSFWorkbook(fi);
		 sheet= wb.getSheet(Sheetname);
		 sheet.getRow(Rowno).getCell(Cellno).setCellValue(data);
		 fo=new FileOutputStream(XLfilePath);
		 wb.write(fo);
		 wb.close(); 
	     fi.close();
	     fo.close();
	 }
	
	
	//numeric
	public static void setCelldata(String XLfilePath, String Sheetname, int Rowno, int Cellno, double data) throws IOException 
	{
		 fi=new FileInputStream(XLfilePath);
		 wb=new XSSFWorkbook(fi);
		 sheet= wb.getSheet(Sheetname);
		 sheet.getRow(Rowno).getCell(Cellno).setCellValue(data);
		 fo=new FileOutputStream(XLfilePath);
		 wb.write(fo);
		 wb.close(); 
	     fi.close();
	     fo.close();
	 }
	
	
	public static void setGreencolor(String XLfilePath, String Sheetname, int Rowno, int Cellno) throws IOException 
	{
		 fi=new FileInputStream(XLfilePath);
		 wb=new XSSFWorkbook(fi);
		 sheet= wb.getSheet(Sheetname);
	    cell= sheet.getRow(Rowno).getCell(Cellno);
		
	     Style= wb.createCellStyle(); 
	     Style.setFillForegroundColor(IndexedColors.BRIGHT_GREEN.getIndex());
		 Style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		 
		 cell.setCellStyle(Style);
		 fo=new FileOutputStream(XLfilePath);
		 wb.write(fo);
		 wb.close(); 
	     fi.close();
	     fo.close();
	 }
	
	
	public static void setRedcolor(String XLfilePath, String Sheetname, int Rowno, int Cellno) throws IOException 
	{
		 fi=new FileInputStream(XLfilePath);
		 wb=new XSSFWorkbook(fi);
		 sheet= wb.getSheet(Sheetname);
		 cell= sheet.getRow(Rowno).getCell(Cellno);
		 Style= wb.createCellStyle();
		 Style.setFillForegroundColor(IndexedColors.RED.getIndex());
		 Style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		 cell.setCellStyle(Style);
		 fo=new FileOutputStream(XLfilePath);
		 wb.write(fo);
		 wb.close(); 
	     fi.close();
	     fo.close();
	 }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
