package Fundamentals;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String name = s.next();
        System.out.println(GreetingFn(name));
    }
    static String GreetingFn(String name){
        return "Hello " + name;
    }

}
