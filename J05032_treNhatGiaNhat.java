/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codejavaptit;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;

class ConNguoi implements Comparable<ConNguoi>{
    private String ten, ngaySinh;
    private long tuoi;

    public ConNguoi(String ten, String ngaySinh) throws ParseException {
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.tuoi = tinhTuoi();
    }

    public String getTen() {
        return ten;
    }
    
    public long tinhTuoi() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return new Date().getTime() - sdf.parse(ngaySinh).getTime();
    }

    @Override
    public int compareTo(ConNguoi o) {
        if(tuoi > o.tuoi) return -1;
        else return 1;
    }

    @Override
    public String toString() {
        return ten;
    }
}

public class J05032_treNhatGiaNhat {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<ConNguoi> connguoi = new ArrayList<>();
        for(int i = 0; i < n; i++){
            String[] s = sc.nextLine().split("\\s+");
            connguoi.add(new ConNguoi(s[0], s[1]));
        }
        Collections.sort(connguoi);
        System.out.println(connguoi.get(connguoi.size() - 1));
        System.out.println(connguoi.get(0));
    }
}
