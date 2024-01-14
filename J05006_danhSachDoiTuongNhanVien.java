//package codejavaptit;
//
//import java.util.*;
//
//class NhanVien {
//    private String mnv, name, gender, dob, add, num, contract;
//
//    public NhanVien(int mnv, String name, String gender, String dob, String add, String num, String contract) {
//        this.mnv = String.format("%05d", mnv);
//        this.name = name;
//        this.gender = gender;
//        this.dob = dob;
//        this.add = add;
//        this.num = num;
//        this.contract = contract;
//    }
//
//    @Override
//    public String toString() {
//        return mnv + " " + name + " " + gender + " " + dob + " " + add + " " + num + " " + contract;
//    }
//    
//}
//
//public class J05006_danhSachDoiTuongNhanVien {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int t = Integer.parseInt(sc.nextLine());
//        NhanVien[] arr = new NhanVien[t];
//        for(int i = 0; i < t; i++){
//            arr[i] = new NhanVien(i + 1, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
//        }
//        for(int i = 0; i < t; i++){
//            System.out.println(arr[i]);
//        }
//    }
//}
