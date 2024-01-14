package codejavaptit;

import java.util.*;

public class J02022_soXaCach {
    public static int n;
    public static int[] a;
    public static boolean[] kiemtra;
    
    public static boolean check(){
    for(int i = 1; i < n; i++){
        if(Math.abs(a[i] - a[i + 1]) == 1) return false;
    }
    return true;
}

public static void in(){
    for(int i = 1; i <= n; i++){
        System.out.print(a[i]);
    }
}

public static void ql(int i){
    for(int j = 1; j <= n; j++){
        if(!kiemtra[j]){
            kiemtra[j] = true;
            a[i] = j;
            if(i == n){
                if(check()){
                    in();
                    System.out.println("");
                }
            }
            else ql(i + 1);
            kiemtra[j] = false;
        }
    }
}
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            n = sc.nextInt();
            a = new int[n + 1];
            kiemtra = new boolean[n + 1];
            ql(1);
        }
    }
}
