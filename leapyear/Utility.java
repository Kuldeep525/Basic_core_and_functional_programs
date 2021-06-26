package com.leapyear.program;
import java.util.Scanner;

public class Utility {
	Scanner scanner ;
	public Utility() {
		scanner = new Scanner(System.in);
		
	}
	public int getIntvalue() {
		return scanner.nextInt();
	}

	public void checkLeapYear( int ValueofYear) {
		int temp = ValueofYear , noOfDigit=0;
		do {
			noOfDigit++;
			 ValueofYear =  ValueofYear/10;
		}while( ValueofYear != 0);
		if(noOfDigit == 4) {
	    	if((temp % 4 == 0) && (temp % 400 == 0 || temp % 100 == 0))
	    		System.out.println(temp+ "is a leapyear");
	    	else
	    		System.out.println(temp+ "is not leapyear");
	  }
		else
			System.out.println(temp+ "is not a valid leap year");
	}
}
