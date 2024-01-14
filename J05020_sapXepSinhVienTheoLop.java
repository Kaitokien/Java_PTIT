//package codejavaptit;
//
//import java.util.Arrays;
//import java.util.Comparator;
//import java.util.Scanner;
//
//class SinhVien{
//    private String maSV, hoTen, lop, email;
//
//    public SinhVien(String maSV, String hoTen, String lop, String email) {
//        this.maSV = maSV;
//        this.hoTen = hoTen;
//        this.lop = lop;
//        this.email = email;
//    }
//
//    public String getLop() {
//        return lop;
//    }
//
//    public String getMaSV() {
//        return maSV;
//    }
//
//    @Override
//    public String toString() {
//        return maSV + " " + hoTen + " " + lop + " " + email;
//    }
//    
//}
//
//public class J05020_sapXepSinhVienTheoLop {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = Integer.parseInt(sc.nextLine());
//        SinhVien[] a = new SinhVien[n];
//        for(int i = 0; i < n; i++){
//            a[i] = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
//        }
//        Arrays.sort(a, new Comparator<SinhVien>(){
//            @Override
//            public int compare(SinhVien o1, SinhVien o2) {
//                if(o1.getLop().compareToIgnoreCase(o2.getLop()) != 0) return o1.getLop().compareToIgnoreCase(o2.getLop());
//                else{
//                    return o1.getMaSV().compareToIgnoreCase(o2.getMaSV());
//                }
//            }            
//        });
//        for(SinhVien x : a){
//            System.out.println(x);
//        }
//    }
//}
