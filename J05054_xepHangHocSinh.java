//package codejavaptit;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.HashMap;
//import java.util.Scanner;
//
//class HocSinh{
//    private String maHS, hoTen, xepLoai;
//    private double diemTB;
//    private int xepHang;
//
//    public HocSinh(int maHS, String hoTen,double diemTB) {
//        this.maHS = String.format("HS%02d", maHS);
//        this.hoTen = hoTen;
//        this.diemTB = diemTB;
//        if(diemTB >= 9) this.xepLoai = "Gioi";
//        else if(diemTB >= 7) this.xepLoai = "Kha";
//        else if(diemTB >= 5) this.xepLoai = "Trung Binh";
//        else this.xepLoai = "Yeu";
//    }
//
//    public double getDiemTB() {
//        return diemTB;
//    }
//
//    public void setXepHang(int xepHang) {
//        this.xepHang = xepHang;
//    }
//
//    @Override
//    public String toString() {
//        return maHS + " " + hoTen + " " + String.format("%.1f", this.diemTB) + " " + this.xepLoai + " " + this.xepHang;
//    }
//}
//
//public class J05054_xepHangHocSinh {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = Integer.parseInt(sc.nextLine());
//        ArrayList<HocSinh> arr = new ArrayList<>();
//        ArrayList<Double> rank = new ArrayList<>();
//        for(int i = 1; i <= n; i++){
//            String hoTen = sc.nextLine();
//            double diemTB = Double.parseDouble(sc.nextLine());
//            arr.add(new HocSinh(i, hoTen, diemTB));
//            rank.add(diemTB);
//        }
//        Collections.sort(rank, new Comparator<Double>(){
//            @Override
//            public int compare(Double o1, Double o2) {
//                if(o1 < o2) return 1;
//                else return -1;
//            }
//        });
//        HashMap<Double, Integer> map = new HashMap<>();
//        int hang = 1, nho = 1;
//        for(int i = 0; i < n; i++){
//            if(i == 0){
//                map.put(rank.get(i), 1);
//            }
//            else{
//                if(map.containsKey(rank.get(i))){
//                    nho += 1;
//                }
//                else{
//                    hang += nho;
//                    nho = 1;
//                    map.put(rank.get(i), hang);
//                }
//            }
//        }
//        for(HocSinh x : arr){
//            x.setXepHang(map.get(x.getDiemTB()));
//            System.out.println(x);
//        }
//    }
//}
