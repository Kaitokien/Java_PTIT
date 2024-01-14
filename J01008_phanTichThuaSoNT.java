package codejavaptit;

import java.util.Arrays;
import java.util.Scanner;

public class J01008_phanTichThuaSoNT {

    public static void nt(int n){
        for(int i = 2; i <= Math.sqrt(n); i++){
            int cnt = 0;
            while(n % i == 0){
                ++cnt;
                n /= i;
            }
            if(cnt > 0) System.out.print(i + "(" + cnt + ")" + " ");
        }
        if(n > 1) System.out.print(n + "(1)");
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int u = 1; u <= t; u++){
            int n = sc.nextInt();
            System.out.print("Test " + u + ": ");
            nt(n);
            System.out.println("");
        }
    }
}
