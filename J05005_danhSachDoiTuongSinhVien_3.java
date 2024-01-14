package codejavaptit;

import java.util.*;


class sinhVien{
    private String ma, hoTen, ngaySinh, lop;
    private double gpa;

    public sinhVien() {
    }
    
    public sinhVien(int ma, String hoTen, String lop, String ngaySinh, double gpa) {
        this.ma = "B20DCCN" + String.format("%03d", ma);
        this.hoTen = chuanHoaTen(hoTen);
        this.ngaySinh = chuanHoa(ngaySinh);
        this.lop = lop;
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }
    
    private String chuanHoa(String s){
        StringBuilder sb = new StringBuilder(s);
        if(sb.charAt(2) != '/'){
            sb.insert(0, "0");
        }
        if(sb.charAt(5) != '/'){
            sb.insert(3, "0");
        }
        return sb.toString();
    }
    
    private String chuanHoaTen(String s){
        String[] arr = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder("");
        for(String x : arr){
            for(int i = 0; i < x.length(); i++){
                if(i == 0){
                    sb.append(Character.toUpperCase(x.charAt(i)));
                }
                else
                    sb.append(Character.toLowerCase(x.charAt(i)));
            }
            sb.append(" ");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    @Override
    public String toString() {
        return ma + " " + hoTen + " " + lop + " " + ngaySinh + " " + String.format("%.2f", gpa);
    }

}

public class J05005_danhSachDoiTuongSinhVien_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        sinhVien[] a = new sinhVien[n];
        for(int i = 0; i < n; i++){
            a[i] = new sinhVien(i + 1, sc.nextLine(), sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()));
        }
        Arrays.sort(a, new Comparator<sinhVien>(){
            @Override
            public int compare(sinhVien o1, sinhVien o2) {
                if (o1.getGpa() < o2.getGpa()) return 1;
                return -1;
            }
        });
        for(int i = 0; i < n; i++){
            System.out.println(a[i]);
        }
    }
}
