package codejavaptit;

import java.util.Arrays;
import java.util.Scanner;

public class J01013_tongUocSo_1 {
    public static int[] arr = new int[2000001];
    
    public static void xuly(){
        Arrays.fill(arr, 1);
        arr[0] = arr[1] = 0;
        int can = (int)Math.sqrt(2000001);
        for(int i = 2; i <= can; i++){
            if(arr[i] == 1){
                arr[i] = i;
                for(int j = i * i; j < 2000001; j += i){
                    arr[j] = i;
                }
            }
        }
        for(int i = can; i < 2000001; i++){
            if(arr[i] == 1) arr[i] = i;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int ans = 0;
        xuly();
        while(t-- > 0){
            int n = sc.nextInt();
            while(n > 1){
                ans += arr[n];
                n /= arr[n];
            }
        }
        System.out.println(ans);
    }
}
