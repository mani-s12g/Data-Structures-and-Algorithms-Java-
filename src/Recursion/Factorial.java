package Recursion;

public class Factorial {
    public static void main(String[] args) {
        int n = 0;
        int ans = FactN(n);
        System.out.println(ans);
    }
    static int FactN(int n){
//        if(n < 2)
//        if(n == 1)

        // f(0) = 1 & f(1) = 1 so return 1 only
        if(n <= 1)
            return 1;
        return n * FactN(n-1);
    }
}
