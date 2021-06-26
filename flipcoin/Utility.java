package com.bridgelabz.utility;
import java.util.Scanner;


public class Utility {
	Scanner scanner;
	
public Utility() {
	scanner = new Scanner(System.in);
}
public int getIntValue( ) {
	return scanner.nextInt();
	
}
 //method to return flip coin percentile 
public  void flipcoin(int numberofFlip) {
	double heads = 0 ,tails = 0 ;
	for(int i=0;i <  numberofFlip; i++) {
	double side = Math.random();
	if(side>0.5) {
		heads++;
	}
	else {
		tails++;
	 }
	
	}
	System.out.println("number of heads occurance :: " + heads);
	System.out.println("number of tails occurance :: " + (numberofFlip-heads));
	double headpercent = ((heads * 100)/numberofFlip);
	double tailpercent = ((tails * 100)/numberofFlip);
	System.out.println("heads percentage ::"  + headpercent + "%");
	System.out.println("tails percentage ::"  + tailpercent + "%");
	
	
}
	 
	
	
	
	
	

}
