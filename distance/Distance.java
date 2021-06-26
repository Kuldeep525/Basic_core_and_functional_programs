package com.distance.program;
import java.util.Scanner;
import java.lang.Math;

public class Distance {

	public static void main(String[] args ) {
		int x , y ;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of x");
		x = sc.nextInt();
		System.out.println("enter the value of y ");
		y = sc.nextInt();
		Double distance = Math.pow(x, 2) + Math.pow( y , 2);
		System.out.println("Distance from (" + x + " , " + y + " ) to ( 0,0) is "  + distance );
		
		
		
	}
}
