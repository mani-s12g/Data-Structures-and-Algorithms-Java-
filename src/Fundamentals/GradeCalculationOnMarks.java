package Fundamentals;

public class GradeCalculationOnMarks {
    public static void main(String[] args) {
        int marks = 25;
        if (marks >= 90 && marks <=100) System.out.println("A");
        else if (marks >= 80) System.out.println("B");
        else if (marks >= 70) System.out.println("C");
        else if (marks >= 60) System.out.println("D");
        else System.out.println("Fail");

    }
}
