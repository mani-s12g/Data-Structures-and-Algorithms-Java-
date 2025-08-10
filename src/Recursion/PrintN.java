package Recursion;

public class PrintN {
    public static void main(String[] args) {
        int n = 5;
//        printN(n);
//        printRevN(n);
//        printBothN(n);
        concept(n);
    }
    static void printN(int n){
        if(n == 0){
            return;
        }
//        if(n == 1){
//            System.out.println(n);
//            return;
//        }
        System.out.println(n);
        printN(n - 1);
    }
    static void printRevN(int n){
        if(n == 0){
            return;
        }
        printRevN(n - 1);
        System.out.println(n);
    }
    static void printBothN(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        printBothN(n - 1);
        System.out.println(n);
    }
    static void concept(int n){
        if(n == 0)
            return;
        System.out.println(n);
//        concept(n--); // will give error: stackoverflow error
        // bcoz here first it will pass n to fn then do minus
        // every time here n = 5, 5 is only passed, so it prints 5 each time
        // at last due to out of memory it gives stackoverflow error
        concept(--n); // instead use --n, here it does minus first then pass to fn
        // 4, 3, 2, 1
    }
}
