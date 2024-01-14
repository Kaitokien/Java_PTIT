/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codejavaptit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class MatHang implements Comparable<MatHang>{
    private String tenMH, nhomHang;
    private double loiNhuan;
    private int ma;
    public MatHang(int ma, String tenMH, String nhomHang, double giaMua, double giaBan) {
        this.ma = ma;
        this.tenMH = tenMH;
        this.nhomHang = nhomHang;
        this.loiNhuan = giaBan - giaMua;
    }

    @Override
    public String toString() {
        return ma + " " + tenMH + " " + nhomHang + " " + String.format("%.2f", loiNhuan);
    }

    @Override
    public int compareTo(MatHang o) {
        if(loiNhuan > o.loiNhuan) return -1;
        else if(loiNhuan < o.loiNhuan) return 1;
        return 0;
    }
    
}

public class J05010_sapXepDanhSachMatHang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<MatHang> mathang = new ArrayList<>();
        for(int i = 0; i < n; i++){
            String tenMH = sc.nextLine();
            String nhomHang = sc.nextLine();
            double giaMua = Double.parseDouble(sc.nextLine());
            double giaBan = Double.parseDouble(sc.nextLine());
            mathang.add(new MatHang(i + 1, tenMH, nhomHang, giaMua, giaBan));
        }
        Collections.sort(mathang);
        for(MatHang x : mathang){
            System.out.println(x);
        }
    }
}
