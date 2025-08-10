package LinearSearch;

public class EvenDigits {
    public static void main(String[] args) {
       int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }
    static int findNumbers(int[] nums) {
        int evenDigits = 0;
        for (int i: nums) {
            if(totalDigits2(i) % 2 == 0) {
                evenDigits++;
            }
//            if(totalDigits(i) % 2 == 0) {
//                evenDigits++;
//            }
//            if(String.valueOf(i).length() % 2 == 0) evenDigits++;
        }
        return evenDigits;
    }

    static int totalDigits(int num) {
        // if num = negative numbers
        if (num < 0) {
            num = num * -1;
        }

        // if num == 0
        if (num == 0) {
            return 1;
        }

        int total = 0;
        while (num > 0) {
//            int digit = num % 10; // this line not required, just counting digits right
            total++; // here count it
            num /= 10; // here reduce one by one numbers in num
        }
        return total;
    }

    static int totalDigits2(int num) {
        if (num < 0) {
            // num = -5 , then -5 * -1 = 5 (positive number) so using this
            num = num * -1;
        }
        return (int)(Math.log10(num)) + 1;
    }
}
