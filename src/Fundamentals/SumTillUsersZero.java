package Fundamentals;

import java.util.Scanner;

public class SumTillUsersZero {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int sum = 0;
        int num;
        do{
            num = s.nextInt();
//            sum of all
//            sum += num;
//            largest of all
            sum = Math.max(sum, num);
        }while(num != 0);
        System.out.print(sum +" sum");
        s.close();
    }
}
