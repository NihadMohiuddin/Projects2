package PractisingOldPackages;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.google.common.io.FileWriteMode;

public class File_write_read_Create {

	public static void main(String[] args) throws IOException {
      
          
		//for file creation in folder
				//NOTE for file creation first give folder name or create folder first and give file location
			//for file put .txt, for photo put .png it automatically creates ordinary file or photo file
			
		/*
		
		//file creating
		File myfile=new File("C://eclipseeffolder//filename.txt");
		
             try {
				myfile.createNewFile();
				System.out.println("file created");
			} catch (IOException e) {
				
				e.printStackTrace();
				System.out.println("error occured");
			}
			
			*/
//------------------------------------------------------------------		
	     /*
             //folder creation
           File folder=new File("C://solder");
           System.out.println("Folder is created  "+folder.mkdir());
            */ 
  //--------------------------------------------------------------------           
             //write in a file
          //dont forget to clse file
		//use close ()
			FileWriter writes = new FileWriter("C:\\dgfsg//sgfk.txt");
			writes.write(" written by me");
			writes.close();
         System.out.println("written succesfully");
		
//--------------------------------------------------------------------		
		
         
         
         
         
         
         
         
         
         
         
			
          
        }

}
