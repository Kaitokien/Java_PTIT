/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codejavaptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class DanhSachHoTen implements Comparable<DanhSachHoTen>{
    private String hoTen, ten, ho, tenDem;

    public DanhSachHoTen(String hoTen) {
        this.hoTen = chuanHoaTen(hoTen);
        String[] arr = this.hoTen.split("\\s+");
        ten = arr[arr.length - 1];
        ho = arr[0];
        for(int i = 1; i < arr.length - 1; i++){
            if(i != arr.length - 2)
                tenDem += arr[i] + " ";
            else
                tenDem += arr[i];
        }
    }
    
    public String chuanHoaTen(String s){
        String ten = "";
        String[] arr1 = s.trim().split("\\s+");
        for(String x : arr1){
            ten += Character.toUpperCase(x.charAt(0)) + x.substring(1).toLowerCase() + " ";
        }
        return ten.substring(0, ten.length() - 1);
    }

    @Override
    public int compareTo(DanhSachHoTen o) {
        if(ten.compareToIgnoreCase(o.ten) != 0){
            return ten.compareToIgnoreCase(o.ten);
        }
        else if(ho.compareToIgnoreCase(o.ho) != 0)
            return ho.compareToIgnoreCase(o.ho);
        else return tenDem.compareToIgnoreCase(o.tenDem);
    }

    @Override
    public String toString() {
        return hoTen;
    }
    
}

public class J07072_chuanHoaVaSapXep {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        ArrayList<DanhSachHoTen> dsht = new ArrayList<>();
        while(sc.hasNext()){
            String hoTen = sc.nextLine();
            dsht.add(new DanhSachHoTen(hoTen));
        }
        Collections.sort(dsht);
        for(DanhSachHoTen x : dsht){
            System.out.println(x);
        }
    }
}
