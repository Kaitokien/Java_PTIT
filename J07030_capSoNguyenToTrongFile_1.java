package codejavaptit;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

/**
 *
 * @author ACER
 */
public class J07030_capSoNguyenToTrongFile_1 {
    public static int[] mark = new int[1000005];
    public static boolean nt(int n){
        if(n < 2) return false;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0) return false;
        }
        return true;
    }
    
    public static boolean check(int n ,int m){
        if(n < m && mark[n] == 0 && mark[m] == 0 && nt(n) && nt(m)){
            return true;
        }
        return false;
    }
    
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream inputStream1 = new FileInputStream(new File("DATA1.in"));
        FileInputStream inputStream2 = new FileInputStream(new File("DATA2.in"));
        ObjectInputStream obj1 = new ObjectInputStream(inputStream1);
        ObjectInputStream obj2 = new ObjectInputStream(inputStream2);
        ArrayList<Integer> arr1 = (ArrayList)obj1.readObject();
        ArrayList<Integer> arr2 = (ArrayList)obj2.readObject();
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        set1.addAll(arr1);
        set2.addAll(arr2);
        Collections.sort(arr1);
        for(int n : arr1){
            int m = 1000000 - n;
            if(set2.contains(m) || set2.contains(n) || set1.contains(m) == false){
                continue;
            }
            if(check(n, m)){
                mark[n] = 1; mark[m] = 1;
                System.out.println(n + " " + m);
            }
        }
    }
}
