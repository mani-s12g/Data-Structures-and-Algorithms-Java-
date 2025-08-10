// Patterns
package Recursion;

public class Patterns {
    public static void main(String[] args) {
        int n = 5;
        pattern3a(n);
        // pattern28(n);
        // pattern7(n);
        // pattern5(n);
        // pattern6(n);
        // pattern4(n);
        // pattern3(n);
        // pattern1(n);
        // pattern2(n);
    }
    static void pattern3a(int n){
        for(int row = n; row >= 1; row--){
            for(int col = 0; col < row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // static void pattern28(int n) {
    //     for (int row = 1; row <= n; row++) {
    //         for (int col = 1; col <= n - row; col++) {
    //             System.out.print(" ");
    //         }
    //         for (int col = 1; col <= row; col++) {
    //             System.out.print("* ");
    //         }
    //         System.out.println();
    //     }
    //     for (int row = 1; row <= n; row++) {
    //         for (int col = 1; col <= row; col++) {
    //             System.out.print(" ");
    //         }
    //         for (int col = 1; col <= n - row; col++) {
    //             System.out.print("* ");
    //         }

    //         System.out.println();
    //     }
    // }

    // static void pattern7(int n) {
    //     for (int row = 1; row <= n; row++) {
    //         for (int col = 1; col <= row - 1; col++) {
    //             System.out.print(" ");
    //         }
    //         for (int col = 1; col <= n - row + 1; col++) {
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }

    // static void pattern5(int n) {
    //     for (int row = 1; row <= n; row++) {
    //         for (int col = 1; col <= row; col++) {
    //             System.out.print("* ");
    //         }
    //         System.out.println();
    //     }
    //     for (int row = 1; row <= n; row++) {
    //         for (int col = 1; col <= n - row; col++) {
    //             System.out.print("* ");
    //         }
    //         System.out.println();
    //     }
    // }

    // static void pattern6(int n) {
    //     for (int row = 1; row <= n; row++) {
    //         for (int col = n; col >= row; col--) {
    //             System.out.print(" ");
    //         }
    //         for (int col = n; col >= n - row + 1; col--) {
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }

    // static void pattern4(int n) {
    //     for (int row = 1; row <= n; row++) {
    //         for (int col = 1; col <= row; col++) {
    //             System.out.print(col);
    //         }
    //         System.out.println();
    //     }
    // }

    // static void pattern3(int n) {
    //     for (int row = 1; row <= n; row++) {
    //         for (int col = 1; col <= n - row  + 1; col++) {
    //             System.out.print("* ");
    //         }
    //         System.out.println();
    //     }
    // }

    // static void pattern1(int n) {
    //     for (int row = 1; row <= n; row++) {
    //         for (int col = 1; col <= n; col++) {
    //             System.out.print("* ");
    //         }
    //         System.out.println();
    //     }
    // }

    // static void pattern2(int n) {
    //     for (int row = 1; row <= n; row++) {
    //         for (int col = 1; col <= row; col++) {
    //             System.out.print("* ");
    //         }
    //         System.out.println();
    //     }
    // }
}
