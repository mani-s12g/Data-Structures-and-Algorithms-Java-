package Whiles;

public class Armstrong {
    public static void main(String[] args) {
        int num = 153, originalNum = num, sum = 0;
        while(num > 0){
            int digit;
            digit = num % 10;
            sum += digit * digit * digit;
            num /= 10;
        }
        System.out.println(originalNum == sum ? "Armstrong": "Nottt");
    }
}
