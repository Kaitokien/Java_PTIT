package codejavaptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class LoaiPhong implements Comparable<LoaiPhong>{
    private String xau, kyHieu, tenPhong, donGia, phiPV;
    
    public LoaiPhong(String xau) {
        this.xau = xau;
        String[] arr = this.xau.split("\\s+");
        this.kyHieu = arr[0];
        this.tenPhong = arr[1];
        this.donGia = arr[2];
        this.phiPV = arr[3];
    }

    @Override
    public int compareTo(LoaiPhong other) {
        return this.getTenPhong().compareToIgnoreCase(other.getTenPhong());
    }

    public String getTenPhong() {
        return tenPhong;
    }

    @Override
    public String toString() {
        return kyHieu + " " + tenPhong + " " + donGia + " " + phiPV;
    }
    
}

public class J07045_loaiPhong {
    public static void main(String[] args) throws IOException {
        ArrayList<LoaiPhong> ds = new ArrayList<>();
        Scanner in = new Scanner(new File("DATA.in"));
        int n = Integer.parseInt(in.nextLine());
        while(n-->0){
            ds.add(new LoaiPhong(in.nextLine()));
        }
        Collections.sort(ds);
        for(LoaiPhong tmp : ds){
            System.out.println(tmp);
        }
    }
}
