package codejavaptit;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class J07029_soNguyenToLonNhatTrongFile {
    public static int [] mark = new int[1000005];
    public static boolean nt(int n){
        if(n < 2) return false;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0) return false;
        }
        return true;
    }
    
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException{
        FileInputStream inputStream = new FileInputStream("DATA.in");
        ObjectInputStream in = new ObjectInputStream(inputStream);
        ArrayList<Integer> arr = (ArrayList)in.readObject();
        for(int x : arr){
            if(nt(x)) mark[x]++;
        }
        int dem = 0;
        for(int i = 1000000; i >= 2; i--){
            if(dem == 10) break;
            if(mark[i] > 0){
                System.out.println(i + " " + mark[i]);
                dem += 1;
            }
        }
    }
}
