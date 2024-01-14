/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codejavaptit;

import java.io.File;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class ThiSinh{
    private String ma, hoTen, trangThai;
    private double tongDiem, diemUuTien;

    public ThiSinh(String ma, String hoTen, double diemToan, double diemLy, double diemHoa) {
        this.ma = ma;
        this.hoTen = hoTen;
        tongDiem = diemToan * 2 + diemLy + diemHoa;
        if(this.ma.substring(0, 3).equals("KV1")){
            tongDiem += 0.5;
            diemUuTien = 0.5;
        }
        else if(this.ma.substring(0, 3).equals("KV2")){
            tongDiem += 1;
            diemUuTien = 1;
        }
        else if(this.ma.substring(0, 3).equals("KV3")){
            tongDiem += 2.5;
            diemUuTien = 2.5;
        }
        this.trangThai = setTrangThai();
    }

    public String kiemTra(double diem){
        if(diem == (int)diem){
            String ans = (int)diem + "";
            return ans;
        }
        else{
            String ans = String.format("%.1f", diem);
            return ans;
        }
    }

    public String setTrangThai() {
        if(tongDiem >= 24) return "TRUNG TUYEN";
        else return "TRUOT";
    }
    
    
    @Override
    public String toString() {
        return ma + " " + hoTen + " " + kiemTra(diemUuTien) + " " + kiemTra(tongDiem - diemUuTien) + " " + trangThai;
    }

}

public class J04013_baiToanTuyenSinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ma = sc.nextLine();
        String hoTen = sc.nextLine();
        double diemToan = Double.parseDouble(sc.nextLine());
        double diemLy = Double.parseDouble(sc.nextLine());
        double diemHoa = Double.parseDouble(sc.nextLine());
        ThiSinh a = new ThiSinh(ma, hoTen, diemToan, diemLy, diemHoa);
        System.out.println(a);
    }
}
