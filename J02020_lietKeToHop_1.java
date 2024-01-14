package codejavaptit;

import java.util.*;

public class J02020_lietKeToHop_1 {
    public static int[] a = new int[20];
    public static int dem = 0;
    
    public static void kq(int k){
        for(int i = 1; i <= k; i++){
            System.out.print(a[i]);
        }
        System.out.print(" ");
        ++dem;
    }
    
    public static void Try(int i, int n, int k){
        for(int j = a[i - 1] + 1; j <= n - k + i; j++){
            a[i] = j;
            if(i == k) kq(k);
            else Try(i + 1, n, k);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        a[0] = 0;
        Try(1, n, k);
        System.out.println("");
        System.out.println("Tong cong co " + dem + " to hop");
    }
}
