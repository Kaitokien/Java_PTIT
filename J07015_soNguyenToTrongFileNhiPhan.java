package codejavaptit;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class J07015_soNguyenToTrongFileNhiPhan {
    public static boolean nt(int n){
        if(n < 2) return false;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0) return false;
        }
        return true;
    }
    
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException{
        int[] mark = new int[10005];
        FileInputStream inputStream = new FileInputStream("SONGUYEN.in");
        ObjectInputStream in = new ObjectInputStream(inputStream);
        ArrayList<Integer> arr = (ArrayList)in.readObject();
        for(int x : arr){
            if(nt(x)) mark[x]++;
        }
        for(int i = 2; i < 10005; i++){
            if(mark[i] > 0) System.out.println(i + " " + mark[i]);
        }
    }
}
