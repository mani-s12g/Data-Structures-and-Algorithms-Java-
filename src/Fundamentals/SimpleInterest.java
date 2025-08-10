//After 1 year, you would earn ₹500 in interest on your ₹10,000 investment at
// a simple interest rate of 5% per year.
//        The calculation is:
//        Interest = Principal × Rate × Time
//        Rate = 5 / 100 = 0.05
//        Interest = ₹10,000 × 0.05 × 1 / 100
//        Interest = ₹500
//        So your total amount after 1 year would be ₹10,500 (your original ₹10,000 plus ₹500 interest).

package Fundamentals;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int principal = s.nextInt();
        int time = s.nextInt();
        int rate = s.nextInt();

        System.out.println(simpleInterestFn(principal, time, rate));
    }

    static int simpleInterestFn(int principal, int time, int rate){
        return (principal * time * rate)/100;
    }
}
