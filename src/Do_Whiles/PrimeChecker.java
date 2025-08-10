package Do_Whiles;

public class PrimeChecker {
    public static void main(String[] args) {
        int num = 5, i = 2; boolean res;
        do{
            if(num % i == 0){
                res = false;
                break;
            }else{
                res = true;
            }
//            res = num % i == 0 ? false: true;
            i++;
        }while(i < num);
        System.out.println(res);
    }
}
