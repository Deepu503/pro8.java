/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int N,sum=0,count;
		Scanner Sc=new Scanner(System.in);
		N=Sc.nextInt();
		for(count=1;count<=N;count++)
		{
			sum=sum+count;
		}
			System.out.println(sum);
		}
	}
