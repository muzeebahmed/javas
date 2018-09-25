package org.btm.dsApp;

public class BubbleSort 
{
	public static void main(String[] args) 
	{
		int a[]={ 64, 34, 25, 12, 22, 11, 90 };
		System.out.println("Before sort");
		for(int k=0;k<a.length;k++)
		{
			System.out.print(a[k]+" ");
		}
		System.out.println();
		int n=a.length;
		isBubbleSort(a,n);
		System.out.println("sorted array");
		printArray(a,n);
	}

	private static void printArray(int[] a, int n) 
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}

	private static void isBubbleSort(int[] a, int n) 
	{
		int i,j,temp;
		for(i=0;i<n-1;i++)
		{
			for(j=0;j<n-1;j++)
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
	}
}
