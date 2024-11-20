import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	   Scanner sc = new Scanner(System.in);
	   int t =  sc.nextInt();
	   while(t -->0){
	       int n = sc.nextInt();
	       int m = sc.nextInt();
	       int[] a1 = new int[n];
	       int[] b1 = new int[m];
	       for(int i=0;i<n;i++){
	           a1[i] = sc.nextInt();
	       }
	       for(int i=0;i<m;i++){
	           b1[i] = sc.nextInt();
	       }
	       int c=0;
	       for(int i=0;i<m;i++){
	           int re=b1[i]-1;
	           if(a1[re]>0){
	               a1[re]--;
	           }else{
	               c++;
	           }
	       }
	       System.out.println(c);
	   }
	   
	}
}
