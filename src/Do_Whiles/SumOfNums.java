package Do_Whiles;

public class SumOfNums {
    public static void main(String[] args) {
        int num = 1, sum = 0;
        do{
            sum += num;
            num++;
        }while(num <= 5);
        System.out.println(sum);
    }
}
