package codejavaptit;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class J07005_soKhacNhauTrongFile {
    public static void main(String[] args) {
        try{
            int[] mark = new int[1005];
            //FileOutputStream out = new FileOutputStream("DATA.IN");
            FileInputStream in = new FileInputStream("DATA.IN");
            DataInputStream dt = new DataInputStream(in);
            int c;
            while(dt.available() > 0){
                mark[dt.readInt()]++;
            }
            for(int i = 0; i < 1005; i++){
                if(mark[i] > 0)
                    System.out.println(i + " " + mark[i]);
            }
        }catch(Exception e){
            System.out.println("File not found");
        }
    }
}