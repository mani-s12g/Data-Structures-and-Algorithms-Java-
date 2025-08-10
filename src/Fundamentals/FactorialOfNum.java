package Fundamentals;

import java.util.Scanner;

public class FactorialOfNum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        System.out.println(factorialFn(num));
    }
    static int factorialFn(int num){
        int fact = 1;
        for (int i = 2; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
