package HackerEarth;
import java.util.*;
import java.lang.*;
public class ArithmaticProgration {
	
	public static void main(String args[] ) throws Exception {
	Scanner s = new Scanner(System.in);
	int t=s.nextInt();
	int a,b,c,d,count,e;
	for(int i=0;i<t;i++)
	{ count=0;
	a=s.nextInt();
	b=s.nextInt();
	c=s.nextInt();
	e=a+c;
	if(e%2==1||e%2==-1){
	if(e/2>=b){
	a-=1;
	}
	else{
	a+=1;
	}
	count=1;}
	d=(a+c)/2;
	count+=java.lang.Math.abs(b-d);
	System.out.println(count);
	}
	}
	
}
