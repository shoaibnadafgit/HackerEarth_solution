package HackerEarth;
import java.util.*;
public class Anagram {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		while(n-->0) {
		String s1=s.next();
		String s2=s.next();
		int l1=s1.length();
		int l2=s2.length();
		
		char[] ch1=s1.toCharArray();
		char[] ch2=s2.toCharArray();
		int [] cnt1=new int[26];
		int [] cnt2=new int[26];
		
		
		for (int i =0;i<l1;i++) {
			cnt1[ch1[i]-97]++;
		}
		for (int i =0;i<l2;i++) {
			cnt2[ch2[i]-97]++;
		}
		int cnt=0;
		for (int i =0;i<26;i++) {
		cnt+=Math.abs(cnt2[i]-cnt1[i]);
		}
		System.out.println(cnt);
		}
	}

}
