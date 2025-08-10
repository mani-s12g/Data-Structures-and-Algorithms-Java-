package BitwiseOperators;

public class LettCode338 {
    public static void main (String[] args) {
        String a = "11"; String b = "1";
        StringBuilder res = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        while(i >= 0 || j >= 0){
            int sum = carry;
            if(i >= 0) sum += a.charAt(i--) - '0';
            if(j >= 0) sum += b.charAt(j--) - '0';
            carry = sum > 1 ? 1 : 0;
            res.append(sum % 2);
        }
        if(carry != 0) res.append(carry);
        System.out.println(res);
        System.out.println(res.reverse());
        // ❌ INEFFICIENT - Creates many temporary String objects
        String result = "";
        for (int k = 0; k < 108; k++) {
            result = result + k + " ";  // Creates new String object EVERY iteration
        }
        System.out.println(result);
// This creates 1000+ temporary String objects!
        //  10: 09
//        int n1 = Integer.parseInt(a, 2);
//        int n2 = Integer.parseInt(b, 2);
//        int base = 2;
//        int sum = 0;
//        int sum1 = 0;
//        sum = getSum(n1);
////        System.out.println(sum);
//
//        sum1 = getSum(n2);
////        System.out.println(sum1);
//
//        int finalSum = sum + sum1;
////        System.out.println(finalSum);
//
//        String finalBinary = "";
//        finalBinary = getBinary(finalSum);
////        System.out.println(finalBinary);
//
//        String reversed1 = new StringBuilder(finalBinary).reverse().toString();
//
//        System.out.println(reversed1);
//        char oo = 0;
//        oo = '5'-'2';
//        System.out.println(oo);
    }

    static int getSum(int n){
        int base = 1, s =  0;
        while(n > 0){
            int last = n & 1;
            s += last * base;
            base = base * 2;
            n = n >> 1;
        }
        return s;
    }
    static String getBinary(int sum){
        int base = 2;
        String str = "";
        while(sum > 0){
            int rem = sum % base;
            str += rem;
            sum /= base;
        }
         if(sum == 1){
            str += sum;
         }
        return str;
    }
}
