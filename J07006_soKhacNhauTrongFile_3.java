package codejavaptit;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class J07006_soKhacNhauTrongFile_3 {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            FileInputStream inputStream = new FileInputStream("DATA.in");
            ObjectInputStream in = new ObjectInputStream(inputStream);
            ArrayList<Integer> arr = (ArrayList)in.readObject();
            int[] mark = new int[1001];
            for(int x : arr){
                mark[x]++;
            }
            for(int i = 0; i < 1001; i++){
                if(mark[i] > 0){
                    System.out.println(i + " " + mark[i]);
                }
            }
        }catch(Exception e){
            System.out.println("File not found");
        }
    }
}
