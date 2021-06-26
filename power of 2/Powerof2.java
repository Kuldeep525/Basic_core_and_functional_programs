package com.power.programs;
import com.power.utility.Utility;

public class Powerof2 {
	public static void main(String[] args ) {
		Utility utility = new Utility();
		System.out.println("enter the value of power:");
		int n = utility.getIntValue();
		utility.getPoweroftwo(n);
	}

}
