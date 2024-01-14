package codejavaptit;

import static java.lang.Math.max;
import java.util.Scanner;

public class J01014_uocSoNtLonNhat {
    
    public static long nt(long n){
        int ans = 0;
        for(int i = 2; i <= Math.sqrt(n); i++){
            while(n % i == 0){
                ans = max(ans, i);
                n /= i;
            }
        }
        if(n > 1) return n;
        else return ans;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();
            System.out.println(nt(n));
        }
    }
}
