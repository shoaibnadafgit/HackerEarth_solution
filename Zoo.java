package HackerEarth;

import java.util.Scanner;

public class Zoo {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.next();
		int l=s.length();
		char[] ch=s.toCharArray();
		int x=0,y=0;
		if(l<21) {
			for (int i=0;i<l;i++) {
				if (ch[i]=='z')
					x++;
				if(ch[i]=='o')
					y++;
							}
			if (x*2==y)
				System.out.println("Yes");
			else 
				System.out.println("No");

		}

	}

}
