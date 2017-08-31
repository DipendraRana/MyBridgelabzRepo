package com.bridgelabz.programs;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
	
	public static Scanner input=new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=input.next();
		char save[]=s.toCharArray();
		String[] store=new String[save.length];
		store[0]=s;
		int j=save.length,k;
		char temp;
		//for(i=0;i<j;i++) {
			for(k=j-1;k!=0;k--) {
				temp=save[k-1];
				save[k-1]=save[j-1];
				save[j-1]=temp;
				System.out.println(Arrays.toString(save));
			}
			while(k>j-1) {
				temp=save[k+1];
				save[k+1]=save[j-1];
				save[j-1]=temp;
				k++;
				System.out.println(Arrays.toString(save));
			}
		//}
		
	}

}
