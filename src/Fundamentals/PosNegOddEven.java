package Fundamentals;

import java.util.Scanner;

public class PosNegOddEven {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int positive = 0, negative = 0, sumOfOdd = 0, sumOfEven = 0;
        int nums;
        System.out.println("Enter list of numbers to print:" +
                " Sum of Positive numbers; Sum of Negative numbers; Sum of Odd numbers;" +
                " And Sum of Even numbers;");
        do{
            nums = s.nextInt();
            if(nums > 0){
                positive += nums;
                if(nums % 2 == 0){
                    sumOfEven += nums;
                }else {
                    sumOfOdd += nums;
                }
            }else if ( nums < 0){
                negative += nums;
            }
        }while(nums != 0);
        s.close();
        System.out.println("Positive numbers: " + positive);
        System.out.println("Negative numbers: " + negative);
        System.out.println("Odd numbers: " + sumOfOdd);
        System.out.println("Even numbers: " + sumOfEven);
    }
}
