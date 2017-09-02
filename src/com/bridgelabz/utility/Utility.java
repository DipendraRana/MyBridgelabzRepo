/***********************************************
 * purpose : To store all logic of the programs
 *           
 * @author Dipendra Rana
 * @version 4.0
 * @since 24 August 2017          
 ***********************************************/

package com.bridgelabz.utility;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Utility {

	public static Scanner scan = new Scanner(System.in);

	public static int count = 0,countn=0;
	
	public static ArrayList<String> store;
	
	public static ArrayList<Integer> storeBinary=new ArrayList<Integer>();
	
	public static String[] weeks= {"SUN","MON","TUE","WED","THU","FRI","SAT"};
	
	public static int[] daysInMonth= {31,28,31,30,31,30,31,31,30,31,30,31,30,31};
	
	public static int middleIndex=0;
	
	public static long startTime,stopTime;
	
	public static long[] elapsedTime=new long[2];
	
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

	public static boolean leapYearFinder(int year) {
		if (Utility.numberOfDigitChecker(year) == 4) {
			if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
				return true;
				//System.out.println("Leap Year");
			else
				return false;
				//System.out.println("Not Leap Year");
		}
		else
			return false;
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

	public static void ticTacToeSimulator() {
		int[][] board=new int[3][3];
		if(Math.random()>0.5) {
			System.out.println("User won the Toss");
			userMove(board);
		}
		else {
			System.out.println("Computer won the Toss");
			pcMove(board);
		}	
	}
	
	public static void pcMove(int[][] board) {
		int row=(int)(Math.random()*3);
		int column=(int)(Math.random()*3);
		if(board[row][column]!=1) {
			System.out.println("Computer Turn");
			System.out.println(row+" , "+column);
			board[row][column]=1;
			if(isCheckmate(board))
				System.out.println("PC won");
			else
			userMove(board);
		}
		else {
			pcMove(board);
		}
	}
	
	public static void userMove(int[][] board) {
		System.out.println("Your Turn");
		System.out.println("Choose your move");
		int row=scan.nextInt();
		int column=scan.nextInt();
		if(board[row][column]!=1) {
			System.out.println(row+" , "+column);
			board[row][column]=1;
			if(isCheckmate(board)) 
				System.out.println("You won");
			else
			pcMove(board);
		}
		else {
			System.out.println("You choose the non-empty field");
			userMove(board);
		}
	}
	
	public static boolean isCheckmate(int[][] board) {
		if(board[0][0]==1&&board[1][0]==1&&board[2][0]==1) //row(0-2),column(0)
			return true;
		else if(board[0][1]==1&&board[1][1]==1&&board[2][1]==1)	//row(0-2),column(1)
			return true;
		else if(board[0][2]==1&&board[1][2]==1&&board[2][2]==1)	//row(0-2),column(2)
			return true;
		else if(board[0][0]==1&&board[0][1]==1&&board[0][2]==1)	//row(0),column(0-2)
			return true;
		else if(board[1][0]==1&&board[1][1]==1&&board[1][2]==1)	//row(1),column(0-2)
			return true;
		else if(board[2][0]==1&&board[2][1]==1&&board[2][2]==1)	//row(2),column(0-2)
			return true;
		else if(board[0][0]==1&&board[1][1]==1&&board[2][2]==1)	
			return true;
		else if(board[0][2]==1&&board[1][1]==1&&board[2][0]==1)
			return true;
		else 
			return false;	
	}
	
	public static boolean anagramChecker(String word1,String word2) {
		if(word1.length()==word2.length()) {
			for(int j=0;j<word1.length();j++) {
				for(int i=0;i<word1.length();i++) {
					if(word1.charAt(i)==word1.charAt(j))
						count++;
				}
				for(int i=0;i<word2.length();i++) {
					if(word1.charAt(j)==word2.charAt(i))
						countn++;
				}
				if(count!=countn) {
					//System.out.println("Anagram Not Possible");
					return false;
				}
			}
			if(count==countn) {
			//System.out.println("It is Anagram"); 
			return true;
			}
			else
				return false;
		}
		else {
			//System.out.println("Not Anagram");
			return false;
		}
	}

	public static ArrayList<String> primeFinderInRange(int minRange,int maxRange) {
		store=new ArrayList<String>();
		for(int i=minRange;i<maxRange;i++) {
			if(primeChecker(i)&&i!=0&&i!=1) {
				//System.out.println(i);
				store.add(Integer.toString(i));
			}	
		}
		return store;
	}

	public static void primeBothPalindromeAndAnagram(int minRange,int maxRange) {
		ArrayList<String> secondryStorage=new ArrayList<String>();
		primeFinderInRange(minRange,maxRange);
		for(int i=0;i<store.size();i++) {
			if(palindromeChecker(store.get(i)))
				secondryStorage.add(store.get(i));
		}
		//System.out.println(secondryStorage);
		int count=0;
		for(int i=0;i<secondryStorage.size();i++) {
			for(int j=i+1;j<secondryStorage.size();j++) 
				if(anagramChecker(secondryStorage.get(i),secondryStorage.get(j))) {
					System.out.println(secondryStorage.get(i)+" "+
							secondryStorage.get(j));
					count++;
				}
		}
		if(count==0)
			System.out.print("There is no Such Prime number");
	}
		
	public static boolean palindromeChecker(String word) {
		count=0;
		int length=word.length();
		for(int i=0,j=length-1;i<=j&&length>1&&j>=i;i++,j--) {
				if(word.charAt(i)!=word.charAt(j))
					return false;
		}
		return true;
	} 
	
	public static int checkNumOfDigits(int number) {
		while(number!=0) {
			number=number/10;
			count++;
		}
		return count;
	}

	public static int dayOfWeek(int day,int month,int year) {
		int y0= year-(14-month)/12;
		int x=y0+y0/4-y0/100+y0/400;
		int m0=month+12*((14-month)/12)-2;
		int dayOfWeek=(day+x+31*m0/12)%7;
		return dayOfWeek;
	}

	public static void temperatureConversion(int choice) {
		System.out.print("Enter the temperature:");
		double temperature=scan.nextDouble();
		if(choice==1) {
			temperature=(temperature*9/5)+32;
			System.out.println(temperature+" F");
		}
		else {
			temperature=(temperature-32)*5/9;
			System.out.println(temperature+" C");
		}
	}

	public static void monthlyPayment(int principal,int year,float ratePerYear) {
		int months=12*year;
		float ratePerMonth=ratePerYear/(12*100);
		double payment=(principal*ratePerMonth)/1-Math.pow(1+ratePerMonth, -months);
		System.out.printf("%.2f",payment);
	}

	public static void sqrt(double number) {
		double temperory=number;
		double eplison=1e-15;
		while(Math.abs(temperory-number/temperory)>eplison*temperory)
			temperory=(number/temperory+temperory)/2;
		System.out.println(temperory);
	}
	
	public static void convertToBinary(int decimalNo) {
		//ArrayList<Integer> storeBinary=new ArrayList<Integer>();
		int incriment=0;
		while(decimalNo!=0||incriment<32){
			storeBinary.add(decimalNo%2);
			decimalNo=decimalNo/2;
			incriment++;
		}
		Collections.reverse(storeBinary);
		/*System.out.println(storeBinary.toString().replace("[","").
							replace("]","").replace(",", ""));*/
		swapper(0,7);
	}
	
	public static void swapper(int startingIndex,int lastIndex) {
		if(startingIndex>24&&lastIndex>32) {
			/*System.out.println(storeBinary.toString().replace("[","").
					replace("]","").replace(",", ""));*/
			checkingForPowerOf2(findValueOfBinary());
		}
		else {
			int halfOctet=(lastIndex+startingIndex)/2;
			for(int i=startingIndex,j=halfOctet+1;i<=halfOctet;i++,j++) {
				int temp=storeBinary.get(i);
				storeBinary.set(i, storeBinary.get(j));
				storeBinary.set(j, temp);
			}
			swapper(startingIndex+8,lastIndex+8);
		}
	}
	
	public static int findValueOfBinary() {
		int sum=0;
		for(int i=storeBinary.size()-1,j=0;i>-1;i--,j++)
			sum=(int) (sum+storeBinary.get(i)*Math.pow(2, j));
		//System.out.println(sum);
		return sum;
	}
	
	public static void checkingForPowerOf2(int number) {
		int power=(int)(Math.log10(number)/Math.log10(2));
		if(Math.pow(2, power)==number)
			System.out.println(number+" is power of two");
		else
			System.out.println(number+" is Not!!!power of two");
	}

	public static void calender(int month,int year) {
		daysInMonth[1]=28;
		String[][] calender=new String[7][7];
		for(int i=0;i<7;i++) 
			calender[0][i]=weeks[i];
		if(!leapYearFinder(year)||month!=2) {
			calenderDatesFillUp(calender,month,year);
		}
		else {
			daysInMonth[1]=29;
			calenderDatesFillUp(calender,month,year);
		}
		for(int i=0;i<7;i++) {
			for(int j=0;j<7;j++) {
				if(calender[i][j]==null)
					System.out.format("    ");
				else
					System.out.format("%3s ",calender[i][j]);
			}	
			System.out.println();
		}
	}
	
	public static void calenderDatesFillUp(String[][] calender,int month,int year) {
		for(int i=1,k=1;i<7&&k<=daysInMonth[month-1];i++) {
			if(i==1) {
				for(int j=dayOfWeek(1,month,year);j<7;j++,k++)
					calender[1][j]=Integer.toString(k);
			}
			else {
				for(int j=0;j<7&&k<=daysInMonth[month-1];j++,k++)
					calender[i][j]=Integer.toString(k);
			}
		}
	}

	@SuppressWarnings("unchecked")
	public static <T extends Comparable<T>> void insertingElement(T[] array) {
		if(array instanceof String[] ) {
			System.out.println("Insert String element");
			for(int i=0;i<array.length;i++)
				array[i]=(T) scan.next();
		}
		else {
			System.out.println("Insert Integer element");
			for(int i=0;i<array.length;i++)
				array[i]=(T) Integer.valueOf(scan.nextInt());
		}	
		
	}

	public static void sortingElapsedTime(long[] array) {
		for(int i=0;i<array.length;i++) {
			for(int j=1;j<array.length;j++)
				if(array[j-1]<array[j]) {
					long temporary=array[j-1];
					array[j-1]=array[j];
					array[j]=temporary;
				}
		}
		System.out.println("elapsed times performance(millisecond):"+Arrays.toString(array));
	}
	
	public static <T extends Comparable<T>> void binarySearch(T[] array,
						T intElement,int startingIndex,int lastIndex) {
		middleIndex=(startingIndex+lastIndex)/2;
		if(intElement.equals(array[middleIndex]))
			System.out.println("Found the Word");
		else if(startingIndex==lastIndex)
			System.out.println("There is no such element");
		else {
			if(array[middleIndex].compareTo((T) intElement)>0)	
				binarySearch(array,intElement,startingIndex,middleIndex);
			else
				binarySearch(array,intElement,middleIndex+1,lastIndex);				
		}
	}
	
	public static <T extends Comparable<T>> void bubbleSort(T[] array) {
		for(int i=0;i<array.length;i++) {
			for(int j=1;j<array.length;j++) {
				if(array[j-1].compareTo(array[j])>0) {
					T temporary=array[j-1];
					array[j-1]=array[j];
					array[j]=temporary;
				}
			}	
		}
	}
	
	public static <T extends Comparable<T>>void insertionSort(T[] array) {
		for(int i=0;i<array.length;i++) {
			T insertingElement=array[i];
			for(int j=0;j<=i;j++) {
				if(array[j].compareTo(array[i])>0) {
					for(int k=i;k>j;k--)
						array[k]=array[k-1];
					array[j]=insertingElement;
				}
			}
		}
	}	

	public static <T> void casses(T[] array,int choice) {
		if(array instanceof Integer[]&&(choice==1||choice==2))
			integerType((Integer[]) array,choice);
		else
			stringType((String[])array,choice);
	}
	
	public static void integerType(Integer[] array,int choice) {
		startTime=System.currentTimeMillis();
		insertingElement(array);
		if(choice==1)
			bubbleSort(array);
		else
			insertionSort(array);
		stopTime=System.currentTimeMillis();
		elapsedTime[0]=stopTime-startTime;
		System.out.println(Arrays.toString(array));
		System.out.println("Time taken is:"+elapsedTime[0]);
		startTime=System.currentTimeMillis();
		System.out.println("Enter the integer elment you want to search:");
		Integer intElement=Integer.valueOf(scan.next());
		System.out.println(intElement);
		binarySearch(array,intElement, 0, array.length-1);
		stopTime=System.currentTimeMillis();
		elapsedTime[1]=stopTime-startTime;
		System.out.println("Time taken is:"+elapsedTime[1]);
		Utility.sortingElapsedTime(elapsedTime);

	}
	
	public static void stringType(String[] array,int choice) {
		startTime=System.currentTimeMillis();
		insertingElement(array);
		if(choice==3)
			bubbleSort(array);
		else
			insertionSort(array);
		stopTime=System.currentTimeMillis();
		elapsedTime[0]=stopTime-startTime;
		System.out.println(Arrays.toString(array));
		System.out.println("Time taken is:"+elapsedTime[0]);
		startTime=System.currentTimeMillis();
		System.out.println("Enter the String elment you want to search:");
		String stringElement=scan.next();
		binarySearch(array,stringElement, 0,array.length-1);
		stopTime=System.currentTimeMillis();
		elapsedTime[1]=stopTime-startTime;
		System.out.println("Time taken is:"+elapsedTime[1]);
		Utility.sortingElapsedTime(elapsedTime);
	}

}