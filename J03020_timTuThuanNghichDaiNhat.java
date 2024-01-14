/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codejavaptit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class J03020_timTuThuanNghichDaiNhat {
    public static boolean checktn(String s){
        StringBuilder sb = new StringBuilder(s);
        return s.equals(sb.reverse().toString());
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> map = new HashMap<>();
        LinkedHashSet<String> set = new LinkedHashSet<>();
        int len = -1;
        while(sc.hasNext()){
            String s = sc.next();
            if(checktn(s) && s.length() >= len){
                set.add(s);
                len = s.length();
                if(map.get(s) == null){
                    map.put(s, 1);
                }
                else{
                    int tanSuat = map.get(s);
                    map.put(s, tanSuat + 1);
                }
            }
        }
        for(String x : set){
            if(x.length() == len){
                System.out.println(x + " " + map.get(x));
            }
        }
    }
}
