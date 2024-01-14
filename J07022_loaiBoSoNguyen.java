package codejavaptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class J07022_loaiBoSoNguyen {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("DATA.in"));
        ArrayList<String> arr = new ArrayList<>();
        while(sc.hasNext()){
            String res = sc.next();
            try{
                int tmp = Integer.parseInt(res);
            }catch(NumberFormatException e){
                arr.add(res);
            }
        }
        Collections.sort(arr);
        for(String x : arr){
            System.out.print(x + " ");
        }
    }
}
