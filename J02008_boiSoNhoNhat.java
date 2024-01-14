package codejavaptit;

import java.util.*;

public class J02008_boiSoNhoNhat {
    
    public static long gcd(long a, long b){
        while(b != 0){
            long r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
    
    public static long lcm(long a, long b){
        return a / gcd(a, b) * b;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            long tmp = 1;
            for(long i = 1; i <= n; i++){
                tmp = lcm(i, tmp);
            }
            System.out.println(tmp);
        }
    }
}
