package codejavaptit;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;

class Gamer implements Comparable<Gamer>{
    private String ma, hoTen, gioVao, gioRa;
    private long gio, phut, miligiay;

    public Gamer(String ma, String hoTen, String gioVao, String gioRa) throws ParseException {
        this.ma = ma;
        this.hoTen = hoTen;
        this.gioVao = gioVao;
        this.gioRa = gioRa;
        this.gio = tinhThoiGian() / (1000 * 60 * 60);
        this.phut = tinhThoiGian() / (1000 * 60) - this.gio * 60;
        this.miligiay = tinhThoiGian();
    }
    
    public long tinhThoiGian() throws ParseException{
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm");
        Date vao = sdf.parse(gioVao);
        Date ra = sdf.parse(gioRa);
        long time = ra.getTime() - vao.getTime();
        return time;
    }

    @Override
    public String toString() {
        return ma + " " + hoTen + " " + gio + " gio " + phut + " phut";
    }

    @Override
    public int compareTo(Gamer o) {
        if(miligiay > o.miligiay) return -1;
        else if(miligiay < o.miligiay) return 1;
        else return 0;
    }
    
}

public class J05011_tinhGio {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Gamer> gamers = new ArrayList<>();
        for(int i = 0; i < n; i++){
            String ma = sc.nextLine();
            String hoTen = sc.nextLine();
            String gioVao = sc.nextLine();
            String gioRa = sc.nextLine();
            gamers.add(new Gamer(ma, hoTen, gioVao, gioRa));
        }
        Collections.sort(gamers);
        for(Gamer x : gamers){
            System.out.println(x);
        }
    }
}
