package TNOOP;

import java.util.Scanner;

import static java.lang.Math.*;

public class PTbac2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a=sc.nextByte(),b=sc.nextByte(),c=sc.nextByte();
        if(a==0){
            if(b==0){
                if(c==0) System.out.println("PT vo so nghiem");
                else System.out.println("PT vo nghiem");
            }
            else{
                double tmp=-c/b;
                if(tmp==0) System.out.println("PT co 1 nghiem = 0");
                else System.out.println("PT co 1 nghiem = "+tmp);
            }
        }
        else{
            double d=b*b-4*a*c;
            if(d>0){
                System.out.println("x1 = "+((-b-sqrt(d))/(2*a))+" x2 = "+((-b+sqrt(d))/(2*a)));
            }
            else if(d==0) System.out.println(-b/(2*a));
            else System.out.println("PT vo nghiem");

        }
    }
}
