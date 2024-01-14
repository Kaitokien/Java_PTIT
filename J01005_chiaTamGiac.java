package codejavaptit;

import java.util.Scanner;

public class J01005_chiaTamGiac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int h = sc.nextInt();
            for(int i = 1; i <= n - 1; i++){
                double ans = Math.sqrt(1.0 * i / n) * h * 1.0;
                System.out.printf("%.6f", ans);
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
