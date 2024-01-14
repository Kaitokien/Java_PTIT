/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codejavaptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class MonHoc implements Comparable<MonHoc>{
    private String maMon, tenMon, hinhThucHocLT, hinhThucHocTH;
    private int soTinChi;

    public MonHoc(String maMon, String tenMon, int soTinChi, String hinhThucHocLT, String hinhThucHocTH) {
        this.maMon = maMon;
        this.tenMon = tenMon;
        this.hinhThucHocLT = hinhThucHocLT;
        this.hinhThucHocTH = hinhThucHocTH;
        this.soTinChi = soTinChi;
    }

    public String getHinhThucHocTH() {
        return hinhThucHocTH;
    }

    @Override
    public int compareTo(MonHoc o) {
        return maMon.compareToIgnoreCase(o.maMon);
    }

    @Override
    public String toString() {
        return maMon + " " + tenMon + " " + soTinChi + " " + hinhThucHocLT + " " + hinhThucHocTH;
    }
    
    
}

public class J07073_dangKyHinhThucGiangDay {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<MonHoc> monhoc = new ArrayList<>();
        for(int i = 0; i < n; i++){
            String ma = sc.nextLine();
            String tenMon = sc.nextLine();
            int soTinChi = Integer.parseInt(sc.nextLine());
            String hthlt = sc.nextLine();
            String hthth = sc.nextLine();
            monhoc.add(new MonHoc(ma, tenMon, soTinChi, hthlt, hthth));
        }
        Collections.sort(monhoc);
        for(MonHoc x : monhoc){
            if(x.getHinhThucHocTH().compareToIgnoreCase("Truc tiep") != 0){
                System.out.println(x);
            }
        }
    }
}
