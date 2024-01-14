///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package codejavaptit;
//
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.util.Arrays;
//import java.util.Comparator;
//import java.util.Scanner;
//
//class SinhVien{
//    private String maSV, hoTen;
//    private double diemTongKet;
//    private int xepHang;
//
//    public SinhVien(int maSV, String hoTen, int mon1, int mon2, int mon3) {
//        this.maSV = String.format("SV%02d", maSV);
//        this.hoTen = chuanHoaTen(hoTen);
//        this.diemTongKet = (mon1 * 3 + mon2 * 3 + mon3 * 2) / 8f;
//    }
//
//    public String getMaSV() {
//        return maSV;
//    }
//
//    public int getXepHang() {
//        return xepHang;
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
//    public void setXepHang(int xepHang) {
//        this.xepHang = xepHang;
//    }
//
//    public double getDiemTongKet() {
//        return diemTongKet;
//    }
//
//    @Override
//    public String toString() {
//        return maSV + " " + hoTen + " " + String.format("%.2f", diemTongKet) + " " + xepHang;
//    }
//    
//}
//
//public class J07054_tinhDiemTrungBinh {
//    public static void main(String[] args) throws FileNotFoundException{
//        Scanner sc = new Scanner(new File("SINHVIEN.in"));
//        int n = Integer.parseInt(sc.nextLine());
//        SinhVien[] sv = new SinhVien[n];
//        for(int i = 0; i < n; i++){
//            String hoTen = sc.nextLine();
//            int mon1 = Integer.parseInt(sc.nextLine());
//            int mon2 = Integer.parseInt(sc.nextLine());
//            int mon3 = Integer.parseInt(sc.nextLine());
//            sv[i] = new SinhVien(i + 1, hoTen, mon1, mon2, mon3);
//        }
//        
//        Arrays.sort(sv, new Comparator<SinhVien>(){
//            @Override
//            public int compare(SinhVien o1, SinhVien o2) {
//                double a = o1.getDiemTongKet();
//                double b = o2.getDiemTongKet();
//                if(a > b) return -1;
//                else if(a < b) return 1;
//                else{
//                    return o1.getMaSV().compareToIgnoreCase(o2.getMaSV());
//                }
//            }            
//        });
//        sv[0].setXepHang(1);
//        for(int i = 1; i < n; i++){
//            if(sv[i].getDiemTongKet() != sv[i - 1].getDiemTongKet()){
//                sv[i].setXepHang(i + 1);
//            }
//            else{
//                sv[i].setXepHang(sv[i - 1].getXepHang());
//            }
//        }
//        for(SinhVien x : sv){
//            System.out.println(x);
//        }
//    }
//}
