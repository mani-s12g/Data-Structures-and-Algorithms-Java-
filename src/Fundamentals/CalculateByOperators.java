package Fundamentals;

// IMPORTANT POINTS ( 1 & 0 DIVISION RULES)

// 0 / anything = 0
// anything / 0 = cannot divide by zero

// 1 / anything = something
// anything / 1 = anything

import java.util.Scanner;

public class CalculateByOperators {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        String operator = s.next();

        char op = '+';
        int a = 10, b = 5;
        switch (op) {
            case '+': System.out.println(a + b); break;
            case '-': System.out.println(a - b); break;
            case '*': System.out.println(a * b); break;
            case '/': System.out.println(b != 0 ? a / b : "Division by Zero Error"); break;
            default: System.out.println("Invalid Operator");
        }
//        Optimized solution above

        if(operator.equals("+")){
            System.out.println(num1 + num2);
        } else if (operator.equals("-")) {
            System.out.println(num1 - num2);
        } else if (operator.equals("*")) {
            System.out.println(num1 * num2);
        }else{
            System.out.println(num1 / num2);
        }
    }
}
