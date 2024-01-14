/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codejavaptit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class ThucTapSinh implements Comparable<ThucTapSinh>{
    private int stt;
    private String maSV, hoTen, lop, email, dn;

    public ThucTapSinh(int stt, String maSV, String hoTen, String lop, String email, String dn) {
        this.stt = stt;
        this.maSV = maSV.trim();
        this.hoTen = hoTen.trim();
        this.lop = lop.trim();
        this.email = email.trim();
        this.dn = dn.trim();
    }

    public String getDn() {
        return dn;
    }

    @Override
    public int compareTo(ThucTapSinh o) {
        return maSV.compareToIgnoreCase(o.maSV);
    }

    @Override
    public String toString() {
        return stt + " " + maSV + " " + hoTen + " " + lop + " " + email + " " + dn;
    }
    
}

public class J05034_danhSachThucTap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<ThucTapSinh> tts = new ArrayList<>();
        for(int i = 0; i < n; i++){
            String maSV = sc.nextLine();
            String hoTen = sc.nextLine();
            String lop = sc.nextLine();
            String email = sc.nextLine();
            String dn = sc.nextLine();
            tts.add(new ThucTapSinh(i + 1, maSV, hoTen, lop, email, dn));
        }
        Collections.sort(tts);
        int q = Integer.parseInt(sc.nextLine());
        while(q-- > 0){
            String dn = sc.nextLine();
            for(ThucTapSinh x : tts){
                if(x.getDn().equals(dn)){
                    System.out.println(x);
                }
            }
        }
    }
}
