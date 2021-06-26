package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class Flipcoin {
	public static void main(String[] args) {
	Utility utility = new Utility();
	System.out.println("enter the no of times coin flip");
	int numberofFlip = utility.getIntValue();
	utility.flipcoin(numberofFlip);
	
	}
}

