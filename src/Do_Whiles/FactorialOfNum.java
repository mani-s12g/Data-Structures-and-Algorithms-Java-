package Do_Whiles;

import java.util.Scanner;

public class FactorialOfNum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt(), fact = 1;
        do{
            fact *= num;
            num--;
        }while(num >= 1);
        System.out.println(fact);

    }
}
