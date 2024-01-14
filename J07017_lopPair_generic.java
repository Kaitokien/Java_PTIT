///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package codejavaptit;
//
//import java.io.File;
//import java.io.IOException;
//import java.util.Scanner;
//
//class Pair<T1, T2>{
//    private T1 num1;
//    private T2 num2;
//
//    public Pair(T1 num1, T2 num2) {
//        this.num1 = num1;
//        this.num2 = num2;
//    }
//    
//    public boolean nt(Integer n){
//        if(n < 2) return false;
//        for(int i = 2; i <= Math.sqrt(n); i++){
//            if(n % i == 0) return false;
//        }
//        return true;
//    }
//    
//    public boolean isPrime(){
//        return nt((Integer) num1) && nt((Integer) num2);
//    }
//
//    @Override
//    public String toString() {
//        return num1 + " " + num2;
//    }
//    
//}
//
//public class J07017_lopPair_generic {
//    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(new File("DATA.in"));
//        int t = sc.nextInt();
//        while(t-->0){
//            int n = sc.nextInt();
//            boolean check = false;
//            for(int i = 2; i <= 2*Math.sqrt(n); i++){
//                Pair<Integer, Integer> p = new Pair<>(i, n-i);
//                if(p.isPrime()){
//                    System.out.println(p);
//                    check = true;
//                    break; 
//                }
//            }
//            if(!check) System.out.println(-1);
//        }
//    }
//}
