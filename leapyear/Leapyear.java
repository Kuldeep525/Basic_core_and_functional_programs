package com.leapyear.program;
import com.leapyear.utility.Utility;

public class Leapyear {
	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("enter leapyear you want to check");
		int ValueofYear = utility.getIntvalue();
		utility.checkLeapYear(ValueofYear);
	}

}
