//6.6

package TNOOP;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap hang cot ma tran thu nhat: ");
        int m=sc.nextInt(),n=sc.nextInt();
        int a[][]=new int[m+1][n+1];
        System.out.println("Thuc hien nhap tung phan tu:");
        for (int i=1;i<=m;i++)
        {
            for (int j=1;j<=n;j++) a[i][j]=sc.nextInt();
        }
        int b[][]=new int[m+1][n+1];
        System.out.println("Thuc hien nhap tung phan tu:");
        for (int i=1;i<=m;i++)
        {
            for (int j=1;j<=n;j++) b[i][j]=sc.nextInt();
        }
        System.out.println("Tong hai ma tran la :");
        for (int i=1;i<=m;i++){
            for (int j=1;j<=n;j++){
                System.out.print(a[i][j]+b[i][j]+" ");
            }
            System.out.println();
        }

    }
}
