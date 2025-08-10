// Normal Function Call Working
// Play debugger and Observe the Call Stack
// 1st: main() function is called, then print1() fn,
// print2, print3, print4, print5 and then calls end.

// All fn's will be in stack until other fn;s finishes there call

// Each fn called, they will print there respective results in console,
// Last fn print5() will not call any fn, only prints 5 on console and returns to
// where it was called i.e., print4() fn,
// print4() fn it also returns to where it was called i.e., print3() fn,
// print3() to  print2(),
// print2() to print1(),
// print1() to main() fn
// main() fn also ends then.(Program ends)
// (All these fn's will be removed from stack one by one)
// Stack will be now Empty.

// O/P will be 1 2 3 4 5

package Recursion;

public class FuntionCallStackWorking {
    public static void main(String[] args) {
        print1(1);
    }
    static void print1(int n){
        System.out.println(n);
        print2(2);
    }
    static void print2(int n){
        System.out.println(n);
        print3(3);
    }
    static void print3(int n){
        System.out.println(n);
        print4(4);
    }
    static void print4(int n){
        System.out.println(n);
        print5(5);
    }
    // Till now all above fn's had same i/p parameter and body
    // Now last fn here down only has print statement it doesn't call any fn
    static void print5(int n){
        System.out.println(n);
    }
}
