package Do_Whiles;

public class SumOfEvenOddNums {
    public static void main(String[] args) {
        int num = 1, sum = 0;
//        If num = 1, then its sum of all odd numbers
//        If num = 2, then its sum of all even numbers
        do{
            sum += num;
            num += 2;
        }while (num <= 10);
        System.out.print(sum + " ");
    }
}
