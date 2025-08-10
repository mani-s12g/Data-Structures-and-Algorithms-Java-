package Recursion;

public class ReverseNumberRecursion {
    public static void main(String[] args) {
        int n = 54321;
//        String str = reverseN(n, "");
//        String str = reverseNOpt(n);
//        int ans = Integer.parseInt(str);
//        System.out.println(ans);
//        int ans = reverseNN(n, 0);
//        int len = String.valueOf(n).length();
//        int ans = reverseNPlace(n);
//        System.out.println(ans);
        System.out.println(palindrome(121));
    }
    static String reverseN(int n, String s){
        if(n % 10 == n){
            s += n;
            return s;
        }
        int r = n % 10;
        s += r;
        n /= 10;
        return reverseN(n, s);
    }
    static int reverseNN(int n, int s){
        if(n % 10 == n){
            s = s * 10 + n;
            return s;
        }
        int r = n % 10;
        s = s * 10 + r;
        n /= 10;
        return reverseNN(n, s);
    }
    static int reverseNPlace(int n){
        int nLen = (int) (Math.log10(n)) + 1;
        return helper(n, nLen);
    }
    static int helper(int n, int length){
        if(n % 10 == n) return n;
        int r = n % 10;
        return r * (int) (Math.pow(10, length - 1)) + helper(n / 10, length -1);
    }
    static boolean palindrome(int n){
        return n == reverseNPlace(n);
    }
    static String reverseNOpt(int n){
        if(n % 10 == n){
//            s += n;
            return String.valueOf(n);
        }
//        int r = n % 10;
//        s += r;
//        n /= 10;
        return String.valueOf((n % 10) + reverseNOpt(n / 10));
    }
}
