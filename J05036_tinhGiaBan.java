/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codejavaptit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class MatHang implements Comparable<MatHang>{
    private String ma, tenHang, dvi;
    private double phivc, thanhTien, giaBan;
    private long gia_ban;

    public MatHang(int ma, String tenHang, String dvi, double donGia, int soLuong) {
        this.ma = String.format("MH%02d", ma);
        this.tenHang = tenHang;
        this.dvi = dvi;
        this.phivc = (donGia * soLuong) / 20;
        this.thanhTien = donGia * soLuong + this.phivc;
        this.giaBan = (this.thanhTien + this.thanhTien / 50) / soLuong;
        long num = 0;
        if((long)this.giaBan % 100 > 0){
            num = ((long)this.giaBan / 100 + 1) * 100;
        }
        if(num != 0) gia_ban = num;
        else gia_ban = (long)this.giaBan;
    }

    @Override
    public String toString() {
        return ma + " " + tenHang + " " + dvi + " " + Math.round(phivc) + " " + Math.round(thanhTien) + " " + gia_ban;
    }

    @Override
    public int compareTo(MatHang o) {
        if(giaBan > o.giaBan) return -1;
        else if(giaBan < o.giaBan) return 1;
        else return 0;
    }
}

public class J05036_tinhGiaBan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<MatHang> mathang = new ArrayList<>();
        for(int i = 0; i < n; i++){
            String tenHang = sc.nextLine();
            String donvi = sc.nextLine();
            double donGia = Double.parseDouble(sc.nextLine());
            int soLuong = Integer.parseInt(sc.nextLine());
            mathang.add(new MatHang(i + 1, tenHang, donvi, donGia, soLuong));
        }
        Collections.sort(mathang);
        for(int i = 0; i < n; i++){
            System.out.println(mathang.get(i));
        }
    }
}
