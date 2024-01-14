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
//class KhachHang{
//    private String ma, hoTen;
//    private double tienTrongDinhMuc, tienVuotDinhMuc, VAT;
//    private int dinhMuc, chiSoDau, chiSoCuoi;
//
//    public KhachHang(int ma, String hoTen, String loai, int chiSoDau, int chiSoCuoi) {
//        this.ma = String.format("KH%02d", ma);
//        this.hoTen = chuanHoaTen(hoTen);
//        this.chiSoDau = chiSoDau;
//        this.chiSoCuoi = chiSoCuoi;
//        if(loai.compareTo("A") == 0){
//            this.dinhMuc = 100;
//        }
//        else if(loai.compareTo("B") == 0){
//            this.dinhMuc = 500;
//        }
//        else if(loai.compareTo("C") == 0){
//            this.dinhMuc = 200;
//        }
//    }
//    
//    public void tinhToan(){
//        int soDien = this.chiSoCuoi - this.chiSoDau;
//        if(soDien < dinhMuc){
//            this.tienTrongDinhMuc = soDien * 450;
//            this.tienVuotDinhMuc = 0;
//            this.VAT = 0;
//        }
//        else{
//            this.tienTrongDinhMuc = dinhMuc * 450;
//            this.tienVuotDinhMuc = (soDien - dinhMuc) * 1000;
//            this.VAT = this.tienVuotDinhMuc / 20;
//        }
//    }
//    
//    public double tongTien(){
//        return this.tienTrongDinhMuc + this.tienVuotDinhMuc + this.VAT;
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
//    @Override
//    public String toString() {
//        return ma + " " + hoTen + " " + (int)tienTrongDinhMuc + " " + (int)tienVuotDinhMuc + " " + (int)VAT + " " + (int)(tienTrongDinhMuc + tienVuotDinhMuc + VAT);
//    }
//    
//}
//
//public class J07056_tinhTienDien {
//    public static void main(String[] args) throws FileNotFoundException {
//        Scanner sc = new Scanner(new File("KHACHHANG.in"));
//        int n = Integer.parseInt(sc.nextLine());
//        KhachHang[] kh = new KhachHang[n];
//        for(int i = 0; i < n; i++){
//            String hoTen = sc.nextLine();
//            String[] arr = sc.nextLine().split("\\s+");
//            String loai = arr[0];
//            int chiSoDau = Integer.parseInt(arr[1]);
//            int chiSoCuoi = Integer.parseInt(arr[2]);
//            kh[i] = new KhachHang(i + 1, hoTen, loai, chiSoDau, chiSoCuoi);
//            kh[i].tinhToan();
//        }
//        Arrays.sort(kh, new Comparator<KhachHang>(){
//            @Override
//            public int compare(KhachHang o1, KhachHang o2) {
//                double a = o1.tongTien();
//                double b = o2.tongTien();
//                if(a > b) return -1;
//                else return 1;
//            }
//            
//        });
//        for(int i = 0; i < n; i++){
//            System.out.println(kh[i]);
//        }
//    }
//}
