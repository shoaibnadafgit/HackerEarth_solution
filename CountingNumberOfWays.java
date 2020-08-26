package HackerEarth;


	 
	import java.io.DataInputStream;
	import java.io.FileInputStream;
	import java.io.IOException;
	import java.io.PrintWriter;
	 
	/*
	 * To change this license header, choose License Headers in Project Properties.
	 * To change this template file, choose Tools | Templates
	 * and open the template in the editor.
	 */
	 
	/**
	 *
	 * @author Hemant Dhanuka
	 */
//bottomup oprtimization
	public class CountingNumberOfWays {
 
	    static int mod=1000000007;
	    
	    static class Reader
	    {
	        final private int BUFFER_SIZE = 1 << 16;
	        private DataInputStream din;
	        private byte[] buffer;
	        private int bufferPointer, bytesRead;
	        
	        //only for fast input
	        public Reader()
	        {
	            din = new DataInputStream(System.in);
	            buffer = new byte[BUFFER_SIZE];
	            bufferPointer = bytesRead = 0;
	        }
	 
	        public Reader(String file_name) throws IOException
	        {
	            din = new DataInputStream(new FileInputStream(file_name));
	            buffer = new byte[BUFFER_SIZE];
	            bufferPointer = bytesRead = 0;
	        }
	 
	        public String readLine() throws IOException
	        {
	            byte[] buf = new byte[64]; // line length
	            int cnt = 0, c;
	            while ((c = read()) != -1)
	            {
	                if (c == '\n')
	                    break;
	                buf[cnt++] = (byte) c;
	            }
	            return new String(buf, 0, cnt);
	        }
	 
	        public int nextInt() throws IOException
	        {
	            int ret = 0;
	            byte c = read();
	            while (c <= ' ')
	                c = read();
	            boolean neg = (c == '-');
	            if (neg)
	                c = read();
	            do
	            {
	                ret = ret * 10 + c - '0';
	            }  while ((c = read()) >= '0' && c <= '9');
	 
	            if (neg)
	                return -ret;
	            return ret;
	        }
	 
	        public long nextLong() throws IOException
	        {
	            long ret = 0;
	            byte c = read();
	            while (c <= ' ')
	                c = read();
	            boolean neg = (c == '-');
	            if (neg)
	                c = read();
	            do {
	                ret = ret * 10 + c - '0';
	            }
	            while ((c = read()) >= '0' && c <= '9');
	            if (neg)
	                return -ret;
	            return ret;
	        }
	 
	        public double nextDouble() throws IOException
	        {
	            double ret = 0, div = 1;
	            byte c = read();
	            while (c <= ' ')
	                c = read();
	            boolean neg = (c == '-');
	            if (neg)
	                c = read();
	 
	            do {
	                ret = ret * 10 + c - '0';
	            }
	            while ((c = read()) >= '0' && c <= '9');
	 
	            if (c == '.')
	            {
	                while ((c = read()) >= '0' && c <= '9')
	                {
	                    ret += (c - '0') / (div *= 10);
	                }
	            }
	 
	            if (neg)
	                return -ret;
	            return ret;
	        }
	 
	        private void fillBuffer() throws IOException
	        {
	            bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
	            if (bytesRead == -1)
	                buffer[0] = -1;
	        }
	 
	        private byte read() throws IOException
	        {
	            if (bufferPointer == bytesRead)
	                fillBuffer();
	            return buffer[bufferPointer++];
	        }
	 
	        public void close() throws IOException
	        {
	            if (din == null)
	                return;
	            din.close();
	        }
	    }
	 
	   public static void main(String[] args) throws IOException {
	       		PrintWriter w = new PrintWriter(System.out);
	 
	         Reader s=new Reader();
	                     int dp[][]=new int[10001][101];
	                     preProcessing(dp);
	        int totalCases=s.nextInt();
	        for(int i=0;i<totalCases;i++){
	            int N=s.nextInt();
	            int k=s.nextInt();
	            w.println(dp[N][k]);
	 
	            //System.out.println(dp[N][k]);
	    }
	        w.close();
	}
	   
	   
	   
	 
	    
	    private static void preProcessing(int[][] dp) {
	        for (int k = 1; k <= 100; k++) {
	            dp[0][k] = 1;
	        }
	        
	        for(int k=1;k<=100;k++){
	            int sum=0; 
	            for(int i=1;i<=10000;i++){
	             //we tried to reduce complexity as O(n*k)
	             //for particular k we are holding sum of previous k values <--- this is key to optimise 
	                if(i<=k){             
	                    sum=(sum+dp[i-1][k])%mod;
	                    dp[i][k]=sum;
	                }
	                else{
	                    sum=(sum+dp[i-1][k])%mod;  //adding dp[i-1][k] to stored last k value
	                    sum=((sum+mod)-dp[i-(k+1)][k])%mod;   //exclude k+1th terms in sum
	                    dp[i][k]=sum;
	                }
	               
	            }
	        }
	    }
	}


