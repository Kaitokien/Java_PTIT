/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codejavaptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class MaTran{
    private int[][] a;
    private int cot, n, m;

    public MaTran(int n, int m, int i) {
        this.a = new int[n][m];
        this.n = n;
        this.m = m;
        this.cot = i;
    }
    
    public void nhapMaTran(Scanner sc){
        for(int u = 0; u < n; u++){
            for(int v = 0; v < m; v++){
                a[u][v] = sc.nextInt();
            }
        }
    }
    
    public void sapXep(){
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i < n; i++){
            arr.add(a[i][cot - 1]);
        }
        Collections.sort(arr, new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1, o2);
            }
            
        });
        for(int i = 0; i < n; i++){
            a[i][cot - 1] = arr.get(i);
        }
    }
    
    public void inMaTran(){
        sapXep();
        for(int u = 0; u < n; u++){
            for(int v = 0; v < m; v++){
                System.out.print(a[u][v] + " ");
            }
            System.out.println("");
        }
    }
    
}

public class J07076_sapXepMaTran {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MATRIX.in"));
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int i = sc.nextInt();
            MaTran mt = new MaTran(n, m, i);
            mt.nhapMaTran(sc);
            mt.inMaTran();
        }
    }
}
