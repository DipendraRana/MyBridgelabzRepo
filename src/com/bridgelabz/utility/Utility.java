/***********************************************
 * purpose : To store all logic of the programs
 *           
 * @author Dipendra Rana
 * @version 1.0
 * @since 24 August 2017          
 ***********************************************/

package com.bridgelabz.utility;

import java.util.Scanner;

public class Utility {

	public static Scanner scan = new Scanner(System.in);

	public static int count = 0;
	
	//public static int sum=0;
	
	public static void couponGenerator(int number) {
		int iteration = 0, randomNum;
		int storeElement[] = new int[number];
		while (iteration < number) {
			randomNum = 0 + (int) (Math.random() * number);
			if (checkArray(iteration, randomNum, storeElement)) {
				storeElement[iteration] = randomNum;
				// System.out.println(storeElement[i]);
				iteration++;
			}
			count++;
		}
		System.out.println(count);
	}

	public static boolean checkArray(int index, int radomNum, int array[]) {
		int found = 0;
		if (index == 0)
			return true;
		else {
			for (int i = 1; i < index; i++) {
				if (array[i] == radomNum) {
					found = 1;
					break;
				}
			}
			if (found == 1)
				return false;
			else
				return true;
		}
	}

	public static Integer[][] intArrayIn(int row, int coloumn) {
		Integer array[][] = new Integer[row][coloumn];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < coloumn; j++)
				array[i][j] = scan.nextInt();
		}
		return array;
	}

	public static Double[][] doubleArrayIn(int row, int coloumn) {
		Double array[][] = new Double[row][coloumn];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < coloumn; j++)
				array[i][j] = scan.nextDouble();
		}
		return array;
	}

	public static Boolean[][] booleanArrayIn(int row, int coloumn) {
		Boolean array[][] = new Boolean[row][coloumn];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < coloumn; j++)
				array[i][j] = scan.nextBoolean();
		}
		return array;
	}

	public static <generic> void arrayDisplay(int row, int coloumn, 
											  generic array[][]) {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < coloumn; j++)
				System.out.print(array[i][j] + " ");
			System.out.println();
		}
	}

	public static void checkingInt(int intArray[]) {
		for (int i = 0; i < intArray.length; i++) {
			for (int j = i + 1; j < intArray.length; j++) {
				for (int k = j + 1; k < intArray.length; k++) {
					if (intArray[i] + intArray[j] + intArray[k] == 0) {
						System.out.println(intArray[i] + " " + intArray[j] + " " + intArray[k]);
						count++;
					}
				}
			}
		}
		System.out.println("The no. of such distinct tripletpairs are = " + count);
	}
	
	public static void replaceName(String name) {
		if(name.length()>=3) 
			System.out.println("Hello "+name+" ,How are you?");
		else
			System.out.println("Name should be greater than 3 characters");
	}
	
	public static void percentageHorT(int times) {
		double countT=0,countH=0;
		if(times>=1) {
			for(int i=0;i<times;i++) {
				if(Math.random()<0.5) 
					countT++;
				else 
					countH++;
			}
			System.out.println("Head appeared "+((countH/times)*100)+"%");
			System.out.println("Tail appeared "+((countT/times)*100)+"%");
		}
	}
	
	public static void leapYearFinder(int year) {
		if(Utility.numberOfDigitChecker(year)==4) {
			if((year%4==0&&year%100!=0)||(year%400==0))
				System.out.println("Leap Year");
			else
				System.out.println("Not Leap Year");
		}
	}
	
	public static int numberOfDigitChecker(int number) {
		while(number!=0) {
			number=number/10;
			count++;
		}
		return count;
	}
	
	public static void powerOf2(int power) {
		if(power>=0||power<31) {
			for(int i=0;i<power;i++) {
				System.out.println("2^"+i+" = "+(int)Math.pow(2,i));
			}
		}
	}
	
	public static void harmoninumber(int times) {
		double harmonicsum;
		for(double i=0;i<times;i++) {
			harmonicsum=0;
			for(double j=0;j<i+1;j++)
				harmonicsum=harmonicsum+(1/(j+1));
			System.out.println("H"+(int)(i+1)+" = "+harmonicsum);
		}
	}
	
}
