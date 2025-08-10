package Fundamentals;

public class LargestAmoung4 {
    public static void main(String[] args) {
        int num = 12321;
        String s = String.valueOf(num);
        System.out.println(s.charAt(2));
//        info: string conversion above

        int a = 10, b = 20, c = 15, d = 25;
        int max = (a > b) ? (a > c ? (a > d ? a : d) : (c > d ? c : d)) : (b > c ? (b > d ? b : d) : (c > d ? c : d));
        System.out.println("Largest: " + max);

//        int max = a;
//        if(b > max){
//            max = b;
//        }
//        if(c > max){
//            max = c;
//        }
//        if(d > max) {
//            max = d;
//        }
//        System.out.println(max);
    }
}
