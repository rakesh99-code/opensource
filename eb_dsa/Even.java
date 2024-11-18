import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        int sum = 0;
        for(char c : num.toCharArray()){
            int pro = Character.getNumericValue(c);
            sum += pro;
        }
        if(sum % 2 == 0){
            System.out.println("Vignesh");
        }
        else{
            System.out.println("Charan");
        }
    }
}
