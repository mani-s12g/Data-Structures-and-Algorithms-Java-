package Fundamentals;

import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int num1 = s.nextInt();
        int num2 = s.nextInt();

        if(num1 > num2){
            System.out.println(num1);
        }else{
            System.out.println(num2);
        }
    }
}
