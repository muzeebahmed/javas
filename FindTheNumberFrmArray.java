package org.btm.arrayApp;

import java.util.Scanner;

public class FindTheNumberFrmArray 
{
	public static void main(String[] args) 
	{
		int a[]={2,5,7,9,10,15,22};
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number you want to find");
		int n=scan.nextInt();
		boolean input=false;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==n)
			{
				input=true;
				break;
			}
		}
		System.out.println(input);
	}
}
