//package codejavaptit;
//
//import java.util.*;
//
//class NhanVien {
//    private String mnv, hoTen, chucVu;
//    private int luong, ngayCong;
//
//    public NhanVien(String mnv, String hoTen, int luong, int ngayCong, String chucVu) {
//        this.mnv = mnv;
//        this.hoTen = hoTen;
//        this.chucVu = chucVu;
//        this.luong = luong;
//        this.ngayCong = ngayCong;
//    }
//    
//    public int bonus(){
//        if(this.ngayCong < 22) return 0;
//        else if(this.ngayCong >= 22 && this.ngayCong < 25) return (int)this.luong / 10 * this.ngayCong;
//        else{
//            return (int)this.luong / 5 * this.ngayCong;
//        }
//    }
//    
//    public int phuCap(){
//        if(this.chucVu.compareToIgnoreCase("GD") == 0) return 250000;
//        else if(this.chucVu.compareToIgnoreCase("PGD") == 0) return 200000;
//        else if(this.chucVu.compareToIgnoreCase("TP") == 0) return 180000;
//        else return 150000;
//    }
//
//    @Override
//    public String toString() {
//        int thuNhap = ngayCong * luong + bonus() + phuCap();
//        return mnv + " " + hoTen + " " + String.valueOf(ngayCong * luong) + " " + String.valueOf(bonus()) + " " + String.valueOf(phuCap()) + " " + String.valueOf(thuNhap);
//    }
//}
//
//public class J04012_baiToanTinhCong {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        NhanVien a = new NhanVien("NV01", sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()), sc.nextLine());
//        System.out.println(a);
//    }
//}
