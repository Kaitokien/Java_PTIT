package codejavaptit;

import java.util.Scanner;

public class J02012_sapXepChen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int step = 0;
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            int x = a[i], pos = i - 1;
            while(pos >= 0 && x < a[pos]){
                a[pos + 1] = a[pos];
                pos--;
            }
            a[pos + 1] = x;
            System.out.print("Buoc " + step++ + ": ");
            for(int u = 0; u <= i; u++){
                System.out.print(a[u] + " ");
            }
            System.out.println("");
        }
    }
}
