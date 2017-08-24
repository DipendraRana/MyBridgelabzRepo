/***********************************************
 * purpose : A library for reading in 2D arrays 
 * 			 of integers, doubles, or booleans 
 * 			 from standard input and printing 
 * 			 them out to standard output.
 *           
 * @author Dipendra Rana
 * @version 1.0
 * @since 24 August 2017          
 ***********************************************/

package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;
import java.util.Scanner;

public class TwoDArrays {

	public static Scanner input = new Scanner(System.in);

	public static void main(String args[]) {
		int row = input.nextInt();
		int coloumn = input.nextInt();
		System.out.println("Input Integer");
		Utility.arrayDisplay(row, coloumn, Utility.intArrayIn(row, coloumn));
		System.out.println("Input Double");
		Utility.arrayDisplay(row, coloumn, Utility.doubleArrayIn(row, coloumn));
		System.out.println("Input Boolean");
		Utility.arrayDisplay(row, coloumn, Utility.booleanArrayIn(row, coloumn));
	}
}
