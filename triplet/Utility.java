package com.triplet.program;
import java.util.Scanner;
import java.io.*;
public class Utility {
	Scanner scanner;
	
	public Utility() {
		scanner = new Scanner(System.in);
	}
	public int getIntvalue() {
		return scanner.nextInt();
	}
	static String triplet = " ";

	public  void findTriplets( int arr[], int n  )
	
	{
		String str = " ";
		boolean found = true;
		for (int i=0;i< n; i++) {
			for(int j=i+1; j < n ;j++) {
				for(int k=j+1;k < n ;k++) {
					if (arr[i]+arr[j]+arr[k] == 0) {
					
						
						
					     str = " "+ arr[i] + arr[j] + arr[k] ;
					     if ( ! triplet.contains( str )) {
					    	 System.out.println(arr[i] + " " + arr[j] + " " + arr[k]); 
					    	 triplet += str ;
					     }
						found = true;
					}
				
				}
			}
		}
		if(found == false) {
			System.out.println("not exist");
		}
		 
		
	}
}
