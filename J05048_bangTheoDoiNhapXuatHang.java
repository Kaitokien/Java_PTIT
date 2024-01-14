package codejavaptit;

import java.util.ArrayList;
import java.util.Scanner;

//class Hang{
//    private String ma;
//    private int slnhap, dongia, slxuat, tien;
//    private double thue;
//
//    public Hang(String ma, int slnhap) {
//        this.ma = ma;
//        this.slnhap = slnhap;
//        if(this.ma.endsWith("Y")) this.dongia = 110000;
//        else if(this.ma.endsWith("N")) this.dongia = 135000;
//        tinhSLXuat();
//        this.tien = this.slxuat * this.dongia;
//        tinhThue();
//    }
//    
//    public void tinhSLXuat(){
//        if(this.ma.startsWith("A")){
//            this.slxuat = (int)Math.round(0.6 * this.slnhap);
//        }
//        else if(this.ma.startsWith("B"))
//            this.slxuat = (int)Math.round(0.7 * this.slnhap);
//    }
//    
//    public void tinhThue(){
//        if(this.ma.startsWith("A") && this.ma.endsWith("Y"))
//            this.thue = 0.08 * this.tien;
//        else if(this.ma.startsWith("A") && this.ma.endsWith("N"))
//            this.thue = 0.11 * this.tien;
//        else if(this.ma.startsWith("B") && this.ma.endsWith("Y"))
//            this.thue = 0.17 * this.tien;
//        else if(this.ma.startsWith("B") && this.ma.endsWith("N"))
//            this.thue = 0.22 * this.tien;
//    }
//
//    @Override
//    public String toString() {
//        return ma + " " + slnhap + " " + slxuat + " " + dongia + " " + tien + " " + String.format("%.0f", thue);
//    }
//}

//public class J05048_bangTheoDoiNhapXuatHang {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        ArrayList<Hang> arr = new ArrayList<>();
//        int n = Integer.parseInt(sc.nextLine());
//        for(int i = 0; i < n; i++){
//            String ma = sc.nextLine();
//            int slnhap = Integer.parseInt(sc.nextLine());
//            arr.add(new Hang(ma, slnhap));
//        }
//        for(Hang x : arr){
//            System.out.println(x);
//        }
//    }
//}
