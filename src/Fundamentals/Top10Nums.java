package Fundamentals;

import java.util.Scanner;

public class Top10Nums {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int sum = 0;
//        int num = s.nextInt();
        int num = 1;
        while(num <= 10){
            System.out.println(num);
//            sum += num;
            num += 1;
        }
        s.close();
    }
}
