/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codejavaptit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//class Employee implements Comparable<Employee>{
//    private String maNV, hoTen, chucVu;
//    private int soNgayCong;
//    private double luong, phucap, thuong;
//
//    public Employee(int maNV, String hoTen, String chucVu, int soNgayCong, double luong) {
//        this.maNV = String.format("NV%02d", maNV);
//        this.hoTen = hoTen;
//        this.chucVu = chucVu;
//        this.soNgayCong = soNgayCong;
//        this.luong = luong;
//        if(this.chucVu.equals("GD"))
//            this.phucap = 250000;
//        else if(this.chucVu.equals("PGD"))
//            this.phucap = 200000;
//        else if(this.chucVu.equals("TP"))
//            this.phucap = 180000;
//        else if(this.chucVu.equals("NV"))
//            this.phucap = 150000;
//        if(this.soNgayCong >= 25) this.thuong = (this.luong * this.soNgayCong) * 0.2;
//        else if(this.soNgayCong >= 22) this.thuong = (this.luong * this.soNgayCong) * 0.1;
//        else this.thuong = 0;
//    }
//    
//    public double tongTien(){
//        return this.luong * this.soNgayCong + this.phucap + this.thuong;
//    }
//
//    @Override
//    public String toString() {
//        return maNV + " " + hoTen + " " + String.format("%.0f", luong * soNgayCong) + " " + String.format("%.0f", thuong) + " " + String.format("%.0f", phucap) + " " + String.format("%.0f", tongTien());
//    }
//
//    @Override
//    public int compareTo(Employee o) {
//        if(this.tongTien() > o.tongTien()){
//            return -1;
//        }
//        else return 1;
//    }
//    
//}

//public class J05038_bangKeTienLuong {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = Integer.parseInt(sc.nextLine());
//        ArrayList<Employee> emp = new ArrayList<>();
////        double tongTien = 0;
//        for(int i = 0; i < n; i++){
//            String hoTen = sc.nextLine();
//            double luong = Double.parseDouble(sc.nextLine());
//            int soNgayCong = Integer.parseInt(sc.nextLine());
//            String chucvu = sc.nextLine();
//            Employee e = new Employee(i + 1, hoTen, chucvu, soNgayCong, luong);
//            emp.add(e);
////            tongTien += e.tongTien();
//        }
//        Collections.sort(emp);
//        for(Employee e : emp){
//            System.out.println(e);
//        }
////        System.out.print("Tong chi phi tien luong: " + String.format("%.0f", tongTien));
//    }
//}
