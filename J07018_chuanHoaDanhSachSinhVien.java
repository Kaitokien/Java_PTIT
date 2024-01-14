/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codejavaptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

class Student{
    private String ma, hoTen, lop, ngaySinh;
    private double gpa;

    public Student(int ma ,String hoTen, String lop, String ngaySinh, double gpa) {
        this.ma = String.format("B20DCCN%03d", ma);
        this.hoTen = chuanHoaTen(hoTen);
        this.lop = lop;
        this.ngaySinh = chuanHoaNgaySinh(ngaySinh);
        this.gpa = gpa;
    }

    public String chuanHoaNgaySinh(String ngaySinh){
        StringBuilder sb = new StringBuilder(ngaySinh);
        if(sb.charAt(1) == '/'){
            sb.insert(0, "0");
        }
        if(sb.charAt(4) == '/'){
            sb.insert(3, "0");
        }
        return sb.toString();
    }
    
    public String chuanHoaTen(String hoTen){
        String ten = "";
        String[] arr = hoTen.trim().split("\\s+");
        for(String x : arr){
            ten += Character.toUpperCase(x.charAt(0)) + x.substring(1).toLowerCase() + " ";
        }
        return ten.substring(0, ten.length() - 1);
    }
    
    @Override
    public String toString() {
        return ma + " " + hoTen + " " + lop + " " + ngaySinh + " " + String.format("%.2f", gpa);
    }
    
    
}

public class J07018_chuanHoaDanhSachSinhVien {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Student> student = new ArrayList<>();
        for(int i = 0; i < n; i++){
            String hoTen = sc.nextLine();
            String lop = sc.nextLine();
            String ngaySinh = sc.nextLine();
            double gpa = Double.parseDouble(sc.nextLine());
            student.add(new Student(i + 1, hoTen, lop, ngaySinh, gpa));
        }
        for(Student x : student){
            System.out.println(x);
        }
    }
}
