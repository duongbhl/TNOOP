//6.4

package TNOOP;

import java.util.Scanner;

public class DayYearMonth {
    public static int check(int year){
        if(year%400==0) return 1;
        else return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the month: ");
        String month = sc.nextLine();
        System.out.print("Enter the year: ");
        int year = sc.nextInt();
        if(month.contains("Jan")||month.contains("Mar")||month.contains("May")||month.contains("Jul")||month.contains("Aug")||month.contains("Oct")||month.contains("Nov")||month.contains("Dec")) System.out.println(31);
        else if(month.contains("Feb")){
            if(check(year)==1) System.out.println(29);
            else System.out.println(28);
        }
        else if (month.contains("Apr")||month.contains("Jun")||month.contains("Sep")||month.contains("Nov"))
        {
            System.out.println(30);
        }
        else if(month.equals("1")||month.equals("3")||month.equals("5")||month.equals("7")||month.equals("8")||month.equals("10")||month.equals("12")) System.out.println(31);
        else if(month.equals(2)){
            if(check(year)==1) System.out.println(29);
            else System.out.println(28);
        }
        else System.out.println(30);



    }
}
