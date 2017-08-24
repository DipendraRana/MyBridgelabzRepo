/***********************************************
 * purpose : Finding Leap Year
 *           
 * @author Dipendra Rana
 * @version 1.0
 * @since 24 August 2017          
 ***********************************************/

package com.bridgelabz.programs;

import java.util.Scanner;
import com.bridgelabz.utility.Utility;

public class LeapYear {
	
	public static Scanner input=new Scanner(System.in); 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year=input.nextInt();
		Utility.leapYearFinder(year);
	}
}
