// variable length arguments

package Miscellanous;

import java.util.Arrays;

public class VariableLengthArgs {
    public static void main(String[] args) {
        // when we don't know how many arguments are there?
        // then we can use ...v ( variable length arguments )
//        fun(1, 2, 3, 4, 5, 6, 7, 8);

        // we can pass int at start and some vla at end like below
//        fun1(1, 2, 3, 4, 5, 6, 7, 8);

        // passing vla as middle argument here
//        fun2(a, ...v, b);

        // multiple arguments
        multiple(2, 3, "mani", "kunal", "fdkjfgfegegf");
    }
    static void fun(int ...v){
        // internally it is taking as array of integers
        System.out.println(Arrays.toString(v));
    }

    static void fun1(int a, int ...v){
        // internally it is taking as array of integers
        System.out.println(a);
        System.out.println(Arrays.toString(v));
    }

//    static void fun2(int a, int ...v, int b){
        // Shows Error: Vararg parameter must be the last in the list
        // variable length arguments must always be in last.
        // If vla is in middle, then java will be like when is vla is starting and when is it ending?
        // & when is 'a' starting and ending? & when is 'b' integers starting and ending?
        // java will be confused here.. so vla should be taken as last parameter in fn, &
        // should be given as last argument while passing to fn
//        System.out.println(a);
//        System.out.println(Arrays.toString(v));
//    }

    static void multiple(int a, int b, String ...v) {
        System.out.println(a);
        System.out.println(b);
        System.out.println(Arrays.toString(v));
    }
}
