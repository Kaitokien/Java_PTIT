package codejavaptit;

import java.util.Scanner;
import java.util.HashSet;
import java.util.TreeSet;

public class J02005_giao2DaySo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        TreeSet<Integer> set1 = new TreeSet<>();
        TreeSet<Integer> set2 = new TreeSet<>();
        int[] a = new int[n]; int[] b = new int[m];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
            set1.add(a[i]);
        }
        for(int i = 0; i < m; i++){
            b[i] = sc.nextInt();
            if(set1.contains(b[i]) == true){
                set2.add(b[i]);
            }
        }
        for(int x : set2){
            System.out.print(x + " ");
        }
    }
}
