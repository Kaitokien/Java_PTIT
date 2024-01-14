package codejavaptit;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class HocSinh{
    private String maHS, hoTen, xepLoai;
    private double diemTB;

    public HocSinh(int maHS, String hoTen, String diem) {
        this.maHS = String.format("HS%02d", maHS);
        this.hoTen = hoTen;
        this.diemTB = 0;
        this.diemTB = getDiemTB(diem);
    }
    
    public double getDiemTB(String diem){
        String[] arr = diem.trim().split("\\s+");
        double ans = Double.parseDouble(arr[0]) * 2 + Double.parseDouble(arr[1]) * 2;
        for(int i = 2; i < arr.length; i++){
            ans += Double.parseDouble(arr[i]);
        }
        return ans / 12;
    }

    public String getMaHS() {
        return maHS;
    }

    public double getDiemTB() {
        return diemTB;
    }
    
    public void rank(){
        if(this.diemTB >= 9) this.xepLoai = "XUAT SAC";
        else if(this.diemTB >= 8) this.xepLoai = "GIOI";
        else if(this.diemTB >= 7) this.xepLoai = "KHA";
        else if(this.diemTB >= 5) this.xepLoai = "TB";
        else this.xepLoai = "YEU";
    }

    @Override
    public String toString() {
        return maHS + " " + hoTen + " " + String.format("%.1f", Math.round(diemTB * 10) / 10.0) + " " + xepLoai;
    }
    
}

public class J05018_bangDiemHocSinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        HocSinh[] hs = new HocSinh[n];
        for(int i = 0; i < n; i++){
            String hoTen = sc.nextLine();
            hs[i] = new HocSinh(i + 1, hoTen, sc.nextLine());
            hs[i].rank();
        }
        Arrays.sort(hs, new Comparator<HocSinh>(){
            @Override
            public int compare(HocSinh o1, HocSinh o2){
                if(o1.getDiemTB() != o2.getDiemTB()){
                    if(o1.getDiemTB() > o2.getDiemTB()) return -1;
                    else return 1;
                }
                else{
                    return o1.getMaHS().compareToIgnoreCase(o2.getMaHS());
                }
            }
        });
        for(HocSinh x : hs){
            System.out.println(x);
        }
    }
}
