package HackerEarth;
//https://www.hackerearth.com/practice/algorithms/searching/ternary-search/practice-problems/algorithm/monk-visits-coderland-4/
import java.util.Scanner;

public class Monk_visit_coderLand {

	public static void main(String[] args) {
		Scanner in =new Scanner (System.in);
		long test =in.nextLong();
		for (int z=0;z<test;z++) {
		double n =in.nextDouble();
		double []a=new double[(int) n];
		double []b=new double[(int) n];
		double prod1=1;
		double prod2=1;
		for (int i=0;i<n;i++) {
			a[i]=in.nextDouble();
		prod1=prod1*a[i];
		}
		for (int i=0;i<n;i++) {
			b[i]=in.nextDouble();
			prod2=prod2*b[i];
		}
		long res= (long) (prod1+prod2);
		System.out.println(res);
		}
		}
		}
/*test case passed but code not accepting 
 * 1
2
5 1
1 2
7
 * 
 * */
