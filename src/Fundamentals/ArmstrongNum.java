package Fundamentals;

import java.util.Scanner;

public class ArmstrongNum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();

//        System.out.println(armstrongFn(num));
        System.out.println(customArmstrong(num));
//        To display armstrong values in certain range
//        for (int i = 11; i < num; i++) {
//            if(armstrongFn(i) == true) {
//                System.out.print(i+" ");
//            }
//            shortcut
//            System.out.print((armstrongFn(i) == true) ? i+" ": "");
//        }

    }

    static boolean armstrongFn(int num){
        boolean isArmstrong = false;
        if(num < 0){
            System.out.println("Not Armstrong");
        }else{
//            check for particular numbers if armstrong or not
            int originalNum = num;
            int sum = 0;
            int numberOfDigits = String.valueOf(num).length();

            while(num > 0){
                int digit = num % 10;
//                sum += digit * digit * digit;
                sum += Math.pow(digit, numberOfDigits);
                num = num / 10;
            }
            isArmstrong = sum == originalNum;

        }
        return isArmstrong;
    }

    static int digits = 0;
    static boolean customArmstrong(int num) {
        int originalNum = num;
        int sum = 0;
        if(num < 0){
            System.out.println("Not Armstrong");
        }else {
            digits = noOfDigits(num);
            while (num > 0) {
                int rem = num % 10;
                sum += getPower(rem);
                num /= 10;
            }
        }
//        System.out.println(sum + ": sum");
        return sum == originalNum;
    }

    static int noOfDigits(int num) {
        int count = 0;
        while (num > 0) {
            int rem = num % 10;
            count++;
            num /= 10;
        }
//        System.out.println(count + ": count");
        return count;
    }

    static int getPower(int rem) {
        int res = 1;
        for (int i = 1; i <= digits; i++) {
            res *= rem;
        }
//        System.out.println(res + ": res");
        return res;
    }
}
