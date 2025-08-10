package BitwiseOperators;

public class NumberOfDigits {
    public static void main(String[] args) {
//        int n = 32546;
        int n = 6;
//         Formula -> (int)(log base 2 6) + 1;
//        int base = 10; // base = 10, i.e., decimal(commonly used)
        int base = 2; // base = 2, i.e., binary
        int ans = (int) (Math.log(n) / Math.log(base)) + 1;
        System.out.println(ans);
    }
}
