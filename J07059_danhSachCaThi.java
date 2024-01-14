package codejavaptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class CaThi implements Comparable<CaThi>{
    private String maCaThi, ngayThi, gioThi, phongThi;

    public CaThi(int maCaThi, String ngayThi, String gioThi, String phongThi) {
        this.maCaThi = String.format("C%03d", maCaThi);
        this.ngayThi = ngayThi;
        this.gioThi = gioThi;
        this.phongThi = phongThi;
    }

    @Override
    public int compareTo(CaThi o) {
        if(ngayThi.compareToIgnoreCase(o.ngayThi) != 0)
            return ngayThi.compareToIgnoreCase(o.ngayThi);
        else if(gioThi.compareToIgnoreCase(o.gioThi) != 0)
            return gioThi.compareToIgnoreCase(o.gioThi);
        else return maCaThi.compareToIgnoreCase(o.maCaThi);
    }

    @Override
    public String toString() {
        return maCaThi + " " + ngayThi + " " + gioThi + " " + phongThi;
    }
    
}

public class J07059_danhSachCaThi {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("CATHI.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<CaThi> ct = new ArrayList<>();
        for(int i = 0; i < n; i++){
            String ngayThi = sc.nextLine();
            String gioThi = sc.nextLine();
            String phongThi = sc.nextLine();
            ct.add(new CaThi(i + 1, ngayThi, gioThi, phongThi));
        }
        Collections.sort(ct);
        for(CaThi x : ct){
            System.out.println(x);
        }
    }
}
