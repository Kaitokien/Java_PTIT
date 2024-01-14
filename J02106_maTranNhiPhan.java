package codejavaptit;

import java.util.*;

public class J02106_maTranNhiPhan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][] a = new int[n][3];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < 3; j++){
                a[i][j] = sc.nextInt();
            }
        }
        int ans = 0;
        for(int i = 0; i < n; i++){
            int so_1 = 0;
            for(int j = 0; j < 3; j++){
                if(a[i][j] == 1) ++so_1;
            }
            if(so_1 > 3 - so_1) ++ans;
        }
        System.out.println(ans);
    }
}
