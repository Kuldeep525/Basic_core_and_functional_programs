package com.triplet.program;
import  com.triplet.program.Utility;

public class Triplet {
	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("enter the number ");
		int n = utility.getIntvalue();
	    int[] arr = new int [n] ;
	    System.out.println("enter " + n +" value's in array" );
	    for(int i=0;i<n;i++) {
	    	arr[i]=utility.getIntvalue();
	    }
		utility.findTriplets(arr ,n);
	
		
	}

}
