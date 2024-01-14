//package codejavaptit;
//
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.*;
//
//class HocSinh {
//    private String msv, name, lop, dob;
//    private double gpa;
//
//    public HocSinh(int ma, String name, String lop, String dob, double gpa) {
//        this.msv = "B20DCCN" + String.format("%03d", ma);
//        this.name = name;
//        this.lop = lop;
//        this.dob = dob;
//        this.gpa = gpa;
//    }
//    
//    public void chuanHoa() throws ParseException{
//        SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
//        String ans = null;
//        ans = sdf.format(sdf.parse(this.dob));
//        this.dob = ans;
//    }
//
//    @Override
//    public String toString() {
//        return msv + " " + name + " " + lop + " " + dob + " " + String.format("%.2f", gpa);
//    }
//}
//
//public class  J07010_danhSachSinhVienTrongFile_2{
//    public static void main(String[] args) throws FileNotFoundException, ParseException{
//        Scanner sc = new Scanner(new File("SV.in"));
//        int n = Integer.parseInt(sc.nextLine());
//        HocSinh[] hs = new HocSinh[n];
//        for(int i = 0; i < n; i++){
//            hs[i] = new HocSinh(i + 1, sc.nextLine(), sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()));
//            hs[i].chuanHoa();
//        }
//        for(int i = 0; i < n; i++){
//            System.out.println(hs[i]);
//        }
//    }
//}
// 
