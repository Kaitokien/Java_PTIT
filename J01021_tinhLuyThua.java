package codejavaptit;

import java.util.Scanner;

public class J01021_tinhLuyThua {
    
    public static int mod = (int)1000000007;
    
    public static long luythua(long a, long b){
        if(b == 0) return 1;
        if(b == 1) return a;
        long ans = luythua(a, b / 2);
        if(b % 2 == 0) return (ans % mod) * (ans % mod) % mod;
        else return (((ans % mod) * (ans % mod)) % mod * (a % mod)) % mod;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            long a = sc.nextLong(), b = sc.nextLong();
            if(a == 0 && b == 0) break;
            System.out.println(luythua(a, b));
        }
    }
}
