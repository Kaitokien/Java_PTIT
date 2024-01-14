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
//class GiangVien implements Comparable<GiangVien>{
//    private String hoTen ,ten, maGV, boMon;
//
//    public GiangVien(int ma, String hoTen, String boMon) {
//        String[] arr = hoTen.split("\\s+");
//        this.hoTen = hoTen;
//        this.ten = arr[arr.length - 1];
//        this.maGV = String.format("GV%02d", ma);
//        this.boMon = boMon;
//    }
//    
//    public String alias(){
//        String ans = "";
//        String[] arr = this.boMon.split("\\s+");
//        for(String x : arr){
//            ans += x.substring(0, 1).toUpperCase();
//        }
//        return ans;
//    }
//
//    @Override
//    public int compareTo(GiangVien o) {
//        if(ten.equals(o.ten) == false)
//            return ten.compareToIgnoreCase(o.ten);
//        else
//            return maGV.compareToIgnoreCase(o.maGV);
//    }
//
//    @Override
//    public String toString() {
//        String mon = alias();
//        return maGV + " " + hoTen + " " + mon;
//    }
//    
//}
//
//public class J05025_sapXepDanhSachGiangVien {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = Integer.parseInt(sc.nextLine());
//        ArrayList<GiangVien> giangvien = new ArrayList<>();
//        for(int i = 0; i < n; i++){
//            String hoTen = sc.nextLine();
//            String boMon = sc.nextLine();
//            giangvien.add(new GiangVien(i + 1, hoTen, boMon));
//        }
//        Collections.sort(giangvien);
//        for(GiangVien x : giangvien){
//            System.out.println(x);
//        }
//    }
//}
