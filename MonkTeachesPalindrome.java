package HackerEarth;

import java.util.Scanner;

public class MonkTeachesPalindrome {


	public static void main(String args[] ) throws Exception {
	Scanner s=new Scanner(System.in);
	int t=s.nextInt();
	for(int j=1;j<=t;j++){
	String st=s.next();
	String rev="";
	int length=st.length();
	for(int i=length-1;i>=0;i--){
	rev=rev+st.charAt(i);
	}
	if(st.equals(rev))
	{
	if(length%2==0){
	System.out.println("YES EVEN");
	}
	else{
	System.out.println("YES ODD");
	}
	}
	else
	System.out.println("NO");
	}
	}
	}
	
//		Scanner in =new Scanner (System.in);
//		int n =in.nextInt();
//		String s[]=new String[n];
//		String r[]=new String[n];
//		for (int i =0;i<n;i++) {
//		s[i]=in.next();
//		for (int j = s[i].length()-1;j>=0;j--) 
//		{
//			r[i]=r[i]+s[i].charAt(i);
//		}
//		if(r[i].equals(s[i]))
//			System.out.println("YES");
//		else 
//			System.out.println("NO");
//		}
//	}
//
//}
