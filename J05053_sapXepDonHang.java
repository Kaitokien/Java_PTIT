///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package codejavaptit;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Scanner;
//
//class QuanAo implements Comparable<QuanAo>{
//    private String tenHang, maDonHang, stt, maloai;
//    private double donGia, giamGia;
//    private int soluong;
//
//    public QuanAo(String tenHang, String maDonHang, String stt, double donGia, int soluong, String maloai) {
//        this.tenHang = tenHang;
//        this.maDonHang = maDonHang;
//        this.stt = stt;
//        this.donGia = donGia;
//        this.soluong = soluong;
//        this.maloai = maloai;
//        if(this.maloai.equals("1") == true)
//            this.giamGia = this.donGia * 0.5 * this.soluong;
//        else
//            this.giamGia = this.donGia * 0.3 * this.soluong;
//    }
//
//    @Override
//    public String toString() {
//        return tenHang + " " + maDonHang + " " + stt + " " + String.format("%.0f", this.giamGia) + " " + String.format("%.0f", this.soluong * this.donGia - this.giamGia);
//    }
//
//    @Override
//    public int compareTo(QuanAo o) {
//        return this.maDonHang.substring(1, 4).compareTo(o.maDonHang.substring(1, 4));
//    }
//}
//
//public class J05053_sapXepDonHang {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = Integer.parseInt(sc.nextLine());
//        ArrayList<QuanAo> arr = new ArrayList<>();
//        while(n-- > 0){
//            String tenHang = sc.nextLine();
//            String maHang = sc.nextLine();
//            double dongia = Double.parseDouble(sc.nextLine());
//            int soluong = Integer.parseInt(sc.nextLine());
//            QuanAo quanao = new QuanAo(tenHang, maHang, maHang.substring(1, 4), dongia, soluong, maHang.substring(4));
//            arr.add(quanao);
//        }
//        Collections.sort(arr);
//        for(QuanAo qa : arr){
//            System.out.println(qa);
//        }
//    }
//}
