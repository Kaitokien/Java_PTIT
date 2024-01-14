package codejavaptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

class KhachHang implements Comparable<KhachHang>{
    public static int id = 1;
    private String maKhachHang, hoTen, maPhong;
    private Long thoiGian;

    public KhachHang(String hoTen, String maPhong, Long thoiGian) {
        this.maKhachHang = "KH" + String.format("%02d", id++);
        this.hoTen = hoTen;
        this.maPhong = maPhong;
        this.thoiGian = thoiGian;
    }

    public Long getThoiGian() {
        return thoiGian;
    }

    @Override
    public String toString() {
        return maKhachHang + " " + hoTen + " " + maPhong + " " + thoiGian;
    }

    @Override
    public int compareTo(KhachHang other) {
        return -thoiGian.compareTo(other.getThoiGian());
    }
}

public class J07046_danhSachLuuTru {
    public static void main(String[] args) throws FileNotFoundException, ParseException{
        Scanner sc = new Scanner(new File("KHACH.in"));
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        int n = Integer.parseInt(sc.nextLine());
        List<KhachHang> ds = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            String roomId = sc.nextLine();
            Date startDay = sdf.parse(sc.nextLine());
            Date lastDay = sdf.parse(sc.nextLine());
            Long duration = (lastDay.getTime() - startDay.getTime()) / (1000L * 60 * 60 * 24); // convert second -> day
            ds.add(new KhachHang(name, roomId, duration));
        }
        Collections.sort(ds);
        ds.forEach(System.out::println);
    }
}
