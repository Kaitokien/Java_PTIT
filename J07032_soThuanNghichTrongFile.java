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

/**
 *
 * @author ACER
 */
public class J07032_soThuanNghichTrongFile {
    public static int[] dem = new int[1000005];
    public static boolean kiemTra(int x){
        String tmp = x + "";
        StringBuilder sb = new StringBuilder(tmp);
        sb = sb.reverse();
        String res = sb.toString();
        boolean check = true;
        for(char u : tmp.toCharArray()){
            if((u - '0') % 2 == 0){
                return false;
            }
        }
        if(!tmp.equals(res) || tmp.length() == 1 || tmp.length() % 2 == 0){
            return false;
        }
        return true;
    }
    
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream inputStream1 = new FileInputStream(new File("DATA1.in"));
        FileInputStream inputStream2 = new FileInputStream(new File("DATA2.in"));
        ObjectInputStream obj1 = new ObjectInputStream(inputStream1);
        ObjectInputStream obj2 = new ObjectInputStream(inputStream2);
        ArrayList<Integer> arr1 = (ArrayList)obj1.readObject();
        ArrayList<Integer> arr2 = (ArrayList)obj2.readObject();
        ArrayList<Integer> kqua = new ArrayList<>();
        for(int x : arr1){
            if(kiemTra(x) && arr2.contains(x)){
                dem[x]++;
            }
        }
        for(int x : arr2){
            if(kiemTra(x) && dem[x] > 0){
                dem[x]++;
            }
        }
        int cnt = 0;
        for(int i = 0; i < 1000005; i++){
            if(cnt == 10) break;
            if(dem[i] != 0){
                System.out.println(i + " " + dem[i]);
                ++cnt;
            }
        }
    }
}
