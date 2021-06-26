package com.array.program;
import com.array.utility.Utility;

public class Array2D {
	public static void main(String[] args) {
		
		int choice;
		int rows = 0, columns = 0 ;
		Utility utility = new Utility();
		System.out.println("enter the chioce ");
		System.out.println("1. Create interger 2D arrray");
		System.out.println("2. Create Double 2D array ");
		System.out.println("3. Create boolean 2D array");
        choice = utility.getValue();
        
        if (choice > 0 && choice <= 3) 
        {
        
        	System.out.println("enter the rows & column ");
        	rows = utility.getValue();
        	columns = utility.getValue();
        	Integer[][] i1 = new Integer[rows][columns];
        	Double[][] d1 = new Double[rows][columns];
        	Boolean[][] b1 = new Boolean[rows][columns];
        	switch (choice) 
        	{
        	case 1:
        		System.out.println("enter the integer element ");
        		for(int i=0; i < rows; i++) {
        			for(int j=0; j<columns; j++)
        			{
        				i1[i][j] = utility.getValue();
        				
        			}
        		}
        		utility.print2DArray(i1,rows,columns);
        		break;
        	case 2 :
        		System.out.println("enter the double element ");
        		for(int i=0 ;i < rows; i++) {
        			for(int j=0; j < columns; j++) {
        				d1[i][j] = utility.getDouble();
        				
        			}
        			
        		}
        		utility.print2DArray(d1,rows,columns);
        		break;
        	case 3 :
        		System.out.println("enter the boolean elemnent");
        		for(int i=0; i < rows; i++)
        		{
        			for(int j=0;j<rows;j++) {
        				b1[i][j] = utility.getBoolean();
        				
        			}
        		}
        	  utility.print2DArray(b1,rows,columns);
        		break;
        	default :	
        		System.out.println("invalid choice. Enter between 1 & 3");
        		choice = utility.getValue();
        		if(choice > 3 && choice <= 0) {
        			System.out.println("you have enter invalid choice");
        			System.exit(0);
        		}
        	}
        			
        		}
        else {
        	System.out.println("you have enter wrong choice");     	
        	
        }
	}

}
