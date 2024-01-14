package codejavaptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class DoanhNghiep{
    private String ma, tenDN;
    private int soSV;

    public DoanhNghiep(String ma, String tenDN, int soSV) {
        this.ma = ma;
        this.tenDN = tenDN;
        this.soSV = soSV;
    }

    public String getMa() {
        return ma;
    }

    @Override
    public String toString() {
        return ma + " " + tenDN + " " + soSV;
    }
    
}

public class J07037_danhSachDoanhNghiep {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("DN.in"));
        int n = Integer.parseInt(sc.nextLine());
        DoanhNghiep[] dn = new DoanhNghiep[n];
        for(int i = 0; i < n; i++){
            dn[i] = new DoanhNghiep(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()));
        }
        Arrays.sort(dn, new Comparator<DoanhNghiep>(){
            @Override
            public int compare(DoanhNghiep o1, DoanhNghiep o2) {
                return o1.getMa().compareToIgnoreCase(o2.getMa());
            }
        });
        for(DoanhNghiep x : dn){
            System.out.println(x);
        }
    }
}
