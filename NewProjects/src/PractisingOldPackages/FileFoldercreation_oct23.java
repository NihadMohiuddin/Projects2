package PractisingOldPackages;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class FileFoldercreation_oct23 {

	public static void main(String[] args) throws IOException{
//folder creation >in that folder filecreation> write in that file>Read from that file or acces from thge file
		
		File myfolder=new File(".//AutoFolder");
		
		if (myfolder.mkdir())
		{
			System.out.println("Folder created");
		} 
		else
		{
			System.out.println("Folder NOT created");
		}
		
	//-------------------------------------------------------------------------------
	   //file creation
		File myfile =new File(".//AutoFolder//FILE.txt");
	  
	 try {
	    	  myfile.createNewFile();
	    System.out.println("file created");
	    } 
	     
	     catch (Exception e) 
	   {
	    	  System.out.println("file NOT created");
	   }
	   
	//-----------------------------------------------------------------------	
		
		//writting in file
		
		FileWriter write=new FileWriter(".//AutoFolder//FILE.txt");
		write.write(" robot=WHO DID THIS");
		write.close();
		
	//-------------------------------------------------------------------	
		
		//reading from file
        
        FileReader readfile=new FileReader(".//AutoFolder//FILE.txt");
        
		Properties pr=new Properties();
		 pr.load(readfile);
			
		System.out.println(pr.getProperty("robot"));		
				
				
				
				
				
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
