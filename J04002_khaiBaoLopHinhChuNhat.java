package codejavaptit;

import java.util.*;

class Rectangle{
    private double length, width;
    private String color;

    public Rectangle(double length, double width, String color) {
        this.length = length;
        this.width = width;
        this.color = color;
    }

    public Rectangle() {
        this.width = 1;
        this.length = 1;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color.substring(0, 1).toUpperCase() + color.substring(1).toLowerCase();
    }
    
    public double findPerimeter(){
        return (this.length + this.width) * 2;
    }
    
    public double findArea(){
        return this.length * this.width;
    }
    
    @Override
    public String toString() {
        return String.format("%d %d %s", (int)findPerimeter(), (int)findArea(), getColor());
    }
}

public class J04002_khaiBaoLopHinhChuNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        String s = sc.next();
        Rectangle r = new Rectangle(a, b, s);
        if(a > 0 && b > 0){
            System.out.println(r.toString());
        }
        else{
            System.out.println("INVALID");
        }
    }
}
