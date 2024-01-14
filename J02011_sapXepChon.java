package codejavaptit;

import java.util.Scanner;

public class J02011_sapXepChon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int step = 1;
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        for(int i = 0; i < n - 1; i++){
            System.out.print("Buoc " + step++ + ": ");
            int min = i;
            for(int j = i + 1; j < n; j++){
                if(a[j] < a[min]){
                    min = j;
                }
            }
            int tmp = a[i];
            a[i] = a[min];
            a[min] = tmp;
            for(int x : a){
                System.out.print(x + " ");
            }
            System.out.println("");
        }
    }
}
