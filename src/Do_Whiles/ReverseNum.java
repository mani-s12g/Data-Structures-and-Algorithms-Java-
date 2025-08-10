package Do_Whiles;

public class ReverseNum {
    public static void main(String[] args) {
         int num = 12345, rev = 0;
         do{
            rev = rev * 10 + num % 10;
            num /= 10;
         }while(num > 0);
        System.out.println(rev);
    }
}
