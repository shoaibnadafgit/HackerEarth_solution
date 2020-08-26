

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Monk_Welcome {

	public static void main(String args[] ) throws Exception {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int a[] = new int[n];
	for(int i=0;i<n;i++){
	a[i] = sc.nextInt();
	}
	for(int i=0;i<n;i++){
	int sum = 0;
	sum = a[i] + sc.nextInt();
	System.out.print(sum+" ");
	}

	}
	
}
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner in=new Scanner (System.in);
//		long n =in.nextLong();
//		long a[]=new long [(int)n];
//		long b[]=new long [(int)n];
//		long c[]=new long [(int)n];
//		for (int i=0;i<n;i++) 
//		{
//			a[i]=in.nextLong();
//		}
//		for (int i=0;i<n;i++) 
//		{
//			b[i]=in.nextLong();
//		}
//		
//		for (int i =0;i<n;i++) {
//			for (int j =0;j<n;j++) {
//				if(i==j)
//				c[j]=a[i]+b[j];
//			}
//		}
//		for (int i =0;i<n;i++) {
//			System.out.print(c[i]+" ");
//		}
//
//	}
//
//}
