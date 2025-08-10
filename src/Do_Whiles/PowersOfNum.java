package Do_Whiles;

public class PowersOfNum {
    public static void main(String[] args) {
        int num = 2, i = 1, pow = 1;
        do{
//            System.out.println((int)Math.pow(2, i));
//            Optimized using in build library functions
            pow = num * i;
            System.out.print(pow + " ");
            i++;
        }while (i <= 5);
    }
}
