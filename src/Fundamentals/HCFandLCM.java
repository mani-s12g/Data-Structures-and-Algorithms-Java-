// HCF (Highest Common Factor) OR GCD (Greatest common divisor)
// LCM (Highest Common Factor)
// LCD (Lowest Common Denominator) - The LCD is a special case of the LCM. It's the
// LCM applied specifically to the denominators of fractions.

package Fundamentals;

public class HCFandLCM {
    public static void main(String[] args) {
        int a = 2, b = 6;
        System.out.println("HCF (Highest Common Factor) of: " +a+" & " +b+ " is "+ HCF(a, b));
        System.out.println("LCM (Largest or Highest Common Factor) of: " +a+" & " +b+ " is "+ a * b / HCF(a, b) );
    }
    static int HCF(int a, int b){
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
