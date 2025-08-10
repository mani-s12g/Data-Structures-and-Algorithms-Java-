package Recursion;

public class PatternsRecursion
{
    public static void main (String[] args) throws java.lang.Exception
    {
        int n = 5, r, c;
//        *
//        * *
//        * * *
//        * * * *
//        * * * * *
//         p2bRecursion(r = n, c = 0);
//         p2aRecursion(n, r = 1, c = 1);
//        * * * * *
//        * * * *
//        * * *
//        * *
//        *
         p3Recursion(r = n, c = 0);
    }
    //pattern 2(method 2) using Recursion
    static void p2bRecursion(int r, int c){
        if(r == 0){
            return;
        }
        if(c < r){
            p2bRecursion(r, c + 1); // *****, ****, ***, **, * -> Last in first out
            System.out.print("* ");
        }else{
            p2bRecursion(r - 1, c = 0);
            System.out.println();
        }
    }

    //pattern 2(method 1) using Recursion
    static void p2aRecursion(int n, int r, int c){
        if(r > n){
            return;
        }
        if(r <= n && c <= r){
            System.out.print("* ");
            p2aRecursion(n, r, c + 1);
        }else{
            System.out.println();
            p2aRecursion(n, r + 1, c = 1);
        }
    }

    //pattern 3 using Recursion
    static void p3Recursion(int r, int c){
        if(r == 0){
            return;
        }
        if(c < r){
            System.out.print("* ");
            p3Recursion(r, c + 1);
        }else{
            System.out.println();
            p3Recursion(r - 1, c = 0);
        }
    }
}

