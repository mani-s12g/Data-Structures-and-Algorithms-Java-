package Do_Whiles;

public class SumOfOddDigitsInNums {
    public static void main(String[] args) {
        int num = 12345, sum = 0;
        do{
            int rem = num % 10;
            if(rem % 2 != 0) {
                sum += rem;
            }
            num /= 10;
        }while(num > 0);
        System.out.println(sum);
    }
}
