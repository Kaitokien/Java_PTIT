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
import java.math.BigInteger;
import java.util.ArrayList;


public class J07085_tongChuSo {
    public static int tinhTongChuSo(String n){
        int ans = 0;
        for(char x : n.toCharArray()){
            ans += x - '0';
        }
        return ans;
    }
    
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream inputStream = new FileInputStream(new File("DATA.in"));
        ObjectInputStream obj = new ObjectInputStream(inputStream);
        ArrayList<String> arr = (ArrayList<String>)obj.readObject();
        for(String x : arr){
            String ans = "";
            for(char u : x.toCharArray()){
                if(Character.isDigit(u)){
                    ans += u;
                }
            }
            BigInteger a = new BigInteger(ans);
            int tongCS = tinhTongChuSo(ans);
            System.out.println(a + " " + tongCS);
        }
    }
}
