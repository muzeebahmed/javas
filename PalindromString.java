package org.btm.praticeApp.polindrom;

import java.util.Scanner;

public class PalindromString 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the word");
		String st=sc.next();
		boolean rs=isPalindrom(st);
			if(rs)
				System.out.println("The word is Palindrom");
			else
				System.out.println("The word is not a Palindrom");
	}

	private static boolean isPalindrom(String st) 
	{
		char ch[]=st.toCharArray();
		String st1="";
		for(int i=ch.length-1;i>=0;i--)
		{
				st1=st1+ch[i];
		}
		if(st.equalsIgnoreCase(st1))
			return true;
		else
			return false;
	}

}
