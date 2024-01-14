//package codejavaptit;
//
//import java.util.*;
//
//class Point {
//    private double x, y;
//    
//    public Point(){
//    }
//    
//    public Point(double x, double y){
//        this.x = x;
//        this.y = y;
//    }
//    public Point(Point p){
//        
//    }
//    public double getX(){
//        return x;
//    }
//    
//    public static Point nextPoint(Scanner sc){
//        Point a = new Point();
//        a.x = sc.nextDouble();
//        a.y = sc.nextDouble();
//        return a;
//    }
//    
//    public double getY(){
//        return y;
//    }
//    
//    public double distance(Point p1, Point p2){
//        return Math.sqrt(Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2));
//    }
//    
//}
//
//class Triangle {
//    private Point x, y, z;
//
//    public Triangle(Point x, Point y, Point z) {
//        this.x = x;
//        this.y = y;
//        this.z = z;
//    }
//    
//    public boolean valid(){
//        double a = this.x.distance(x, y);
//        double b = this.x.distance(x, z);
//        double c = this.y.distance(y, z);
//        if(a + b <= c || a + c <= b || b + c <= a){
//            return false;
//        }
//        return true;
//    }
//    
//    public double getPerimeter(){
//        double a = this.x.distance(x, y);
//        double b = this.x.distance(x, z);
//        double c = this.y.distance(y, z);
//        String s = String.format("%.3f", (a + b + c));
//        double ans = Double.parseDouble(s);
//        return ans;
//    }
//    
//}
//
//public class J04019_lopTriangle_1 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        while(t-- >0){
//            Triangle a = new Triangle(Point.nextPoint(sc), Point.nextPoint(sc), Point.nextPoint(sc));
//            if(!a.valid()){
//                System.out.println("INVALID");
//            }
//            else{
//                System.out.println(a.getPerimeter());
//            }
//        }
//    }
//}
