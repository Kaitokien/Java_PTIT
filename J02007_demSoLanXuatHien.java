package codejavaptit;

import java.util.Scanner;

public class J02007_demSoLanXuatHien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int u = 1; u <= t; u++){
            System.out.println("Test " + u + ":");
            int[] mark = new int[100009];
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
                ++mark[a[i]];
            }
            for(int i = 0; i < n; i++){
                if(mark[a[i]] != 0){
                    System.out.println(a[i] + " xuat hien " + mark[a[i]] + " lan");
                    mark[a[i]] = 0;
                }
            }
        }
    }
}
