package codejavaptit;

import java.util.Scanner;

public class J01016_chuSo4va7 {
    
    public static void xuly(long n){
        int ans = 0;
        while(n > 0){
            long r = n % 10;
            if(r == 7 || r == 4) ++ans;
            n /= 10;
        }
        if(ans == 4 || ans == 7) System.out.println("YES");
        else System.out.println("NO");
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        xuly(n);
    }
}
