/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codejavaptit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Candidate implements Comparable<Candidate>{
    private String ten, ngaySinh;
    private double tongDiem;
    private int ma;

    public Candidate(int ma, String ten, String ngaySinh, double mon1, double mon2, double mon3) {
        this.ma = ma;
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.tongDiem = mon1 + mon2 + mon3;
    }

    public double getTongDiem() {
        return tongDiem;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + ngaySinh + " " + String.format("%.1f", tongDiem);
    }

    @Override
    public int compareTo(Candidate o) {
        if(tongDiem > o.tongDiem) return -1;
        else if(tongDiem < o.tongDiem) return 1;
        else return ma - o.ma;
    }
    
}

public class J05009_timThuKhoaCuaKyThi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Candidate> thisinh = new ArrayList<>();
        double thuKhoa = -1;
        for(int i = 0; i < n; i++){
            String hoTen = sc.nextLine();
            String ngaySinh = sc.nextLine();
            double mon1 = Double.parseDouble(sc.nextLine());
            double mon2 = Double.parseDouble(sc.nextLine());
            double mon3 = Double.parseDouble(sc.nextLine());
            thisinh.add(new Candidate(i + 1, hoTen, ngaySinh, mon1, mon2, mon3));
            thuKhoa = Math.max(thuKhoa, mon1 + mon2 + mon3);
        }
        Collections.sort(thisinh);
        for(Candidate x : thisinh){
            if(x.getTongDiem() == thuKhoa){
                System.out.println(x);
            }
        }
    }
}
