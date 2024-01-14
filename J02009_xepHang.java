//package codejavaptit;
//
//import java.util.*;
//
//class Pair{
//    private int a, b;
//
//    public Pair(int a, int b) {
//        this.a = a;
//        this.b = b;
//    }
//
//    public int getA() {
//        return a;
//    }
//    
//    public int getB(){
//        return b;
//    }
//    
//}
//
//public class J02009_xepHang {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        Pair[] arr = new Pair[n];
//        for(int i = 0; i < n; i++){
//            arr[i] = new Pair(sc.nextInt(), sc.nextInt());
//        }
//        Arrays.sort(arr, new Comparator<Pair>(){
//            @Override
//            public int compare(Pair o1, Pair o2) {
//                return o1.getA() - o2.getA();
//            }
//        });
//        int time = 0;
//        for(int i = 0; i < n; i++){
//            if(time < arr[i].getA()){
//                time = arr[i].getA();
//            }
//            time += arr[i].getB();
//        }
//        System.out.println(time);
//    }
//}
