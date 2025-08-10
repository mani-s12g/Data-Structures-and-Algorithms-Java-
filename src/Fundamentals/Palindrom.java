package Fundamentals;

import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        int num = s.nextInt();
//
//        if(num < 0){
//            System.out.println("Not Palindrome");
//        }
//        int originalNum = num;
//        int reversedNum = 0;

//        while (num > 0){
//            int lastDigit = num % 10;
//            reversedNum = reversedNum * 10 + lastDigit;
//            num = num / 10;
//        }
//        boolean isMatched = reversedNum == originalNum;
//        System.out.println(reversedNum == originalNum);

//        if string is palindrome or not
        String str = s.nextLine();
        String revStr = "";
        for (int i = str.length()-1; i >=0 ; i--) {
            revStr = revStr + str.charAt(i);
        }

        System.out.println(str.toLowerCase().equals(revStr.toLowerCase()));
//        System.out.println(str.toLowerCase() == revStr.toLowerCase());
    }
}
