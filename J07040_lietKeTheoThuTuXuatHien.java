/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codejavaptit;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class J07040_lietKeTheoThuTuXuatHien {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream inputStream = new FileInputStream(new File("NHIPHAN.in"));
        Scanner sc = new Scanner(new File("VANBAN.in"));
        ObjectInputStream obj = new ObjectInputStream(inputStream);
        ArrayList<String> arr = (ArrayList<String>)obj.readObject();
        HashSet<String> set1 = new HashSet<>();
        LinkedHashSet<String> set2 = new LinkedHashSet<>();
        for(String x : arr){
            String[] word = x.trim().toLowerCase().split("\\s+");
            for(String y : word){
                set1.add(y);
            }
        }
        while(sc.hasNext()){
            set2.add(sc.next().trim().toLowerCase());
        }
        for(String x : set2){
            if(set1.contains(x)){
                System.out.println(x);
            }
        }
    }
}
