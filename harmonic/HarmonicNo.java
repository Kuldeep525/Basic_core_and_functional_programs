package com.harmonic.programs;

public class HarmonicNo {
	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("enter the number till harmonic value u want");
		int  n = utility.getIntvalue();
		utility.showHarmonicNumber(n);
		
	}

}
