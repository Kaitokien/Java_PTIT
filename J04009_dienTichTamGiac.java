package codejavaptit;

import java.util.*;

class point{
    private double x, y;

    public point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public double distance(point secondPoint){
        return Math.sqrt((this.x - secondPoint.x) * (this.x - secondPoint.x) + (this.y - secondPoint.y) * (this.y - secondPoint.y));
    }
    
    
}

public class J04009_dienTichTamGiac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            point[] arr = new point[3];
            for(int i = 0; i < 3; i++){
                double a = sc.nextDouble();
                double b = sc.nextDouble();
                arr[i] = new point(a, b);
            }
            double canh_1 = arr[0].distance(arr[1]);
            double canh_2 = arr[1].distance(arr[2]);
            double canh_3 = arr[0].distance(arr[2]);
            if(canh_1 + canh_2 > canh_3 && canh_1 + canh_3 > canh_2 && canh_3 + canh_2 > canh_1){
                double S = 1 / 4f * Math.sqrt((canh_1 + canh_2 + canh_3) * (canh_1 + canh_2 - canh_3) * (canh_1 - canh_2 + canh_3) * (-canh_1 + canh_2 + canh_3));
                double R = canh_1 * canh_2 * canh_3 / (4 * S);
                double ans = Math.PI * R * R;
                System.out.printf("%.3f\n", ans);
            }
            else{
                System.out.println("INVALID");
            }
        }
    }
}
