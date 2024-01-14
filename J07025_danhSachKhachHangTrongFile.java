/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codejavaptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;

class Customer implements Comparable<Customer>{
    private String maKH, tenKH, ngaySinh, gioiTinh, diaChi;
    private long tuoi;

    public Customer(int maKH, String tenKH, String ngaySinh, String gioiTinh, String diaChi) throws ParseException {
        this.maKH = String.format("KH%03d", maKH);
        this.tenKH = chuanHoaTen(tenKH);
        this.ngaySinh = chuanHoaNgaySinh(ngaySinh);
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.tuoi = tinhTuoi();
    }
    
    public long tinhTuoi() throws ParseException{
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date d = sdf.parse(this.ngaySinh);
        long age = new Date().getTime() - d.getTime();
        return age / (1000 * 60 * 60 * 24 * 365);
    }
    
    public String chuanHoaNgaySinh(String s){
        StringBuilder sb = new StringBuilder(s);
        if(sb.charAt(1) == '/') sb.insert(0, '0');
        if(sb.charAt(4) == '/') sb.insert(3, '0');
        return sb.toString();
    }
    
    public String chuanHoaTen(String s){
        s = s.toLowerCase();
        String ans = "";
        String[] arr = s.trim().split("\\s+");
        for(String x : arr){
            ans += x.substring(0, 1).toUpperCase() + x.substring(1);
            ans += " ";
        }
        ans = ans.substring(0, ans.length() - 1);
        return ans;
    }

    @Override
    public String toString() {
        return maKH + " " + tenKH + " " + gioiTinh + " " + diaChi + " "+ ngaySinh;
    }

    @Override
    public int compareTo(Customer o) {
        if(this.tuoi > o.tuoi) return -1;
        else return 1;
    }
}

public class J07025_danhSachKhachHangTrongFile {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Customer> cust = new ArrayList<>();
        for(int i = 0; i < n; i++){
            String hoTen = sc.nextLine();
            String gioiTinh = sc.nextLine();
            String ngaySinh  = sc.nextLine();
            String diaChi = sc.nextLine();
            cust.add(new Customer(i + 1, hoTen, ngaySinh, gioiTinh, diaChi));
        }
        Collections.sort(cust);
        for(Customer x : cust){
            System.out.println(x);
        }
    }
}
