package Whiles;

import java.util.Scanner;

public class FactorialOfNum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();

        int fact=1;
        while(num >= 1){
            fact*=num;
            num--;
        }
        System.out.println(fact);
//        Above i am taking num and decreasing it, and multiplying with declared 1 integer fact

//        int fact = 1;
//        int i = 1;
//        while (i <= num){
//            fact *= i;
//            i++;
//        }
//        System.out.println(fact);
    }
}
