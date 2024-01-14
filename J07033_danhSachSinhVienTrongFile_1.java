package codejavaptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

//class sinhVien implements Serializable{
//    private String msv, hoTen, lop, email;
//
//    public sinhVien(String msv, String hoTen, String lop, String email) {
//        this.msv = msv;
//        this.hoTen = chuanHoaTen(hoTen);
//        this.lop = lop;
//        this.email = email;
//    }
//    
//    public String chuanHoaTen(String s){
//        s = s.toLowerCase();
//        String ans = "";
//        String[] arr = s.trim().split("\\s+");
//        for(String x : arr){
//            ans += x.substring(0, 1).toUpperCase() + x.substring(1);
//            ans += " ";
//        }
//        ans = ans.substring(0, ans.length() - 1);
//        return ans;
//    }
//
//    public String getMsv() {
//        return msv;
//    }
//
//    @Override
//    public String toString() {
//        return msv + " " + hoTen + " " + lop + " " + email;
//    }
//    
//}
//
//public class J07033_danhSachSinhVienTrongFile_1 {
//    public static void main(String[] args) throws FileNotFoundException{
//        Scanner sc = new Scanner(new File("SINHVIEN.in"));
//        int t = Integer.parseInt(sc.nextLine());
//        sinhVien[] dssv = new sinhVien[t];
//        for(int i = 0; i < t; i++){
//            dssv[i] = new sinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
//        }
//        Arrays.sort(dssv, new Comparator<sinhVien>(){
//            @Override
//            public int compare(sinhVien o1, sinhVien o2) {
//                return o1.getMsv().compareToIgnoreCase(o2.getMsv());
//            }
//        });
//        for(sinhVien x : dssv){
//            System.out.println(x);
//        }
//    }
//}
