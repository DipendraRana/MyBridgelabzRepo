package com.bridgelabz.programs;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	
	public static Scanner input=new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row=input.nextInt();
		int coloumn=input.nextInt();
		ArrayList<ArrayList<Integer>> array=new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<row;i++)
			array.add(new ArrayList<Integer>());
		for(int i=0;i<row;i++) {
			for(int j=0;j<coloumn;j++)
				array.get(i).add(input.nextInt());
		}
		for(int i=0;i<row;i++) {
			for(int j=0;j<coloumn;j++)
				System.out.format("%2d",array.get(i).get(j));
			System.out.println();
		}
	}

}
