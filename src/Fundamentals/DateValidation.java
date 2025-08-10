package Fundamentals;

public class DateValidation {
    public static void main(String[] args) {
        int day = 12, month = 2, year = 2024;

        boolean isLeap = (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));
        System.out.println(isLeap);

        boolean valid = false;
        if (month == 2) valid = (isLeap ? day <= 29 : day <= 28);
        else if (month == 4 || month == 6 || month == 9 || month == 11) valid = day <= 30;
        else if (month >= 1 && month <= 12) valid = day <= 31;
        System.out.println(valid ? "Valid Date" : "Invalid Date");
//          Optimized code above
//        System.out.print(validateDateFn(day, month, year));
    }

    static boolean validateDateFn(int day, int month, int year){
        int maxDays = 31;
        boolean isValid = true;

        if(month < 1 || month > 12){
            isValid = false;
            return isValid;
        }else{
            if(month == 2){
                boolean isLeapYear = false;
                if((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)){
                    isLeapYear = true;
                }else {
                    isLeapYear = false;
                }
                maxDays = isLeapYear ? 29: 28;

            } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                maxDays = 30;
            }

            if(day < 0 || day > maxDays){
                isValid = false;
                return isValid;
            }
        }
        return isValid;
    }
}