package Recursion;

public class FiboRecursion {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(FibonacciNo(n));
    }
    static int FibonacciNo(int n){
        if(n < 2)
            return n;
        return FibonacciNo(n - 1) + FibonacciNo(n - 2);
        // FibonacciNo(n - 1) or FibonacciNo(n - 2) is not the last statement,
        // return FibonacciNo(n - 1) + FibonacciNo(n - 2) is the last statement

        // In this whole fn, FibonacciNo(n - 1) fn called, then FibonacciNo(n - 2)
        // fn is called, then FibonacciNo(n - 1) will have its answer stored in it,
        // when FibonacciNo(n - 2) fn call is finished then FibonacciNo(n - 1) and FibonacciNo(n - 2)
        // both results are added together and returned.
        // This extra step of addition and returning is not Tail Recursion
    }
}
