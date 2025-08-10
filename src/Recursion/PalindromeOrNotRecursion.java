package Recursion;

public class PalindromeOrNotRecursion {
    public static void main(String[] args) {
        int n = 121;
        System.out.println(palindromeOrNot(n));
    }
    static boolean palindromeOrNot(int n){
        int nLen = (int) Math.log10(n) + 1;
        return n == helper(n, nLen);
    }
    static int helper(int n, int length){
        if(n % 10 == n) return n;
        int r = n % 10;
        return r * (int)(Math.pow(10, length - 1)) + helper(n / 10, length - 1);
    }

}
