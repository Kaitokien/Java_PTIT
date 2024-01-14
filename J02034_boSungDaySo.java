package codejavaptit;

import java.util.*;

public class J02034_boSungDaySo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        int n = sc.nextInt();
        int[] a = new int[205];
        int to = -1;
        for(int i = 1; i <= n; i++){
            int tmp = sc.nextInt();
            to = Math.max(to, tmp);
            a[tmp] = 1;
        }
        boolean check = true;
        for(int i = 1; i <= to; i++){
            if(a[i] == 0){
                check = false;
                arr.add(i);
            }
        }
        if(check) System.out.println("Excellent!");
        else{
            for(int x : arr){
                System.out.println(x);
            }
        }
    }
}
