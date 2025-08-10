package Recursion;

public class CountZeros {
    public static void main(String[] args) {
        int n = 20400;
        System.out.println(zeros(n, 0));
    }
    static int zeros(int n, int c){
        if(n == 0){
            return c;
        }
        if(n % 10 == 0){
            c++;
        }
        return zeros(n / 10, c);
    }
}
