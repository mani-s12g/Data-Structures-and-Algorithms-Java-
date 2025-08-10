package Whiles;

import java.util.Scanner;

public class NumTables {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int i = 1;
        if(num > 0){
            while(i <= 10){
                System.out.println(num + " x " + i + " = " + i*num);
                i++;
            }
        }


    }
}
