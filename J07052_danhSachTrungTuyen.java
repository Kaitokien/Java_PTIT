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
//    private double tongDiem, diemUuTien;
//
//    public ThiSinh(String ma, String hoTen, double diemToan, double diemLy, double diemHoa) {
//        this.ma = ma;
//        this.hoTen = hoTen;
//        tongDiem = diemToan * 2 + diemLy + diemHoa;
//        if(this.ma.substring(0, 3).equals("KV1")){
//            tongDiem += 0.5;
//            diemUuTien = 0.5;
//        }
//        else if(this.ma.substring(0, 3).equals("KV2")){
//            tongDiem += 1;
//            diemUuTien = 1;
//        }
//        else if(this.ma.substring(0, 3).equals("KV3")){
//            tongDiem += 2.5;
//            diemUuTien = 2.5;
//        }
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
//    public String kiemTra(double diem){
//        if(diem == (int)diem){
//            String ans = (int)diem + "";
//            return ans;
//        }
//        else{
//            String ans = String.format("%.1f", diem);
//            return ans;
//        }
//    }
//
//    public void setTrangThai(String trangThai) {
//        this.trangThai = trangThai;
//    }
//    
//    public void chuanHoaTen(){
//        String ten = "";
//        String[] arr = hoTen.trim().split("\\s+");
//        for(String x : arr){
//            ten += Character.toUpperCase(x.charAt(0)) + x.substring(1).toLowerCase() + " ";
//        }
//        hoTen = ten.substring(0, ten.length() - 1);
//    }
//
//    @Override
//    public String toString() {
//        return ma + " " + hoTen + " " + kiemTra(diemUuTien) + " " + kiemTra(tongDiem) + " " + trangThai;
//    }
//
//}
//public class J07052_danhSachTrungTuyen {
//    public static void main(String[] args) throws FileNotFoundException {
//        Scanner sc = new Scanner(new File("THISINH.in"));
//        int n = Integer.parseInt(sc.nextLine());
//        ThiSinh[] ts = new ThiSinh[n];
//        for(int i = 0; i < n; i++){
//            String ma = sc.nextLine();
//            String hoTen = sc.nextLine();
//            double diemToan = Double.parseDouble(sc.nextLine());
//            double diemLy = Double.parseDouble(sc.nextLine());
//            double diemHoa = Double.parseDouble(sc.nextLine());
//            ts[i] = new ThiSinh(ma, hoTen, diemToan, diemLy, diemHoa);
//            ts[i].chuanHoaTen();
//        }
//        Arrays.sort(ts, new Comparator<ThiSinh>(){
//            @Override
//            public int compare(ThiSinh o1, ThiSinh o2) {
//                double diem1 = o1.getTongDiem();
//                double diem2 = o2.getTongDiem();
//                if(diem1 != diem2){
//                    if(diem1 > diem2){
//                        return -1;
//                    }
//                    else return 1;
//                }
//                else{
//                    return o1.getMa().compareToIgnoreCase(o2.getMa());
//                }
//            }            
//        });
//        int chiTieu = Integer.parseInt(sc.nextLine());
//        double diemChuan = ts[chiTieu - 1].getTongDiem();
//        System.out.println(String.format("%.1f", diemChuan));
//        for(int i = 0; i < n; i++){
//            if(ts[i].getTongDiem() >= diemChuan){
//                ts[i].setTrangThai("TRUNG TUYEN");
//            }
//            else ts[i].setTrangThai("TRUOT");
//            System.out.println(ts[i]);
//        }
//    }
//}
