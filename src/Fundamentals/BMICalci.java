package Fundamentals;

public class BMICalci {
    public static void main(String[] args) {
        double weight = 53; // in kg
        double height = 1.67; // in meters

        double bmi = weight / (height * height);

        System.out.printf("BMI: %.2f - ", bmi);

        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi < 25) {
            System.out.println("Normal weight");
        } else if (bmi < 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }
}
