package com.power.programs;
import java.util.Scanner;


public class Utility {
     Scanner scanner;
      
     public Utility() {
    	 scanner = new Scanner(System.in);
     }
    	 
     public int getIntValue() {
    	 return scanner.nextInt();
     }
     
     public void getPoweroftwo( int n ) {
    	 if (n >=0 && n<=31) {
    		 int power = 1;
    		 for (int i=0; i<=n; i++) {
    			 power = (1<<i);
    			 System.out.println("2^"+i+ "=" + power);
    			 
    		
    		 }
    	
    		 }
    		 }
     }
    
 
     
    	 
    	 
    	 
     

