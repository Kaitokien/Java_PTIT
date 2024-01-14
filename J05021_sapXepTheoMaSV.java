///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package codejavaptit;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.Scanner;
//
//class SinhVien implements Comparable<SinhVien>{
//    private String maSV, hoTen, lop, email;
//
//    public SinhVien(String maSV, String hoTen, String lop, String email) {
//        this.maSV = maSV;
//        this.hoTen = hoTen;
//        this.lop = lop;
//        this.email = email;
//    }
//
//    @Override
//    public String toString() {
//        return maSV + " " + hoTen + " " + lop + " " + email;
//    }
//
//    @Override
//    public int compareTo(SinhVien o) {
//        return maSV.compareToIgnoreCase(o.maSV);
//    }
//    
//}
//
//public class J05021_sapXepTheoMaSV {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        ArrayList<SinhVien> sinhvien = new ArrayList<>();
//        while(sc.hasNext()){
//            SinhVien x = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
//            sinhvien.add(x);
//        }
//        Collections.sort(sinhvien);
//        for(SinhVien x : sinhvien){
//            System.out.println(x);
//        }
//    }
//}
