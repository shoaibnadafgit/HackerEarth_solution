//https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/find-product/

package HackerEarth;

import java.util.Scanner;

public class Find_product {

	public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in); 
        int n=sc.nextInt();
        long a[]=new long[n];
        long pdt=1;
        long m=1000000007;
        for(int i=0;i<n;i++){
            a[i]=sc.nextLong();
            pdt=(pdt*a[i])%m;
        }
        System.out.println(pdt);

    }

}
