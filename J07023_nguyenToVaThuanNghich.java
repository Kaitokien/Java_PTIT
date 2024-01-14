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
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author ACER
 */
public class J07023_nguyenToVaThuanNghich {
    public static int [] nto = new int[10005];
    public static int [] cnt1 = new int[10005];
    public static int [] cnt2 = new int[10005];
    
    public static void sieve(){
        Arrays.fill(nto, 1);
        nto[0] = 0; nto[1] = 0;
        for(int i = 2; i <= Math.sqrt(10005); i++){
            if(nto[i] == 1){
                for(int j = i * i; j < 10005; j += i){
                    nto[j] = 0;
                }
            }
        }
    }
    public static boolean thuanNghich(int n){
        String s = n + "";
        StringBuilder sb = new StringBuilder(s);
        sb = sb.reverse();
        if(s.compareToIgnoreCase(sb.toString()) == 0)
            return true;
        return false;
    }
    
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        sieve();
        FileInputStream inputStream1 = new FileInputStream(new File("DATA1.in"));
        FileInputStream inputStream2 = new FileInputStream(new File("DATA2.in"));
        ObjectInputStream obj1 = new ObjectInputStream(inputStream1);
        ObjectInputStream obj2 = new ObjectInputStream(inputStream2);
        ArrayList<Integer> arr1 = (ArrayList<Integer>)obj1.readObject();
        ArrayList<Integer> arr2 = (ArrayList<Integer>)obj2.readObject();
        for(Integer x : arr1){
            if(nto[x] == 1 && thuanNghich(x)) cnt1[x]++;
        }
        for(Integer x : arr2){
            if(nto[x] == 1 && thuanNghich(x)) cnt2[x]++;
        }
        Collections.sort(arr1);
        for(int i = 2; i < 10000; i++){
            if(cnt1[i] > 0 && cnt2[i] > 0 && nto[i] == 1){
                System.out.println(i + " " + cnt1[i] + " " + cnt2[i]);
            }
        }
    }
}
