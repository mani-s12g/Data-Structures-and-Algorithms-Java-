package Fundamentals;

public class CheckIsValidTriangle {
    public static void main(String[] args) {
        int a = 60, b = 60, c = 60;
//        System.out.println((a + b + c == 180 && a > 0 && b > 0 && c > 0) ? "Valid Triangle" : "Invalid Triangle");

//        Other method
//        int a = 7, b = 10, c = 5;
//        System.out.println((a+b > c) && (a+c > b) && (b+c > a) ? "Valid Triangle": "Invalid Triangle");

        // https://mathmonks.com/wp-content/uploads/2020/03/Types-of-Triangles.jpg
        // Based on Sides (Triangle)

        // this is not triangle
        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("Invalid triangle");
        } else if (a + b <= c || a + c <= b || b + c <= a) { // Something figure but not triangle
            System.out.println("Not a triangle");
        } else if (a == b && b == c) {
            // All sides equal
            System.out.println("Equilateral triangle");
        } else if (a == b || b == c || a == c) {
            // Any Two sides are equal
            System.out.println("Isosceles triangle");
        } else {
            // No sides equal
            System.out.println("Scalene triangle");
        }
    }
}
