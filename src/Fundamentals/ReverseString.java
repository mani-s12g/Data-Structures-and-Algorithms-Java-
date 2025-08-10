package Fundamentals;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String revString = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            revString += str.charAt(i);
        }
        System.out.print(revString);
    }
}
