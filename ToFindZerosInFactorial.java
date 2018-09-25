package org.btm.praticeApp.factorial;

import java.util.Scanner;

public class ToFindZerosInFactorial 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter value");
		int n=scan.nextInt();
		int sum=1;
		for(int i=1;i<=n;i++)
		{
			sum=sum*i;
		}
		System.out.println(sum);
		int count=0,j=5;
		while(j<=n)
		{
            count=count+n/j;
            j=j*5;
        }
		System.out.println("The factorial of "+ n +" is "+sum+" and it contain "+count);;
	}

}
