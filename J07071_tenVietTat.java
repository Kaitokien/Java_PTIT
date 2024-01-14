/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codejavaptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;



public class J07071_tenVietTat {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<String> hoTen = new ArrayList<>();
        for(int i = 0; i < n; i++){
            String x = sc.nextLine();
            hoTen.add(x);
        }
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            ArrayList<String> arr = new ArrayList<>();
            String vietTat = sc.nextLine();
            String ss = "";
            for(char x : vietTat.toCharArray()){
                if((x >= 'a' && x <= 'z') || (x >= 'A' && x <= 'Z') || x == '*'){
                    ss += x;
                }
            }
            for(String x : hoTen){
                
            }
        }
    }
}
