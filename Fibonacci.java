package org.btm.praticeApp.fibbanoci;

import java.util.Scanner;

public class Fibonacci 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of values");
		int n=scan.nextInt();
		int a=0,b=1,s;
		System.out.print(a+" "+b+" ");
		for(int i=2;i<n;i++)
		{
			s=a+b;
			System.out.print(s+" ");
			a=b;
			b=s;
		}
	}

}
