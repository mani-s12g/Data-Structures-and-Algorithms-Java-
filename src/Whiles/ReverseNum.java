package Whiles;

public class ReverseNum {
    public static void main(String[] args) {
        int num = 12345;
        int rev = 0;
//        String reversed = "";
        while(num > 0){
//            reversed += num % 10;
//            int rem;
//            rem = num % 10;
//            reversed += rem;
            rev = rev * 10 + num % 10;
            num /= 10;
        }
//        System.out.println(reversed);
        System.out.println(rev);
    }
}
