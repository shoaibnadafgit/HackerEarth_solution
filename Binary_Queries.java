package HackerEarth;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.print.DocFlavor.INPUT_STREAM;

public class Binary_Queries {

	public static void main(String args[] ) throws Exception {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		String lines =br.readLine(); 
		String arr[]=lines.split(" "); //declaring array
		int no_queries =Integer.parseInt(arr[1]);
		String list [] =br.readLine().split(" ");
		
		for(int i =1; i<=no_queries; i++){
			String[] query = br.readLine().split(" ");
			
			if(query[0].equals("1")){
				int index = Integer.parseInt(query[1])-1;
				if(list[index].equals("1"))
				list[index]="0";
			else
				list[index]="1";
				}
			else{
				// ODD or EVEN
				int r = Integer.parseInt(query[2]) - 1;
				if(list[r].equals("1")){
				System.out.println("ODD");
				}else{
				System.out.println("EVEN");
				}

		}
		
	}
	}
	}