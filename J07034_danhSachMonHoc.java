//package codejavaptit;
//
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.util.Arrays;
//import java.util.Comparator;
//import java.util.Scanner;
//
//class MonHoc{
//    private String maMon, tenMon;
//    private int soTinChi;
//
//    public MonHoc(String maMon, String tenMon, int soTinChi) {
//        this.maMon = maMon;
//        this.tenMon = tenMon;
//        this.soTinChi = soTinChi;
//    }
//
//    public String getTenMon() {
//        return tenMon;
//    }
//
//    @Override
//    public String toString() {
//        return maMon + " " + tenMon + " " + soTinChi;
//    }
//    
//}
//
//public class J07034_danhSachMonHoc {
//    public static void main(String[] args) throws FileNotFoundException{
//        Scanner sc = new Scanner(new File("MONHOC.in"));
//        int n = Integer.parseInt(sc.nextLine());
//        MonHoc[] mh = new MonHoc[n];
//        for(int i = 0; i < n; i++){
//            mh[i] = new MonHoc(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()));
//        }
//        Arrays.sort(mh, new Comparator<MonHoc>(){
//            @Override
//            public int compare(MonHoc o1, MonHoc o2) {
//                return o1.getTenMon().compareToIgnoreCase(o2.getTenMon());
//            }
//        });
//        for(MonHoc x : mh){
//            System.out.println(x);
//        }
//    }
//}
