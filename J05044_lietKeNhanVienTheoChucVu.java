package codejavaptit;

import java.util.ArrayList;
import java.util.Scanner;

//class Employee{
//    private String maNV, hoTen, chucVu;
//    private int soNgayCong, phucap, tamung;
//    private double luong;
//
//    public Employee(int maNV, String hoTen, String chucVu, int soNgayCong, double luong) {
//        this.maNV = String.format("NV%02d", maNV);
//        this.hoTen = hoTen;
//        this.chucVu = chucVu;
//        this.soNgayCong = soNgayCong;
//        this.luong = luong;
//        if(this.chucVu.equals("GD"))
//            this.phucap = 500;
//        else if(this.chucVu.equals("PGD"))
//            this.phucap = 400;
//        else if(this.chucVu.equals("TP"))
//            this.phucap = 300;
//        else if(this.chucVu.equals("KT"))
//            this.phucap = 250;
//        else this.phucap = 100;
//    }
//
//    public String getChucVu() {
//        return chucVu;
//    }
//    
//    public void tinhTamUng(){
//        if((this.luong * this.soNgayCong + this.phucap) * 2 / 3 < 25000){
//            int res = (int)Math.round((this.luong * this.soNgayCong + this.phucap) * 2 / 3) % 1000;
//            int tmp = 0;
//            if(res >= 500){
//                tmp = (int)Math.round((this.luong * this.soNgayCong + this.phucap) * 2 / 3) / 1000 + 1;
//            }
//            else{
//                tmp = (int)Math.round((this.luong * this.soNgayCong + this.phucap) * 2 / 3) / 1000;
//            }
//            this.tamung = tmp * 1000;
//        }
//        else this.tamung = 25000;
//    }
//
//    @Override
//    public String toString() {
//        tinhTamUng();
//        return maNV + " " + hoTen + " " + phucap + " " + String.format("%.0f", luong * soNgayCong) + " " + tamung + " " + String.format("%.0f", phucap + luong * soNgayCong - tamung);
//    }
//}

//public class J05044_lietKeNhanVienTheoChucVu {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = Integer.parseInt(sc.nextLine());
//        ArrayList<Employee> emp = new ArrayList<>();
//        for(int i = 0; i < n; i++){
//            String hoTen = sc.nextLine();
//            String chucvu = sc.nextLine();
//            double luong = Double.parseDouble(sc.nextLine());
//            int soNgayCong = Integer.parseInt(sc.nextLine());
//            Employee e = new Employee(i + 1, hoTen, chucvu, soNgayCong, luong);
//            emp.add(e);
//        }
//        String cv = sc.nextLine();
//        for(Employee e : emp){
//            if(e.getChucVu().equals(cv)){
//                System.out.println(e);
//            }
//        }
//    }
//}
