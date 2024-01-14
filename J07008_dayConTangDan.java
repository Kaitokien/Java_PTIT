/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codejavaptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class J07008_dayConTangDan {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        List<Integer> list = new ArrayList<>();
        int n = sc.nextInt();
        while(sc.hasNext()){
            int res = sc.nextInt();
            list.add(res);
        }
        ArrayList<String> str = new ArrayList<>();
        for(int i = 0; i < n; i++){
            String res = "";
            int tmp = list.get(i);
            for(int j = i + 1; j < n; j++){
                if(list.get(j) > tmp){
                    if(res.length() == 0) res += tmp + " " + list.get(j) + " ";
                    else res += list.get(j) + " ";
                    tmp = list.get(j);
                    str.add(res.substring(0, res.length() - 1));
                }
            }
        }
        Collections.sort(str);
        for(String x : str){
            System.out.println(x);
        }
    }
}
