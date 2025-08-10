// Get the answer for 3^6 with optimal time complexity
// Time: o(log(n)) -> here o(log(b))


package BitwiseOperators;

public class Calculate_aPOWb {
    public static void main(String[] args){
        int n = 4;
        int a = 2;
        // a^b
        System.out.println(GetaPOWb(a, n)); // here we get 3^6 = 729
//        System.out.println(tryPow(a, n)); // here we get 3^6 = 729
        // instead of doing -> 3*3*3*3*3*3, 3*3, 6 times, we are doing
        // 1     1     0(ignore 0)
        // 3^4 * 3^2 * 3^0(ignore 3^0)
        // 3^4 * 3^2 = 729

    }
    static int GetaPOWb(int a, int n){
        int ans = 1, base = a;
        while(n > 0){
            int last = n & 1;
            n = n >> 1;
            if(last == 1) {
                ans = ans * base;
            }
            base = base * base;
        }
        return ans;
    }

    static int tryPow(int a, int n) {
        int ans = 1;
        System.out.println(n >> 1);
        while(n > 0) {
            ans = ans * a;
            n--;
        }
        return ans;
    }
}
