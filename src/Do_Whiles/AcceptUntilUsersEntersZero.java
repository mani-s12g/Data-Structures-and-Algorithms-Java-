package Do_Whiles;

import java.util.Scanner;

public class AcceptUntilUsersEntersZero {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int num;
        do{
            System.out.print("Enter the number: ");
            num = s.nextInt();
        }while (num != 0);
        System.out.println("Exited");


//        do{
//            System.out.print("Enter the number: ");
//            s.nextInt();
//        }while(s.nextInt() != 0);
//        s.close();
//        System.out.print("Exited..");
    }
}
