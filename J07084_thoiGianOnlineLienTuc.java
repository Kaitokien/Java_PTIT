/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codejavaptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

class Online implements Comparable<Online>{
    private String hoTen, batDau, ketThuc;
    private long minutes;

    public Online(String hoTen, String BD, String KT) throws ParseException {
        this.hoTen = hoTen;
        this.batDau = BD;
        this.ketThuc = KT;
        this.minutes = soPhut();
    }
    
    public long soPhut() throws ParseException{
        long time = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").parse(this.ketThuc).getTime() - new SimpleDateFormat("dd/MM/yyyy hh:mm:ss").parse(this.batDau).getTime();
        long minutes = TimeUnit.MILLISECONDS.toMinutes(time);
        return minutes;
    }

    @Override
    public String toString() {
        return hoTen +  " " + this.minutes;
    }

    @Override
    public int compareTo(Online o) {
        if(minutes != o.minutes){
            if(minutes > o.minutes) return -1;
            else return 1;
        }
        else{
            return hoTen.compareToIgnoreCase(o.hoTen);
        }
    }
    
}

public class J07084_thoiGianOnlineLienTuc {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Online> arr = new ArrayList<>();
        for(int i = 0; i < n; i++){
            String hoTen = sc.nextLine();
            String bd = sc.nextLine();
            String kt = sc.nextLine();
            arr.add(new Online(hoTen, bd, kt));
        }
        Collections.sort(arr);
        for(Online x : arr){
            System.out.println(x);
        }
    }
}
