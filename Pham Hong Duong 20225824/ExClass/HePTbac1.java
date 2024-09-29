package TNOOP;

import java.util.Scanner;

public class HePTbac1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap lan luot a11 a12 a21 a22 b1 b2 lan luot theo cu phap");
        double a11=sc.nextByte(),a12=sc.nextByte(),a21=sc.nextByte(),a22=sc.nextByte(),b1=sc.nextByte(),b2=sc.nextByte();
        double d=a11*a22-a21*a12;
        if(d==0){
            if(a21/a11==b2/b1) System.out.println("HEPT vo so nghiem");
            else System.out.println("HEPT vo  nghiem");
        }
        else{
            double d1=b1*a22-b2*a12,d2=a11*b2-a21*b1;
            System.out.println("x1= "+d1/d+" x2= "+d2/d);


        }

    }
}
