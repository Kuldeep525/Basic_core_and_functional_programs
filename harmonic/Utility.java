package com.harmonic.programs;
import java.util.Scanner;

public class Utility {
      Scanner scanner;
      
     public Utility() {
    	 scanner = new Scanner(System.in);
    	
     }
      
     public int getIntvalue( ) {
    	 return scanner.nextInt();
     }
      public void  showHarmonicNumber(int n ) {
    	  if (n == 0) {
    		  System.out.println("take higher than  number  ::" + n);
    	  }
    	  else {       	  
    	      double sum = 0.0;
    	      for (int i=1; i<=n; i++ ) {
    		  sum += 1.0 / i;
    		  System.out.println("harmonic number are ::" + sum);
    		 
    		  
    	      }
    	  }
    		  
    		  
    		
    	  }
      }
      
      
      
      


