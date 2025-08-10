package Fundamentals;

public class NumMultipleOf3 {
    public static void main(String[] args) {
        int num = 21;
        System.out.println((num%3 == 0 && num%7 == 0)? "Multiple of 3 and 7" : "Not Multiple" );
    }
}
