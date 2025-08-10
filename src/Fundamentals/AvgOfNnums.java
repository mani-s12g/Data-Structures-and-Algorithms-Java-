package Fundamentals;

public class AvgOfNnums {
    public static void main(String[] args) {
        int num = 5;
        int sum = 0;
        int avg;
        for(int i = 0; i <= num; i++){
            sum += i;
        }
        avg = sum / num;
        System.out.println(avg);
    }
}
