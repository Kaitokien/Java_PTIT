package codejavaptit;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

//class SinhVien{
//    private String maSV, hoTen, lop, email;
//
//    public SinhVien(String maSV, String hoTen, String lop, String email) {
//        this.maSV = maSV;
//        this.hoTen = hoTen;
//        this.lop = lop;
//        this.email = email;
//    }
//
//    public String getLop() {
//        return lop;
//    }
//
//    @Override
//    public String toString() {
//        return maSV + " " + hoTen + " " + lop + " " + email;
//    }
//}

//public class J05022_lietKeSinhVienTheoLop {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = Integer.parseInt(sc.nextLine());
//        SinhVien[] a = new SinhVien[n];
//        for(int i = 0; i < n; i++){
//            a[i] = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
//        }
//        int q = Integer.parseInt(sc.nextLine());
//        while(q-- > 0){
//            String lop = sc.nextLine();
//            System.out.println("DANH SACH SINH VIEN LOP " + lop + ":");
//            for(SinhVien x : a){
//                if(x.getLop().compareToIgnoreCase(lop) == 0){
//                    System.out.println(x);
//                }
//            }
//        }
//    }
//}
