package Fundamentals;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int year = s.nextInt();
        System.out.println((year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) ? "Leap Year" : "Not Leap Year");
//        optimized code above
//        System.out.print(leapYearFn(year));
    }
    static boolean leapYearFn(int year){
        if(year % 400 == 0){
            return true;
        }
        if ( year % 100 == 0 ) {
            return false;
        }
        if (year % 4 == 0) {
            return true;
        }
        return false;
    }
}
