package codejavaptit;

import java.util.Scanner;

public class J01002_tinhTong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            long ans = (long)(1 + n) * n / 2;
            System.out.println(ans);
        }
    }
}
