package codejavaptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class J07002_tinhTong {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("DATA.in"));
        long sum = 0;
        while(sc.hasNext()){
            if(sc.hasNextInt()){
                int tmp = sc.nextInt();
                sum += tmp;
            }
            else sc.next();
        }
        System.out.println(sum);
    }
}
