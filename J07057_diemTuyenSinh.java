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
//class ThiSinh{
//    private String ma, hoTen, trangThai;
//    private double tongDiem;
//
//    public ThiSinh(int ma, String hoTen, String danToc, double diem, int khuVuc) {
//        this.ma = String.format("TS%02d", ma);
//        this.hoTen = chuanHoaTen(hoTen);
//        this.tongDiem = diem;
//        if(khuVuc == 1) this.tongDiem += 1.5;
//        else if(khuVuc == 2) tongDiem += 1;
//        if(danToc.compareToIgnoreCase("Kinh") != 0){
//            this.tongDiem += 1.5;
//        }
//    }
//    
//    public void setTrangThai(){
//        if(this.tongDiem >= 20.5) this.trangThai = "Do";
//        else this.trangThai = "Truot";
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
//    public String getMa() {
//        return ma;
//    }
//
//    public double getTongDiem() {
//        return tongDiem;
//    }
//
//    @Override
//    public String toString() {
//        setTrangThai();
//        return ma + " " + hoTen + " " + String.format("%.1f", tongDiem) + " " + trangThai;
//    }
//}
//
//public class J07057_diemTuyenSinh {
//    public static void main(String[] args) throws FileNotFoundException {
//        Scanner sc = new Scanner(new File("THISINH.in"));
//        int n = Integer.parseInt(sc.nextLine());
//        ThiSinh[] ts = new ThiSinh[n];
//        for(int i = 0; i < n; i++){
//            String hoTen = sc.nextLine();
//            double diem = Double.parseDouble(sc.nextLine());
//            String danToc = sc.nextLine();
//            int khuVuc = Integer.parseInt(sc.nextLine());
//            ts[i] = new ThiSinh(i + 1, hoTen, danToc, diem, khuVuc);
//        }
//        Arrays.sort(ts, new Comparator<ThiSinh>(){
//            @Override
//            public int compare(ThiSinh o1, ThiSinh o2) {
//                double a = o1.getTongDiem();
//                double b = o2.getTongDiem();
//                if(a > b) return -1;
//                else if(a < b) return 1;
//                else return o1.getMa().compareToIgnoreCase(o2.getMa());
//            }            
//        });
//        for(ThiSinh x : ts){
//            System.out.println(x);
//        }
//    }
//}
