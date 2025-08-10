package BitwiseOperators;

public class CountSetBits {
    public static void main(String[] args) {
        int count = 0, n = 6;
        while (n > 0) {
            int res = n & 1;
            n = n >> 1;
            if (res == 1) {
                count++;
            }
        }
        System.out.println(count);
    }
}
