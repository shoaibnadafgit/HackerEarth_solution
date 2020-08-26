package HackerEarth;
import java.util.*;
public class MonkAndRoration {

	public static void main(String[] args) {

		Scanner in =new Scanner (System.in);
		long test=in.nextLong();
		for (int t=0;t<test;t++)
		{
		int n=in.nextInt();
		long rotation =in.nextLong();
		long a[]=new long [n];
		for (int i =0;i<n;i++) {
			a[i]=in.nextLong();
		}
		
		for (int i=1;i<n;i++) {
			if(i<=rotation) {
			long temp =a[a.length-1];
			for (int j =a.length-1;j>0;j--) {
				//a[j]=a[j+1];
				a[j]=a[j-1];
//				a[i+1]=temp;
			}
		a[0]=temp;
		
		}
		}
		for (long i : a) {
		
			System.out.print(i+" ");
		}
		}
	}
//		Scanner sc=new Scanner(System.in);
//			int test=sc.nextInt();
//		
//		for(int i=0;i<test;i++)
//		{
//			int n=Integer.parseInt(sc.next());
//			int r=Integer.parseInt(sc.next());
//
//			int[] arr=new int[n];
//		for(int j=0;j<n;j++)
//		{
//			arr[j]=Integer.parseInt(sc.next());
//		}
//			//r=r%n;
//
//		for(int p=0;p<r;p++)
//		{
//			int temp=arr[n-1];
//			int j;
//		for( j=n-2;j>=0;j--)
//		{
//			arr[j+1]=arr[j];
//		}
//			arr[0]=temp;
//		}
//		for(int l=0;l<n;l++)
//		{
//			System.out.print(arr[l]+" ");
//		}
//			System.out.println();
//		}
//	}

}
