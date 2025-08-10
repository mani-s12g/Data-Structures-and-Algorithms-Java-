package BitwiseOperators;

public class LeetCode67 {
    public static void main(String[] args) {
        String a = "1010"; String b = "1011";
        int n1 = Integer.parseInt(a);
        int n2 = Integer.parseInt(b);
        int shifts1 = 0;
        int shifts2 = 0;

        int length = 4;
        int ans1 = 0;
        int ans2 = 0;
        shifts1 = length - a.length();
        // System.out.println(shifts1);
        if(shifts1 > 0){
            ans1 = shifting(shifts1, n1);
        }else{
            ans1 = noShifting(n1);
        }

        shifts2 = length - b.length();
        if(shifts2 > 0){
            ans2 = shifting(shifts2, n2);
        }else{
            ans2 = noShifting(n2);
        }

        // System.out.println(shifts2);

        // int ans2 = shifting(shifts2, n2);

        // System.out.println(ans1);
        // System.out.println(ans2);

        int main = ans1 + ans2;
        int binary = 2;
        String sum = "";
        while(main != 1){
            sum += main % binary;
            main = main / binary;
        }
        sum += main;

        String reversed = new StringBuilder(sum).reverse().toString();
        System.out.println(reversed);
    }
    static int shifting(int shifts, int n){
        int base = 1, ans = 0;
        while(shifts > 0){
            int digit = n & 1;
            n = n >> 1;
            ans += digit * base;
            base = base * 2;
            shifts--;
        }
        return ans;
    }
    static int noShifting(int n){
        System.out.println(n);
        int base = 1, ans = 0;
        while(n > 0){
            int digit = n & 1;
            n = n >> 1;
            ans += digit * base;
            base = base * 2;
//            n--;
        }
        System.out.println(ans);
        return ans;
    }

}
