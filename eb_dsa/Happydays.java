import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            for(int j=0;j<n;j++){
                a[j] = sc.nextInt();
            }
            for(int k=0;k<n;k++){
                b[k] = sc.nextInt();
            }
            int happydays = 0;
            for(int m=0;m<n;m++){
                if(b[m] <= 2 * a[m]  && a[m] <= 2 * b[m]){
                    happydays++;
                }
            }
            System.out.println(happydays);
        }
    }
}
