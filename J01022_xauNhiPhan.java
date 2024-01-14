package codejavaptit;

import java.util.Scanner;

public class J01022_xauNhiPhan {
    
    public static long[] F = new long[94];
    
    public static void fibo(){
        F[1] = 1; F[2] = 1;
        for(int i = 3; i < 94; i++){
            F[i] = F[i - 1] + F[i - 2];
        }
    }
    
    public static long xuly(long n, long k){
        if(n == 1){
            return 0;
        }
        if(n == 2){
            return 1;
        }
        if(k <= F[(int)n - 2]) return xuly(n - 2, k);
        else return xuly(n - 1, k - F[(int)n - 2]);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        fibo();
        while(t-- > 0){
            long n = sc.nextLong();
            long k = sc.nextLong();
            System.out.println(xuly(n, k));
        }
    }
}
