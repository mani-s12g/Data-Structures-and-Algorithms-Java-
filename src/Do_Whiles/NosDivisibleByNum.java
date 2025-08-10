package Do_Whiles;

public class NosDivisibleByNum {
    public static void main(String[] args) {
        int num = 5; int i = 1;
        // below 3*1 = 3 tables result print
//        do {
//            System.out.println(num * i);
//            i++;
//        } while (i <= 10);

        do{
            System.out.println(num);
            num += 3;
        }while(num <= 30);
//        Optimized solution above

//        do{
//            int ans = 0;
//            if(num % 3 == 0){
//                ans = num;
//            System.out.println(ans);
//            }
//            num++;
//        }while(num <= 30);
    }
}
