//Given an integer n, return true if it is possible to represent n as the sum of distinct powers of three. Otherwise, return false.

An integer y is a power of three if there exists an integer x such that y == 3x.

import java.util.Scanner;
class Solution {
    public static boolean checkPowersOfThree(int n) {
        for(int i=14;i>=0;i--){
            int no = (int)Math.pow(3,i);
            if(n-no>=0){//30=27+3(3^3)+3
                n-=no;
            } 
        }
        return n==0;
    }
    public static void main(String[] args){
       Scanner scan= new Scanner(System.in);
       int n= scan.nextInt();
       boolean result= checkPowersOfThree(n);
       System.out.println(result);
    }
}
