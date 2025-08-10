package Do_Whiles;

import java.util.Scanner;

public class ValidatePassword {
    public static void main(String[] args) {
        String password = "mani123";
//        int passwordNum = 123;
        Scanner s = new Scanner(System.in);
        String p;
//        int pass;
        do{
            System.out.println("Please enter valid password !");
            p = s.next();
//            pass = s.nextInt();
        }while( !p.equals(password));
        System.out.println("Access Granted !!!");
        s.close();
    }
}
