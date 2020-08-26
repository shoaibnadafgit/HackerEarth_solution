//https://www.hackerearth.com/practice/notes/sorting-code-monk/
package HackerEarth;

import java.util.Scanner;

public class Insertion_Sort {


public static void main(String args[] ) throws Exception {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int A[] = new int[N];
		int P[] = new int[N];
		int B[] = new int[N];
		int p = 0;
		for (int i=0;i<N;i++)
		{
		A[i]=s.nextInt();
		B[i]=A[i];
		}
		
		for (int i=0;i<N;i++)
		{
		int temp = A[i];
		int j=i;
		for(;(j>0 && temp<A[j-1]);j--)
		{
		A[j]=A[j-1];
		}
		A[j]=temp;
		}
		System.out.println();
		for(int i=0;i<N;i++)
		{
		for(int j=0;j<N;j++)
		{
		if(B[i]==A[j])
		{
		p = j+1;
		break;
		}
		}
		P[i]=p;
		System.out.print(P[i] + " ");
		}
		
		}
		}