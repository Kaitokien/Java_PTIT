//package codejavaptit;
//
//import java.io.DataInputStream;
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.io.ObjectInputStream;
//import java.math.BigInteger;
//import java.util.*;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//
//class SinhVien{
//    private String ma, ten, lop, email;
//
//    public SinhVien(String ma, String ten, String lop, String email) {
//        this.ma = ma;
//        this.ten = chuanHoa(ten);
//        this.lop = lop;
//        this.email = email;
//    }
//    
//    public String chuanHoa(String s){
//        String[] arr = s.toLowerCase().split("\\s+");
//        String ans = "";
//        for(String x : arr){
//            ans += x.substring(0, 1).toUpperCase() + x.substring(1) + " ";
//        }
//        return ans.substring(0, ans.length() - 1);
//    }
//
//    public String getMa() {
//        return ma;
//    }
//
//    public String getTen() {
//        return ten;
//    }
//
//    public String getLop() {
//        return lop;
//    }
//
//    @Override
//    public String toString() {
//        return ma + " " + ten + " " + lop;
//    }
//
//}
//
//class DN{
//    private String ma, ten;
//    private int soSV;
//
//    public DN(String ma, String ten, int soSV) {
//        this.ma = ma;
//        this.ten = ten;
//        this.soSV = soSV;
//    }
//
//    public String getMa() {
//        return ma;
//    }
//
//    public String getTen() {
//        return ten;
//    }
//
//    public int getSoSV() {
//        return soSV;
//    }
//    
//}
//
//class ThucTap implements Comparable<ThucTap>{
//    private SinhVien sinhvien;
//    private DN doanhNghiep;
//
//    public ThucTap() {
//    }
//
//    public SinhVien getSinhvien() {
//        return sinhvien;
//    }
//
//    public DN getDoanhNghiep() {
//        return doanhNghiep;
//    }
//
//    public void setSinhvien(SinhVien sinhvien) {
//        this.sinhvien = sinhvien;
//    }
//
//    public void setDoanhNghiep(DN doanhNghiep) {
//        this.doanhNghiep = doanhNghiep;
//    }
//
//    @Override
//    public String toString() {
//        return sinhvien.getMa() + " " + sinhvien.getTen() + " " + sinhvien.getLop();
//    }
//
//    @Override
//    public int compareTo(ThucTap o) {
//        return this.sinhvien.getMa().compareTo(o.sinhvien.getMa());
//    }
//}
//
//public class J07038_danhSachThucTap_3 {
//    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        Scanner sc1 = new Scanner(new File("SINHVIEN.in"));
//        Scanner sc2 = new Scanner(new File("DN.in")); 
//        Scanner sc3 = new Scanner(new File("THUCTAP.in")); 
//        int n = Integer.parseInt(sc1.nextLine());
//        int m = Integer.parseInt(sc2.nextLine());
//        int k = Integer.parseInt(sc3.nextLine());
//        ArrayList<SinhVien> sinhvien = new ArrayList<>();
//        ArrayList<DN> dn = new ArrayList<>();
//        ArrayList<ThucTap> thuctap = new ArrayList<>();
//        for(int i = 0; i < n; i++){
//            sinhvien.add(new SinhVien(sc1.nextLine(), sc1.nextLine(), sc1.nextLine(), sc1.nextLine()));
//        }
//        for(int i = 0; i < m; i++){
//            dn.add(new DN(sc2.nextLine(), sc2.nextLine(), Integer.parseInt(sc2.nextLine())));
//        }
//        for(int i = 0; i < k; i++){
//            ThucTap tt = new ThucTap();
//            String[] arr = sc3.nextLine().split("\\s+");
//            for(SinhVien x : sinhvien){
//                if(x.getMa().equals(arr[0])){
//                    tt.setSinhvien(x);
//                    break;
//                }
//            }
//            for(DN x : dn){
//                if(x.getMa().equals(arr[1])){
//                    tt.setDoanhNghiep(x);
//                    break;
//                }
//            }
//            thuctap.add(tt);
//        }
//        Collections.sort(thuctap);
//        int t = Integer.parseInt(sc3.nextLine());
//        while(t-- > 0){
//            String maDN = sc3.nextLine();
//            int sl = 0;
//            for(DN x : dn){
//                if(x.getMa().equals(maDN)){
//                    System.out.println("DANH SACH THUC TAP TAI " + x.getTen() + ":");
//                    sl = x.getSoSV();
//                    break;
//                }
//            }
//            for(ThucTap x : thuctap){
//                if(x.getDoanhNghiep().getMa().equals(maDN)){
//                    --sl;
//                    System.out.println(x);
//                }
//                if(sl == 0) break;
//            }
//        }
//    }
//}
