/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codejavaptit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class DoanhNghiep implements Comparable<DoanhNghiep>{
    private String maDN, tenDN;
    private int soLuongSV;

    public DoanhNghiep(String maDN, String tenDN, int soLuongSV) {
        this.maDN = maDN;
        this.tenDN = tenDN;
        this.soLuongSV = soLuongSV;
    }

    public int getSoLuongSV() {
        return soLuongSV;
    }

    @Override
    public int compareTo(DoanhNghiep o) {
        if(soLuongSV != o.soLuongSV) return -(soLuongSV - o.soLuongSV);
        else return maDN.compareToIgnoreCase(o.maDN);
    }

    @Override
    public String toString() {
        return maDN + " " + tenDN + " " + soLuongSV;
    }
    
}

public class J05028_DSDNNhanSVThucTap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<DoanhNghiep> dn = new ArrayList<>();
        for(int i = 0; i < n; i++){
            String ma = sc.nextLine();
            String tenDN = sc.nextLine();
            int soLuongSV = Integer.parseInt(sc.nextLine());
            dn.add(new DoanhNghiep(ma, tenDN, soLuongSV));
        }
        Collections.sort(dn);
        int q = Integer.parseInt(sc.nextLine());
        while(q-- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("DANH SACH DOANH NGHIEP NHAN TU " + a + " DEN " + b + " SINH VIEN:");
            for(DoanhNghiep x : dn){
                if(x.getSoLuongSV() >= a && x.getSoLuongSV() <= b) System.out.println(x);
            }
        }
        
    }
}
