import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] x = new int[n];
        for(int i=0;i<n;i++){
            x[i] = sc.nextInt();
        }
        int[] y = new int[n];
        int total = 0;
        for(int num : x){
            total += num;
        }
        int left = 0;
        for(int i=0;i<n;i++){
            int right = total - left -x[i];
            y[i] = Math.abs(left - right);
            left += x[i];   
        }
        for(int i=0;i<n;i++){
            System.out.print(y[i]);
            if(i < n - 1){
                System.out.println(" ");
            }
        }
    }
}
