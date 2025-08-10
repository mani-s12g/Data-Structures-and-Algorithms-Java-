package Fundamentals;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
//        int num = 4;
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();

        System.out.println(oddOrEvenFn(num));
    }
    static boolean oddOrEvenFn(int num){
//        if(num % 2 == 0){
//            return true;
//        }else{
//            return false;
//        }

//        above code can be written as following shortcut
        return num % 2 == 0;
    }
}
