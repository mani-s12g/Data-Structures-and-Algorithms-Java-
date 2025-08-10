package Whiles;

public class Palindrome {
    public static void main(String[] args) {
        int num = 121, originalNum = num ,rev = 0;
        while(num>0){
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        System.out.println(originalNum == rev ? "Palindrome": "Nottt");
    }
}
