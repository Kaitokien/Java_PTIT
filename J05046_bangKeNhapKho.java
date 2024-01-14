/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codejavaptit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

//class Hang{
//    private String ma, ten;
//    private int soluong;
//    private double dongia, chietkhau;
//
//    public Hang(String ma, String ten, int soluong, double dongia) {
//        this.ma = ma;
//        this.ten = ten;
//        this.soluong = soluong;
//        this.dongia = dongia;
//        if(this.soluong > 10) this.chietkhau = this.dongia * this.soluong * 0.05;
//        else if(this.soluong >= 8) this.chietkhau = this.dongia * this.soluong * 0.02;
//        else if(this.soluong >= 5) this.chietkhau = this.dongia * this.soluong * 0.01;
//        else this.chietkhau = 0;
//    }
//
//    @Override
//    public String toString() {
//        return ma + " " + ten + " " + String.format("%.0f", chietkhau) + " " + String.format("%.0f", this.dongia * this.soluong - chietkhau);
//    }
//}

//public class J05046_bangKeNhapKho {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = Integer.parseInt(sc.nextLine());
//        ArrayList<Hang> a = new ArrayList<>();
//        HashMap<String, Integer> map = new HashMap<>();
//        for(int i = 1; i <= n; i++){
//            String ten = sc.nextLine();
//            int soluong = Integer.parseInt(sc.nextLine());
//            double dongia = Double.parseDouble(sc.nextLine());
//            String ma = "";
//            String[] arr = ten.split("\\s+");
//            ma += arr[0].substring(0, 1).toUpperCase() + arr[1].substring(0, 1).toUpperCase();
//            if(map.containsKey(ma) == false){
//                map.put(ma, 1);
//            }
//            else{
//                int res = map.get(ma);
//                res++;
//                map.put(ma, res);
//            }
//            a.add(new Hang(String.format(ma + "%02d", map.get(ma)), ten, soluong, dongia));
//        }
//        for(Hang x : a){
//            System.out.println(x);
//        }
//    }
//}
