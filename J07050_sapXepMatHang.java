//package codejavaptit;
//
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.util.Arrays;
//import java.util.Comparator;
//import java.util.Scanner;
//
//class MatHang{
//    private String maHang, tenHang, nhomHang;
//    private double loiNhuan;
//
//    public MatHang(int maHang, String tenHang, String nhomHang, double giaBan, double giaMua) {
//        this.maHang = "MH" + String.format("%02d", maHang);
//        this.tenHang = tenHang;
//        this.nhomHang = nhomHang;
//        this.loiNhuan = giaMua - giaBan;
//    }
//
//    public double getLoiNhuan() {
//        return loiNhuan;
//    }
//
//    @Override
//    public String toString() {
//        return maHang + " " + tenHang + " " + nhomHang + " " + String.format("%.2f", this.loiNhuan);
//    }
//    
//}
//
//public class J07050_sapXepMatHang {
//    public static void main(String[] args) throws FileNotFoundException{
//        Scanner sc = new Scanner(new File("MATHANG.in"));
//        int n = Integer.parseInt(sc.nextLine());
//        MatHang[] mh = new MatHang[n];
//        for(int i = 0; i < n; i++){
//            mh[i] = new MatHang(i + 1, sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()));
//        }
//        Arrays.sort(mh, new Comparator<MatHang>(){
//            @Override
//            public int compare(MatHang o1, MatHang o2) {
//                if(o1.getLoiNhuan() < o2.getLoiNhuan()) return 1;
//                else if(o1.getLoiNhuan() > o2.getLoiNhuan()) return -1;
//                else return 0;
//            }
//        });
//        for(MatHang x : mh){
//            System.out.println(x);
//        }
//    }
//}
