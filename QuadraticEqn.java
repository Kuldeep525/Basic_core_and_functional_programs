package com.quadratic.programs;
import java.util.Scanner;
import java.lang.Math;
public class QuadraticEqn {
	
	public static void main(String[] args) {
		
		Double root1 ,root2;
		Scanner sc = new Scanner(System.in);
		Double a,b,c;
		System.out.println("enter the first number a: ");
		a = sc.nextDouble();
		System.out.println("enter the second number b: ");
		b = sc.nextDouble();
		System.out.println("enter the third number c: ");
		c = sc.nextDouble();
		// calculate the determinant (b^2-4ac)
		Double determinant = b * b - 4 * a * c ;
		 //check //two  real and distinct
		if (determinant > 0 ) {
			 root1 = (-b + Math.sqrt(determinant)) / (2 *a );
			 root2 = (-b - Math.sqrt(determinant)) / (2 * a );
			 System.out.println("root are real and distinct ");
		     System.out.println("root1 = " + root1 );
	   	 	System.out.println("root2 ="   + root2);
		}
		else if (determinant == 0) {
			//two equal and real root
			root1 = root2 = -b / (2 * a );
			 System.out.println("root are real and equal ");
			 System.out.println("root1 = " + root1 );
			 System.out.println("root2 ="   + root2);
			
		}
		else {
			// root are complex and different
			Double real = -b / (2 * a);
			Double imaginary = Math.sqrt(-determinant) / (2 * a );
			System.out.println("root1 = " + real + imaginary);
			System.out.println("\n root2 =" + real + imaginary);
			 System.out.println("root are complex and distinct ");
			
		}
	}

}
