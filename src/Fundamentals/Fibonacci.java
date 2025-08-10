package Fundamentals;

import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
//        int[] fib = {0,1};
        int n = s.nextInt();

        int[] fib = new int[n + 1];
        fib[0] = 0;
        if (n > 1) {
            fib[1] = 1;
        }

        for (int i = 2; i <= n; i++) {
            fib[i] = fib[i-1] + fib[i-2];
        }
        System.out.println(Arrays.toString(fib));
        System.out.println(fib[fib.length - 1]);
    }
}
