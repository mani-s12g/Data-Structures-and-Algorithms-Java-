package Do_Whiles;

import java.util.Scanner;

public class MenuDrivenCalculator {
    public static void main(String[] args) {
        int choice;
        Scanner s = new Scanner(System.in);
        do{
            System.out.print("1: Add\n2: Sub\n3: Exit\n");
            choice = s.nextInt();
            if(choice == 1) System.out.println("Addition selected");
            else if (choice == 2) System.out.println("Subtraction selected");
        }while(choice != 3);
        System.out.println("Exited");
    }
}
