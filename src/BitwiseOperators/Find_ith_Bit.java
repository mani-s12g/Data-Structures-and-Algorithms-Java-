// Find ith Bit of number

// ex: number n, ith Bit i
// n = 10 -> 1010 (Binary form), i = 2 -> 10 (Binary form)
// so we need to find what is 2nd Bit in number n
// 1010 -> 1 is ans (1010 -> count bits from right to left as 4321)
// 4th bit, 3rd bit, 2nd bit, 1st bit
// 1, 0, 1, 0
// so to get that last 2nd bit we need to AND number with 1 in that position
// for ANDing in that particular position we should rotate 1 to i-1 times left
// so Left Shift 1 ith times then 1 will be at that ith bit position

// Hence when AND we will get ans -> 10 & 2 -> (Internally)1010 & 0010
// result ans = 2 (0010)

package BitwiseOperators;

public class Find_ith_Bit {
    public static void main(String[] args){
        System.out.println(ithBit(10, 1));
    }
    static int ithBit(int n, int i){
//        int f = n & (1 << (i-1));
        int f = n & (1 << i);
//        int r = 1 << (i-1);
//        System.out.println(r);
//        System.out.println(n & r);
//        System.out.println(10 & 8);
        return f;
    }
}
