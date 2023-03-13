package sample;

import java.util.Scanner;

public class tes {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ur word");
		String s=sc.next();
		
		
		String rev="";
		for(int i=s.length()-1;i>=0;i--) 
		{
			
		
			String res=rev+s.charAt(i);
			System.out.println(res);
			
		}
		
	}
	
	
	
	
	
	
	
	
}
