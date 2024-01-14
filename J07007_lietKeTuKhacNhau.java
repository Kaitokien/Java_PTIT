package codejavaptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

class WordSet{
    private String tenFile;

    public WordSet(String tenFile) {
        this.tenFile = tenFile;
    }

    @Override
    public String toString() {
        TreeSet<String> se = new TreeSet<>();
        try{
            Scanner sc = new Scanner(new File(tenFile));
            while(sc.hasNext()){
                se.add(sc.next().toLowerCase());
            }
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
        String s = "";
        for(String x : se){
            s += x + '\n';
        }
        return s;
    }
}

public class J07007_lietKeTuKhacNhau {
    public static void main(String[] args) throws IOException {
        WordSet ws = new WordSet("VANBAN.in");
        System.out.println(ws);
    }
}
