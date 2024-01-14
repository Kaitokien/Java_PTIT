/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codejavaptit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class J02102_maTranXoanOcTangDan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][n];
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                int so = sc.nextInt();
                arr.add(so);
            }
        }
        Collections.sort(arr);
        int idx = 0;
        int h1 = 0, h2 = n - 1, c1 = 0, c2 = n - 1;
        while(h1 <= h2 && c1 <= c2 && idx < arr.size()){
            for(int i = c1; i <= c2; i++){
                if(idx < arr.size()) a[h1][i] = arr.get(idx++);
            }
            ++h1;
            for(int i = h1; i <= h2; i++){
                if(idx < arr.size()) a[i][c2] = arr.get(idx++);
            }
            c2--;
            for(int i = c2; i >= c1; i--){
                if(idx < arr.size()) a[h2][i] = arr.get(idx++);
            }
            h2--;
            for(int i = h2; i >= h1; i--){
                if(idx < arr.size()) a[i][c1] = arr.get(idx++);
            }
            c1++;
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
