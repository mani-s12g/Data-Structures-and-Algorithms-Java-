package Fundamentals;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Take ur best chance: 0: Rock, 1: Paper, 2: Scissors");
        int UsersChoice = s.nextInt();
        int MachinesChoice = random.nextInt(3);

        String[] Choices = {"Rock", "Paper", "Scissors"};

        System.out.println("U have choosen: "+ Choices[UsersChoice]);
        System.out.println("Machine's choosen: "+ Choices[MachinesChoice]);

        if(Choices[UsersChoice] == Choices[MachinesChoice]){
            System.out.println("Its a Tie !");
        } else if (
                (UsersChoice == 0 && MachinesChoice == 2) ||
                (UsersChoice == 1 && MachinesChoice == 0) ||
                (UsersChoice == 2 && MachinesChoice == 1)
        ) {
            System.out.println("U win !");
        }else {
            System.out.println("Machine win !");
        }
    }
}
