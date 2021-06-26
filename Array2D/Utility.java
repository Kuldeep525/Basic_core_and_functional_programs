package com.array.program;
import java.io.PrintWriter;
import java.util.Scanner;

public class Utility {
	Scanner scanner;
	
	public Utility() {
		scanner = new Scanner(System.in);
	}
	public int getValue() {
		return scanner.nextInt();
		}
	public double getDouble() {
		return scanner.nextDouble();
		}
	public boolean getBoolean() {
		return scanner.nextBoolean();
		}
	public <T> void print2DArray(T[][] inputArray, int rows , int columns ) {
		PrintWriter printwriter = new PrintWriter(System.out);
		for(int i=0; i< rows;i++)
		{
			for(int j = 0; j < columns; j++) {
				printwriter.write(inputArray[i][j]+" ");
				printwriter.flush();

			}
			System.out.println();
		}
	}
}


