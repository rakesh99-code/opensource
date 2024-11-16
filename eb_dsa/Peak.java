import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t -->0){
            int n = sc.nextInt();
            int[] x = new int[n];
            int max = Integer.MIN_VALUE;
            for(int i=0;i<n;i++){
                x[i] = sc.nextInt();
                if(x[i] >= max){
                    max = x[i];
                }
            }
            System.out.println(max);
        }
    }
}
