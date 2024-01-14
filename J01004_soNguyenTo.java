/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codejavaptit;
import java.util.Scanner;

public class J01004_soNguyenTo {
    public static boolean nt(int n) {
        if(n <= 1) return false;
        for(int i = 2; i <= Math.sqrt(n); i++){
                if(n % i == 0) return false;
            }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            int n = sc.nextInt();
            if(nt(n) == true) System.out.println("YES");
            else System.out.println("NO");
            t--;
        }
    }
}
