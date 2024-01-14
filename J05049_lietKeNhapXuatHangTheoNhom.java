package codejavaptit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Hang implements Comparable<Hang>{
    private String ma;
    private int slnhap, dongia, slxuat, tien;
    private double thue;

    public Hang(String ma, int slnhap) {
        this.ma = ma;
        this.slnhap = slnhap;
        if(this.ma.endsWith("Y")) this.dongia = 110000;
        else if(this.ma.endsWith("N")) this.dongia = 135000;
        tinhSLXuat();
        this.tien = this.slxuat * this.dongia;
        tinhThue();
    }

    public String getMa() {
        return ma;
    }
    
    public void tinhSLXuat(){
        if(this.ma.startsWith("A")){
            this.slxuat = (int)Math.round(0.6 * this.slnhap);
        }
        else if(this.ma.startsWith("B"))
            this.slxuat = (int)Math.round(0.7 * this.slnhap);
    }
    
    public void tinhThue(){
        if(this.ma.startsWith("A") && this.ma.endsWith("Y"))
            this.thue = 0.08 * this.tien;
        else if(this.ma.startsWith("A") && this.ma.endsWith("N"))
            this.thue = 0.11 * this.tien;
        else if(this.ma.startsWith("B") && this.ma.endsWith("Y"))
            this.thue = 0.17 * this.tien;
        else if(this.ma.startsWith("B") && this.ma.endsWith("N"))
            this.thue = 0.22 * this.tien;
    }

    @Override
    public String toString() {
        return ma + " " + slnhap + " " + slxuat + " " + dongia + " " + tien + " " + String.format("%.0f", thue);
    }

    @Override
    public int compareTo(Hang o) {
        if(this.thue > o.thue) return -1;
        else return 1;
    }
}

public class J05049_lietKeNhapXuatHangTheoNhom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Hang> arr = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++){
            String ma = sc.nextLine();
            int slnhap = Integer.parseInt(sc.nextLine());
            arr.add(new Hang(ma, slnhap));
        }
        Collections.sort(arr);
        String c = sc.nextLine();
        for(Hang x : arr){
            if(x.getMa().startsWith(c)) System.out.println(x);
        }
    }
}
