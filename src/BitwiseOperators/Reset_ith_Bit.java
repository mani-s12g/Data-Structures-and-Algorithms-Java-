package BitwiseOperators;

public class Reset_ith_Bit {
    public static void main(String[] args){
        System.out.println(resetIthBit(10, 3));
    }
    static int resetIthBit(int n, int i){
        return n & ~(1 << i);
    }
}
