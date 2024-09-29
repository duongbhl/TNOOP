package TNOOP;

import java.util.Scanner;

public class PtBac1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a=sc.nextByte(),b=sc.nextByte();
        if(a==0){
            if(b==0) System.out.println("PT vo so nghiem");
            else System.out.println("PT vo nghiem");
        }
        else System.out.println("Nghiem cua pt la:"+-b/a);
    }
}
