package FlightReservation.Libraries;

import java.io.IOException;

import FlightUtils.XlUtils;

public class excelAccess {

	
	public static void main(String[] args) throws IOException {
		
	int x=	XlUtils.getRowCount(".//Excelfolder//333.xlsx","Sheet1");
		System.out.println(x);
		
		int y=	XlUtils.getColumCount(".//Excelfolder//333.xlsx","Sheet1",2);
		System.out.println(y);
		
		double z=	XlUtils.getNumericCelldata(".//Excelfolder//333.xlsx","Sheet1",2,1);
	
		System.out.println(z);
		
		XlUtils.setGreencolor(".//Excelfolder//333.xlsx","Sheet1",3,3);
		
		
		XlUtils.setCelldata(".//Excelfolder//333.xlsx","Sheet1",3,3,true);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
