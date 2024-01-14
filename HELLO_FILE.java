package codejavaptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class HELLO_FILE {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(new File("Hello.txt"));
            while(sc.hasNext()){
                System.out.println(sc.nextLine());
            }
        } catch(FileNotFoundException ex){
            System.out.println("File not found");
        }
    }
}
