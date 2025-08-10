package Miscellanous;

public class Shadowing {
    static int x = 90;
    public static void main(String[] args) {
        System.out.println(x);
        int x = 1;  // when declared and initialized same variable "x" as class variable "x"
        // class variable "x" is now shadowed by this
//        int x; // Error: java: variable x might not have been initialized
        // Shadowing will work only if we declare & initialize variable
        // (should be same variable as class variable)
        // Will not work if only declared & not initialized. (will show error)
//        System.out.println(x);

        fun();
    }
    static void fun(){
        System.out.println(x);  // will print 90 only here as it is class variable so
    }
}
