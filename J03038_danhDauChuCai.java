package codejavaptit;

import java.util.*;

public class J03038_danhDauChuCai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] mark = new int[258];
        for(char x : s.toCharArray()){
            mark[x] = 1;
        }
        int dem = 0;
        for(int i = 0; i < 256; i++) dem += mark[i];
        System.out.println(dem);
    }
}
