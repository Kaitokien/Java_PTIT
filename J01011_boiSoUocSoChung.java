package codejavaptit;

import java.util.Scanner;

public class J01011_boiSoUocSoChung {
    
    public static int gcd(int a, int b){
        while(b != 0){
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println((long)a / gcd(a, b) * b + " " + gcd(a, b));
        }
    }
}
