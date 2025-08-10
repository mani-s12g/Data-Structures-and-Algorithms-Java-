// log n -> Time complexity

package BitwiseOperators;

public class MagicNumber {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(magicNumber(n));
    }
    static int magicNumber(int n){
        // kunal's method
//        int base = 5, ans = 0, count = 0;
//        while(n > 0){
//            int last = n & 1;
//            n = n >> 1;
//            ans += last * base;
//            base = base * 5;
//            count++; // here we can count no of digits in number -> n
//        }
//        System.out.println(count);
//        return ans;

        // i did following
//        int sum = 0, count = 0;
//        while(n > 0){
//            int v = 0;
//            v = (n & 1);
//            count++;
//            double power = Math.pow(5, count);
//            sum += v * power;
//            n = n >> 1;
//        }
//        return sum;
        int base = 5, sum = 0;
        while (n > 0){
            int g = n & 1;
            n = n >> 1;
            sum += g * base;
            base = base * 5;
        }
        return sum;
    }
}
