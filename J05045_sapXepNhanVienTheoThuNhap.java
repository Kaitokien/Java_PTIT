/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codejavaptit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Employee implements Comparable<Employee>{
    private String maNV, hoTen, chucVu;
    private int soNgayCong, phucap, tamung;
    private double luong;

    public Employee(int maNV, String hoTen, String chucVu, int soNgayCong, double luong) {
        this.maNV = String.format("NV%02d", maNV);
        this.hoTen = hoTen;
        this.chucVu = chucVu;
        this.soNgayCong = soNgayCong;
        this.luong = luong;
        if(this.chucVu.equals("GD"))
            this.phucap = 500;
        else if(this.chucVu.equals("PGD"))
            this.phucap = 400;
        else if(this.chucVu.equals("TP"))
            this.phucap = 300;
        else if(this.chucVu.equals("KT"))
            this.phucap = 250;
        else this.phucap = 100;
    }

    public String getChucVu() {
        return chucVu;
    }
    
    public void tinhTamUng(){
        if((this.luong * this.soNgayCong + this.phucap) * 2 / 3 < 25000){
            int res = (int)Math.round((this.luong * this.soNgayCong + this.phucap) * 2 / 3) % 1000;
            int tmp = 0;
            if(res >= 500){
                tmp = (int)Math.round((this.luong * this.soNgayCong + this.phucap) * 2 / 3) / 1000 + 1;
            }
            else{
                tmp = (int)Math.round((this.luong * this.soNgayCong + this.phucap) * 2 / 3) / 1000;
            }
            this.tamung = tmp * 1000;
        }
        else this.tamung = 25000;
    }

    @Override
    public String toString() {
        tinhTamUng();
        return maNV + " " + hoTen + " " + phucap + " " + String.format("%.0f", luong * soNgayCong) + " " + tamung + " " + String.format("%.0f", phucap + luong * soNgayCong - tamung);
    }

    @Override
    public int compareTo(Employee o) {
        double tn1 = this.phucap + this.luong * this.soNgayCong - this.tamung;
        double tn2 = o.phucap + o.luong * o.soNgayCong - o.tamung;
        if(tn1 == tn2) return this.maNV.compareTo(o.maNV);
        if(tn1 > tn2) return -1;
        else return 1;
    }
}

public class J05045_sapXepNhanVienTheoThuNhap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Employee> emp = new ArrayList<>();
        for(int i = 0; i < n; i++){
            String hoTen = sc.nextLine();
            String chucvu = sc.nextLine();
            double luong = Double.parseDouble(sc.nextLine());
            int soNgayCong = Integer.parseInt(sc.nextLine());
            Employee e = new Employee(i + 1, hoTen, chucvu, soNgayCong, luong);
            emp.add(e);
        }
        Collections.sort(emp);
        for(Employee e : emp){
            System.out.println(e);
        }
    }
}
