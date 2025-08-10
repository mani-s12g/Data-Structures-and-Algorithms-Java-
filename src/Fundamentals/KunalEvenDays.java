package Fundamentals;

public class KunalEvenDays {
    public static void main(String[] args) {
        int totalDays = 31; // August has 31 days
        int count = 0;

        for (int day = 1; day <= totalDays; day++) {
            if (day % 2 == 0) {
                count++; // even day, Kunal can go out
            }
        }

        System.out.println("Kunal can go out on " + count + " days in August.");

//        Optimzed or other method using for loop above

//        int month = 8;
//        System.out.println(AllowedDays(month));
    }

    // taking month as parameter but not doing anything with month. Better follow above optim code
//    static int AllowedDays(int month){
//        int num = 2, count = 0;
//        while(num <= 31){
//            num += 2;
//            count++;
//        }
//        return count;
//    }

}
