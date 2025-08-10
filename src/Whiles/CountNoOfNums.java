package Whiles;

public class CountNoOfNums {
    public static void main(String[] args) {
        int num = 1234, count = 0;
        while(num > 0){
            count++;
            num /= 10;
        }
        System.out.println(count);
    }
}
