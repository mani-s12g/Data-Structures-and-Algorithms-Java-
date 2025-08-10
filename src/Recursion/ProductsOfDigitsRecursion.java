package Recursion;

public class ProductsOfDigitsRecursion {
    public static void main(String[] args) {
        int n = 25;
        int ans = productOfDigits(n);
        System.out.println(ans);
    }
    static int productOfDigits(int n){
        if(n%10 == n){
            return n;
        }
        return (n % 10) * productOfDigits(n / 10);
    }
}
