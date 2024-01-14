package codejavaptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J07004_soKhacNhauTrongFile_1 {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("DATA.in"));
        int[] mark = new int[1005];
        while(sc.hasNext()){
            int idx = sc.nextInt();
            mark[idx]++;
        }
        for(int i = 0; i < 1001; i++){
            if(mark[i] > 0){
                System.out.println(i + " " + mark[i]);
            }
        }
    }
}
