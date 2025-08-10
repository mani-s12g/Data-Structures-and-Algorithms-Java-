package Fundamentals;

public class CurrencyConverter {
    public static void main(String[] args) {
        double amountInRupees = 10000.0;
        double exchangeRate = 83.0;  // 83 rupees = 1 USD (example rate)

        double amountInDollars = amountInRupees / exchangeRate;

        System.out.println(amountInRupees + " INR = " + amountInDollars + " USD");

//        and usd to inr is usd * inr exchange rate = inr
    }
}
