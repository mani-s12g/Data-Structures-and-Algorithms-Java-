// Check if number is odd or even using Bitwise Operators

package BitwiseOperators;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(isOdd(n));
//        askIsOdd();
    }
    static boolean isOdd(int n){
        return (n & 1) == 1; // AND with 1 then we will get the last digit
        // and if last digit of that number is 1 then ans is odd else even.
        // ex: 3 -> binary form -> 11 -> & 1 -> got last digit i.e., 1 so
        // 1 is odd
        // ex: 4 -> binary form -> 100 -> & 1 -> got last digit i.e., 0 so
        // 0 means number is even
    }

//    static void askIsOdd(){
//        Scanner s = new Scanner(System.in);
//        do{
//            boolean res = (s.nextInt() & 1) == 1;
//            System.out.println(res);
//        }while(s.nextInt() != 0);
//    }
}
