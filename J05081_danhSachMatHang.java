package codejavaptit;

import java.util.*;

class matHang{
    private String ma, ten, donVi;
    private int giaMua, giaBan;

    public matHang(int ma, String ten, String donVi, int giaMua, int giaBan) {
        this.ma = String.format("%03d", ma);
        this.ma = "MH" + this.ma;
        this.ten = ten;
        this.donVi = donVi;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
    }

    public int getGiaMua() {
        return giaMua;
    }

    public int getGiaBan() {
        return giaBan;
    }

    public String getMa() {
        return ma;
    }

    @Override
    public String toString() {
        int res = giaBan - giaMua;
        return ma + " " + ten + " " + donVi + " " + giaMua + " " + giaBan + " " + res;
    }
    
    
    
}

public class J05081_danhSachMatHang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        matHang[] mh = new matHang[t];
        for(int i = 0; i < t; i++){
            mh[i] = new matHang(i + 1, sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
        }
        Arrays.sort(mh, new Comparator<matHang>(){
            @Override
            public int compare(matHang o1, matHang o2) {
                int lai_1 = o1.getGiaBan() - o1.getGiaMua();
                int lai_2 = o2.getGiaBan() - o2.getGiaMua();
                if(lai_1 != lai_2){
                    return lai_2 - lai_1;
                }
                else return o1.getMa().compareTo(o2.getMa());
            }
            
        });
        for(matHang u : mh){
            System.out.println(u);
        }
    }
}
