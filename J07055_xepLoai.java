/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codejavaptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

//class SinhVien{
//    private String maSV, hoTen, xepLoai;
//    private double diemTongKet;
//
//    public SinhVien(int maSV, String hoTen, int diemLuyenTap, int diemThucHanh, int diemThi) {
//        this.maSV = String.format("SV%02d", maSV);
//        this.hoTen = chuanHoaTen(hoTen);
//        this.diemTongKet = diemLuyenTap * 0.25 + diemThucHanh * 0.35 + diemThi * 0.4;
//        this.xepLoai = rank();
//    }
//    
//    public String rank(){
//        if(diemTongKet >= 8) return "GIOI";
//        else if(diemTongKet >= 6.5) return "KHA";
//        else if(diemTongKet >= 5) return "TRUNG BINH";
//        else return "KEM";
//    }
//    
//    public String chuanHoaTen(String s){
//        String ten = "";
//        String[] arr = s.trim().split("\\s+");
//        for(String x : arr){
//            ten += Character.toUpperCase(x.charAt(0)) + x.substring(1).toLowerCase() + " ";
//        }
//        return ten.substring(0, ten.length() - 1);
//    }
//
//    public double getDiemTongKet() {
//        return diemTongKet;
//    }
//
//    @Override
//    public String toString() {
//        return maSV + " " + hoTen + " " + String.format("%.2f", diemTongKet) + " " + xepLoai;
//    }
//    
//}

//public class J07055_xepLoai {
//    public static void main(String[] args) throws FileNotFoundException{
//        Scanner sc = new Scanner(new File("SINHVIEN.in"));
//        int n = Integer.parseInt(sc.nextLine());
//        SinhVien[] sv = new SinhVien[n];
//        for(int i = 0; i < n; i++){
//            String hoTen = sc.nextLine();
//            int diemLuyenTap = Integer.parseInt(sc.nextLine());
//            int diemThucHanh = Integer.parseInt(sc.nextLine());
//            int diemThi = Integer.parseInt(sc.nextLine());
//            sv[i] = new SinhVien(i + 1, hoTen, diemLuyenTap, diemThucHanh, diemThi);
//        }
//        Arrays.sort(sv, new Comparator<SinhVien>(){
//            @Override
//            public int compare(SinhVien o1, SinhVien o2) {
//                double first = o1.getDiemTongKet();
//                double second = o2.getDiemTongKet();
//                if(first > second) return -1;
//                else return 1;
//            }            
//        });
//        for(int i = 0; i < n; i++){
//            System.out.println(sv[i]);
//        }
//    }
//}
