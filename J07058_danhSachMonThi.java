///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package codejavaptit;
//
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//import java.util.Scanner;
//
//class MonHoc implements Comparable<MonHoc>{
//    private String maMon, tenMon, hinhThucThi;
//
//    public MonHoc(String maMon, String tenMon, String hinhThucThi) {
//        this.maMon = maMon;
//        this.tenMon = tenMon;
//        this.hinhThucThi = hinhThucThi;
//    }
//
//    @Override
//    public String toString() {
//        return maMon + " " + tenMon + " " + hinhThucThi;
//    }
//
//    
//    @Override
//    public int compareTo(MonHoc o) {
//        return this.maMon.compareToIgnoreCase(o.maMon);
//    }
//    
//}
//
//public class J07058_danhSachMonThi {
//    public static void main(String[] args) throws FileNotFoundException {
//        Scanner sc = new Scanner(new File("MONHOC.in"));
//        int n = Integer.parseInt(sc.nextLine());
//        List<MonHoc>  monhoc = new ArrayList<>();
//        for(int i = 0; i < n; i++){
//            String maMon = sc.nextLine();
//            String tenMon = sc.nextLine();
//            String hinhThucThi = sc.nextLine();
//            monhoc.add(new MonHoc(maMon, tenMon, hinhThucThi));
//        }
//        Collections.sort(monhoc);
//        for(MonHoc x : monhoc){
//            System.out.println(x);
//        }
//    }
//}
