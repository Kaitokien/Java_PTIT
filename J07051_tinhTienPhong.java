package codejavaptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.Scanner;


class Khach{
    private String ma, tenKH, ngayNhan, ngayTra;
    private int soPhong;
    private int tienDichVu;
    private long soNgay, tien;

    public Khach(int ma, String tenKH, int soPhong, String ngayNhan, String ngayTra, int tienDichVu) {
        this.ma = "KH" + String.format("%02d", ma);
        this.tenKH = tenKH;
        this.ngayNhan = ngayNhan;
        this.ngayTra = ngayTra;
        this.soPhong = soPhong;
        this.tienDichVu = tienDichVu;
    }

    public long getTien() {
        return tien;
    }
    
    public void chuanHoaTen(){
        String ten = "";
        String[] arr = tenKH.trim().split("\\s+");
        for(String x : arr){
            ten += Character.toUpperCase(x.charAt(0)) + x.substring(1).toLowerCase() + " ";
        }
        tenKH = ten.substring(0, ten.length() - 1);
    }
    
    public void tinhSoNgay(Date den, Date di){
        long diff = Math.abs(di.getTime() - den.getTime());
        soNgay = 1l * diff / (24 * 60 * 60 * 1000) + 1;
    }
    
    public void tinhTien(){
        String phong = soPhong + "";
        long tien = 0l;
        if(phong.substring(0, 1).equals("1")){
            tien += 25 * soNgay;
        }
        else if(phong.substring(0, 1).equals("2")){
            tien += 34 * soNgay;
        }
        else if(phong.substring(0, 1).equals("3")){
            tien += 50 * soNgay;
        }
        else if(phong.substring(0, 1).equals("4")){
            tien += 80 * soNgay;
        }
        this.tien += tienDichVu + tien;
    }
    
    @Override
    public String toString() {
        return ma + " " + tenKH + " " + soPhong + " " + soNgay + " " + this.tien;
    }
    
}

public class J07051_tinhTienPhong {
    public static void main(String[] args) throws FileNotFoundException, ParseException{
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        int n = Integer.parseInt(sc.nextLine());
        Khach[] kh = new Khach[n];
        for(int i = 0; i< n; i++){
            String ten = sc.nextLine();
            int soPhong = Integer.parseInt(sc.nextLine().trim());
            String ngayNhan = sc.nextLine();
            String ngayTra = sc.nextLine();
            int tienDichVu = Integer.parseInt(sc.nextLine());
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Date den = sdf.parse(ngayNhan);
            Date di = sdf.parse(ngayTra);
            kh[i] = new Khach(i + 1, ten, soPhong, ngayNhan, ngayTra, tienDichVu);
            kh[i].chuanHoaTen();
            kh[i].tinhSoNgay(den, di);
            kh[i].tinhTien();
        }
        Arrays.sort(kh, new Comparator<Khach>(){
            @Override
            public int compare(Khach o1, Khach o2) {
                if(o1.getTien() > o2.getTien()) return -1;
                else return 1;
            }
        });
        for(Khach x : kh){
            System.out.println(x);
        }
    }
}
