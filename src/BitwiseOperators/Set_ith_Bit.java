// Set ith Bit

// if its 0 -> 1,
// else if 1 -> 1

package BitwiseOperators;

public class Set_ith_Bit {
    public static void main(String[] args){
        System.out.println(setIthBit(10, 2));
    }
    static int setIthBit(int n, int i){
        return n | (1 << i);
    }
}
