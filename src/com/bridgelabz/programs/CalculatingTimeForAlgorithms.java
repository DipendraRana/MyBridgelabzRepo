package com.bridgelabz.programs;

import java.util.Arrays;
import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class CalculatingTimeForAlgorithms {
	
	public static Scanner scan=new Scanner(System.in);
	
	public static int numberofElementinteger,numberofElementString;
	
	public static int intElement;
	
	public static String stringElement;
	
	public static long[] elapsedTime=new long[2];
	
	public static long startTime,stopTime;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number of element you want in both array:");
		numberofElementinteger=scan.nextInt();
		numberofElementString=scan.nextInt();
		int[] intArray= new int[numberofElementinteger];
		String[] stringArray= new String[numberofElementString];
		
		
		System.out.println("Choose the operation:");
		System.out.println("1.Bubble Sort-Binary Search(Int)");
		System.out.println("2.Insertion Sort-Binary Search(Int)");
		System.out.println("3.Bubble Sort-Binary Search(String)");
		System.out.println("4.Insertion Sort-Binary Search(String)");
		int choice=scan.nextInt();
		switch(choice) {
		case 1: startTime=System.currentTimeMillis();
				Utility.insertingIntElement(intArray);
				Utility.bubbleSortInt(intArray);
				stopTime=System.currentTimeMillis();
				elapsedTime[0]=stopTime-startTime;
				System.out.println(Arrays.toString(intArray));
				startTime=System.currentTimeMillis();
				System.out.println("Enter the integer elment you wnat to search:");
				intElement=scan.nextInt();
				Utility.binarySearchInteger(intArray,intElement, 0, intArray.length-1);
				stopTime=System.currentTimeMillis();
				elapsedTime[1]=stopTime-startTime;
				Utility.sortingElapsedTime(elapsedTime);
				break;

		case 2:	startTime=System.currentTimeMillis();
				Utility.insertingIntElement(intArray);
				Utility.insertionSortInt(intArray);
				stopTime=System.currentTimeMillis();
				elapsedTime[0]=stopTime-startTime;
				System.out.println(Arrays.toString(intArray));
				startTime=System.currentTimeMillis();
				System.out.println("Enter the integer elment you wnat to search:");
				intElement=scan.nextInt();
				Utility.binarySearchInteger(intArray,intElement, 0, intArray.length-1);
				stopTime=System.currentTimeMillis();
				elapsedTime[1]=stopTime-startTime;
				Utility.sortingElapsedTime(elapsedTime);
				break;
				
		case 3:	startTime=System.currentTimeMillis();
				Utility.insertingStringElement(stringArray);
				Utility.bubbleSortString(stringArray);
				stopTime=System.currentTimeMillis();
				elapsedTime[0]=stopTime-startTime;
				System.out.println(Arrays.toString(stringArray));
				startTime=System.currentTimeMillis();
				System.out.println("Enter the String elment you wnat to search:");
				stringElement=scan.next();
				Utility.binarySearchString(stringArray,stringElement, 0,stringArray.length-1);
				stopTime=System.currentTimeMillis();
				elapsedTime[1]=stopTime-startTime;
				Utility.sortingElapsedTime(elapsedTime);
				break;
				
		case 4:	startTime=System.currentTimeMillis();
				Utility.insertingStringElement(stringArray);
				Utility.insertionSortString(stringArray);
				stopTime=System.currentTimeMillis();
				elapsedTime[0]=stopTime-startTime;
				System.out.println(Arrays.toString(stringArray));
				startTime=System.currentTimeMillis();
				System.out.println("Enter the String elment you wnat to search:");
				stringElement=scan.next();
				Utility.binarySearchString(stringArray,stringElement, 0,stringArray.length-1);
				stopTime=System.currentTimeMillis();
				elapsedTime[1]=stopTime-startTime;
				Utility.sortingElapsedTime(elapsedTime);
				break;
		}
	}

}
