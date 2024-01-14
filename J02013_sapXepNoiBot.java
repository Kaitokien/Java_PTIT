package codejavaptit;

import java.util.Scanner;

public class J02013_sapXepNoiBot {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int step = 1;
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        for(int i = 0; i < n - 1; i++){
            boolean check = true;
            for(int j = 0; j < n - i - 1; j++){
                if(a[j] > a[j + 1]){
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                    check = false;
                }
            }
            if(check == false){
                System.out.print("Buoc " + step++ + ": ");
                for(int x : a){
                    System.out.print(x +  " ");
                }
                System.out.println("");
            }
        }
    }
}
