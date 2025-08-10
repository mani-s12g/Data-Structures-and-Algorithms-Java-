// Now what is Recursion ?
// A fn that calls itself is called Recursion

// Here we are calling the same fn again and again until it hits the base case.
// fn has same body through out flow.

// Base case: How to end the fn & come out of fn -> End fn point -> Condition to end
// base case is that when n == 5, just print that last number and return from there.
// return to where it was called previously, later and every calls returns to
// where it was called then at last it will return to parent (1st fn call)
// where we called this fn first time i.e., main() fn


package Recursion;

public class FnCallUsingRecursion {
    public static void main(String[] args) {
        printn(1);
    }
    static void printn(int n) {
        // Without the below base case program will go and keep on printing no's,
        // will end with Error: of StackOverflow.
        //Exception in thread "main" java.lang.StackOverflowError
        if (n == 5){ // This is base case(End point of fn hits here)
            System.out.println(5);
            return; // returns to where it was being called
        }
        System.out.println(n);
        // This is last statement in fn call,
        printn(n + 1);
        /* when we have last statement in fn call it is known as Tail Recursion */
    }
}
