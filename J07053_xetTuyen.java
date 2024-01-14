package codejavaptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class UngVien{
    private String ma, hoTen, ngaySinh, xepLoai;
    private double lyThuyet, thucHanh, thuong;

    public UngVien(int ma, String hoTen, String ngaySinh, double lyThuyet, double thucHanh) {
        this.ma = "PH" + String.format("%02d", ma);
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.lyThuyet = lyThuyet;
        this.thucHanh = thucHanh;
    }
    
    public void chuanHoaNgaySinh(){
        StringBuilder sb = new StringBuilder(this.ngaySinh);
        if(this.ngaySinh.charAt(1) == '/'){
            sb.insert(0, "0");
        }
        if(this.ngaySinh.charAt(4) == '/')
            sb.insert(3, "0");
        this.ngaySinh = sb.toString();
    }
    
    public void chuanHoaTen(){
        String s = "";
        String[] arr = this.hoTen.toLowerCase().trim().split("\\s+");
        for(String x : arr){
            s += Character.toUpperCase(x.charAt(0));
            s += x.substring(1) + " ";
        }
        s = s.substring(0, s.length() - 1);
        this.hoTen = s;
    }
    
    public void bonus(){
        if(this.lyThuyet >= 8 && this.thucHanh >= 8)
            this.thuong = 1;
        else if(this.lyThuyet >= 7.5 && this.thucHanh >= 7.5)
            this.thuong = 0.5;
        else this.thuong = 0;
    }
    
    public int tuoi(){
        return 2021 - Integer.parseInt(ngaySinh.substring(ngaySinh.length() - 4));
    }
    
    public int diem(){
        double tong = (lyThuyet + thucHanh) / 2 + thuong;
        if(tong >= 10) return 10;
        else{
            int ans = (int) Math.round(tong);
            return ans;
        }
    }

    @Override
    public String toString() {
        int point = diem();
        if(point >= 9) xepLoai = "Xuat sac";
        else if(point >= 8) xepLoai = "Gioi";
        else if(point >= 7) xepLoai = "Kha";
        else if(point >= 5) xepLoai = "Trung binh";
        else xepLoai = "Truot";
        return ma + " " + hoTen + " " + tuoi() + " " + point + " " + xepLoai;
    }
    
}

public class J07053_xetTuyen {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("XETTUYEN.in"));
        int n = Integer.parseInt(sc.nextLine());
        UngVien[] uv = new UngVien[n];
        for(int i = 0; i < n; i++){
            uv[i] = new UngVien(i + 1, sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()));
            uv[i].chuanHoaTen();
            uv[i].chuanHoaNgaySinh();
            uv[i].bonus();
        }
        for(int i = 0; i < n; i++){
            System.out.println(uv[i]);
        }
    }
}
