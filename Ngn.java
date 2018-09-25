package org.btm.praticeApp.NextGreaterNumber;

public class Ngn 
{
	public static void main(String[] args) 
	{
		int ar[]={4,5,2,25};
		int i,next;
		for(i=0;i<ar.length;i++)
		{
			next=-1;
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]<ar[j])
				{
					next=ar[j];
					break;
				}
			}
			System.out.println(ar[i]+"---->"+next);
		}

	}

}
