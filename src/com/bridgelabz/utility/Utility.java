/***********************************************
 * purpose : To store all logic of the programs
 *           
 * @author Dipendra Rana
 * @version 1.0
 * @since 24 August 2017          
 ***********************************************/

package com.bridgelabz.utility;

import java.util.Scanner;
import java.util.ArrayList;

public class Utility {

	public static Scanner scan = new Scanner(System.in);

	public static int count = 0;

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

	public static <generic> void arrayDisplay(int row, int coloumn, 
								ArrayList<ArrayList<generic>> array) {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < coloumn; j++)
				System.out.format("%2d ", array.get(i).get(j));
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
		if (name.length() >= 3)
			System.out.println("Hello " + name + " ,How are you?");
		else
			System.out.println("Name should be greater than 3 characters");
	}

	public static void percentageHorT(int times) {
		double countT = 0, countH = 0;
		if (times >= 1) {
			for (int i = 0; i < times; i++) {
				if (Math.random() < 0.5)
					countT++;
				else
					countH++;
			}
			System.out.println("Head appeared " + ((countH / times) * 100) + "%");
			System.out.println("Tail appeared " + ((countT / times) * 100) + "%");
		}
	}

	public static void leapYearFinder(int year) {
		if (Utility.numberOfDigitChecker(year) == 4) {
			if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
				System.out.println("Leap Year");
			else
				System.out.println("Not Leap Year");
		}
	}

	public static int numberOfDigitChecker(int number) {
		while (number != 0) {
			number = number / 10;
			count++;
		}
		return count;
	}

	public static void powerOf2(int power) {
		if (power >= 0 || power < 31) {
			for (int i = 0; i < power; i++) {
				System.out.println("2^" + i + " = " + (int) Math.pow(2, i));
			}
		}
	}

	public static void harmoninumber(int times) {
		double harmonicsum;
		for (double i = 0; i < times; i++) {
			harmonicsum = 0;
			for (double j = 0; j < i + 1; j++)
				harmonicsum = harmonicsum + (1 / (j + 1));
			System.out.println("H" + (int) (i + 1) + " = " + harmonicsum);
		}
	}

	@SuppressWarnings("unchecked")
	public static <T> T genericTwoDArray(int row, int coloumn, int choose) {
		ArrayList<ArrayList<T>> twoDArray = new ArrayList<ArrayList<T>>();
		for (int i = 0; i < row; i++)
			twoDArray.add(new ArrayList<T>());
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < coloumn; j++)
				if (choose == 1)
					twoDArray.get(i).add((T) Integer.valueOf(scan.nextInt()));
				else if (choose == 2)
					twoDArray.get(i).add((T) Double.valueOf(scan.nextDouble()));
				else
					twoDArray.get(i).add((T) Boolean.valueOf(scan.nextBoolean()));
		}
		return (T) twoDArray;
	}
	
	public static void primeFactorization(int number) {
		int product=1,staticNo=number;
		int i=2;
		while(i<=number){
			if(primeChecker(i)&&number%i==0&&product!=staticNo) {
				System.out.println(i);
				product=product*i;
				number=number/i;
			}
			else if(product==staticNo)
				break;
			else
				i++;
		}
	}
	
	public static boolean primeChecker(int number) {
		count=0;
		for(int i=2;i<=number/2;i++) {
			if(number%i==0)
				count++;
		}
		if(count==0)
			return true;
		else
			return false;
	}

	public static void gamblingSimulator(int stake,int goal,int noOfTimes) {
		int win=0;
		for(int i=0;i<noOfTimes;i++) {
			int cash=stake;
			while(cash>0&&cash<goal) {
				if(Math.random()<0.5) 
					cash++;
				else 
					cash--;
				}
			if(cash==goal)
				win++;
		}
		System.out.println("no. of Wins = "+win);
		System.out.println("Wins is "+((double)win/noOfTimes*100)+"%");
		System.out.println("Wins is "+(100-(double)win/noOfTimes*100)+"%");
	}
	
	public static void euclideanDistance(int xPoint,int yPoint) {
		double distance=Math.sqrt(Math.pow(xPoint, 2)+Math.pow(yPoint,2));
		System.out.println("Euclidean distance from the point ("+xPoint+","+yPoint+
							") to the origin (0,0) is "+distance);
	}

	public static void quadraticRootFinder(int aValue,int bValue,int cValue) {
		double root1,root2;
		int delta=(int)Math.pow(bValue, 2)-(4*aValue*cValue);
		if(delta==0) {
			System.out.println("There is only one real root");
			root1=(-bValue+Math.sqrt(delta))/(2*aValue);
			System.out.println("root = "+root1);
		}
		else if(delta>0) {
			System.out.println("There is two real root");
			root1=(-bValue+Math.sqrt(delta))/(2*aValue);
			root2=(-bValue-Math.sqrt(delta))/(2*aValue);
			System.out.println("root1 = "+root1);
			System.out.println("root2 = "+root2);
		}
		else
			System.out.println("No root posiible");
	}

	public static void effectiveTemperature(double tempFahrenheit,double speed) {
		if(tempFahrenheit>50&&speed>120||speed<3) {
			double windChill=35.74+0.6215+
					(0.4275*tempFahrenheit-35.75)*Math.pow(speed, 0.16);
			System.out.println(windChill);
		}
	}
	
	public static void stopWatchSimulator() {
		long startTime=System.currentTimeMillis();
		long total = 0;
	    for (int i = 0; i < 200000000; i++) {
	      total = total+ i;
	    }
		long stopTime=System.currentTimeMillis();
		System.out.println(stopTime-startTime+" millisecond");
	}

	public static void ticTacToeSimulator(char[][] board) {
		
	}
}