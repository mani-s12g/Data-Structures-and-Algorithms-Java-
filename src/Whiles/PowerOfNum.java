package Whiles;

public class PowerOfNum {
    public static void main(String[] args) {
        int a = 2, b = 5, res = 1;
        while(b >= 1){
            res *= a;
            b--;
        }
        System.out.println(res);
    }
}
