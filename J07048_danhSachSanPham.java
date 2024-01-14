package codejavaptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class SanPham{
    private String maSP, tenSP;
    private int giaBan, baoHanh;

    public SanPham(String maSP, String tenSP, int giaBan, int baoHanh) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.giaBan = giaBan;
        this.baoHanh = baoHanh;
    }

    public String getMaSP() {
        return maSP;
    }

    public int getGiaBan() {
        return giaBan;
    }

    @Override
    public String toString() {
        return maSP + " " + tenSP + " " + giaBan + " " + baoHanh;
    }
    
}

public class J07048_danhSachSanPham {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("SANPHAM.in"));
        int n = Integer.parseInt(sc.nextLine());
        SanPham[] sp = new SanPham[n];
        for(int i = 0; i < n; i++){
            sp[i] = new SanPham(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
        }
        Arrays.sort(sp, new Comparator<SanPham>(){
            @Override
            public int compare(SanPham o1, SanPham o2) {
                if(o1.getGiaBan() != o2.getGiaBan())
                    return o2.getGiaBan() - o1.getGiaBan();
                else{
                    return -o2.getMaSP().compareToIgnoreCase(o1.getMaSP());
                }
            }
        });
        for(SanPham x : sp){
            System.out.println(x);
        }
    }
}
