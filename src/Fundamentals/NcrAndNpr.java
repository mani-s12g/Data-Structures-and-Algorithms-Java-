package Fundamentals;

import java.util.Scanner;

public class NcrAndNpr {
    public static void main(String[] args) {
//        start time = 9: 42 - endtime = 55
        Scanner s = new Scanner(System.in);

        System.out.print("Enter number of books: ");
        int n = s.nextInt();

        System.out.print("Enter number of ways you want to choose books: ");
        int r = s.nextInt();

//        n! / r! * (n-r)!
        System.out.println("Ncr of choosen ways (Combinations): " + ncr(n, r));
        System.out.println("Npr of choosen ways (Permutations): " + npr(n, r));
    }
    static int ncr(int n, int r){
        int nFact = factorial(n);
        int rFact = factorial(r);
        int bothFact = factorial(n-r);

        return nFact / (rFact * bothFact);
    }

    static int npr(int n, int r){
        int nFact = factorial(n);
        int rFact = factorial(r);
        int bothFact = factorial(n-r);

        return nFact / bothFact;
    }

    static int factorial(int num){
        int fact = 1;

        while (num >= 1){
            fact *= num;
            num--;
        }
        return fact;
    }
}


//Area | Which Used?
//Lottery, teams, groups | nCr
//Passwords, arrangements, seating orders | nPr