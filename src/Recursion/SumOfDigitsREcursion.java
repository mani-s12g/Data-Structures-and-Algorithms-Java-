package Recursion;

public class SumOfDigitsREcursion {
    public static void main(String[] args) {
        int n = 1342, sum = 0;
//        int ans = sumOfDigits(n, sum);
        int ans = sumOfDigits1(n);
        System.out.println(ans);
    }
    static int sumOfDigits(int n, int s){
        // if(n == 1){
        if(n < 10){
            s += n;
            return s;
        }
        int r = n % 10;
        s += r;
        n /= 10;
        return sumOfDigits(n, s);
    }
    // More optimized solution
    static int sumOfDigits1(int n){
//        if(n == 0){
        if(n % 10 == n){
            return n;
        }
        return (n % 10) + sumOfDigits1(n / 10);
    }
}
