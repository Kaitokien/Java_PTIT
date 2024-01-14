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
//    private String maSV, hoTen, soDT, email;
//
//    public SinhVien(String maSV, String hoTen, String soDT, String email) {
//        this.maSV = maSV;
//        this.hoTen = hoTen;
//        this.soDT = soDT;
//        this.email = email;
//    }
//
//    public String getMaSV() {
//        return maSV;
//    }
//
//    public String getHoTen() {
//        return hoTen;
//    }
//
//    @Override
//    public String toString() {
//        return maSV + " " + hoTen + " " + soDT + " " + email;
//    }
//    
//    
//}
//
//public class J07081_sapXepDanhSachSinhVien {
//    public static void main(String[] args) throws FileNotFoundException {
//        Scanner sc = new Scanner(new File("SINHVIEN.in"));
//        int n = Integer.parseInt(sc.nextLine());
//        SinhVien[] sv = new SinhVien[n];
//        for(int i = 0; i < n; i++){
//            String maSV = sc.nextLine();
//            String hoTen = sc.nextLine();
//            String soDT = sc.nextLine();
//            String email = sc.nextLine();
//            sv[i] = new SinhVien(maSV, hoTen, soDT, email);
//        }
//        Arrays.sort(sv, new Comparator<SinhVien>(){
//            @Override
//            public int compare(SinhVien o1, SinhVien o2) {
//                String a = o1.getHoTen();
//                String b = o2.getHoTen();
//                String[] arr1 = a.split("\\s+");
//                String[] arr2 = b.split("\\s+");
//                if(arr1[arr1.length - 1].equals(arr2[arr2.length - 1]) == false){
//                    return arr1[arr1.length - 1].compareToIgnoreCase(arr2[arr2.length - 1]);
//                }
//                else{
//                    String c = "";
//                    for(int i = 0; i < arr1.length - 1; i++){
//                        if(i == arr1.length - 2) c += arr1[i];
//                        else c += arr1[i] + " ";
//                    }
//                    String d = "";
//                    for(int i = 0; i < arr2.length - 1; i++){
//                        if(i == arr2.length - 2) d += arr2[i];
//                        else d += arr2[i] + " ";
//                    }
//                    if(c.equals(d) == false) return c.compareToIgnoreCase(d);
//                    else return o1.getMaSV().compareToIgnoreCase(o2.getMaSV());
//                }
//            }
//        });
//        for(SinhVien x : sv){
//            System.out.println(x);
//        }
//    }
//}
