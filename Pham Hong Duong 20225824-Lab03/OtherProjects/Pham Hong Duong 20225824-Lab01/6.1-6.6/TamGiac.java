//6.

package TNOOP;

import java.util.Scanner;

public class TamGiac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        String []a=new String[n];
        a[0]="*";
        String []b=new String[n];
        b[n-1]="";
        for (int i=1;i<n;i++){
            a[i]=a[i-1]+"**";
            b[n-i-1]=b[n-i]+" ";
        }
        for (int i=0;i<n;i++){
            a[i]=b[i]+a[i];
            System.out.println(a[i]);
        }


    }
}
