package Recursion;

public class CountSteps {
    public static void main(String[] args) {
        int n = 8;
        System.out.println(steps(n, 0));
    }
    static int steps(int n, int c){
        if(n == 0){
            return c;
        }
        if(n % 2 == 0){
            c++;
            n = n / 2;
        }else{
            c++;
            n = n - 1;
        }
        return steps(n, c);
    }
}