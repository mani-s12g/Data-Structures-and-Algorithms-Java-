package Fundamentals;

public class LargestAmoung3 {
    public static void main(String[] args) {
        int a = 210, b = 209, c = 211;
        System.out.println( (a>b)? (a>c? a: c): (b>c?b:c) );
        // above code optimized using ternary operators of below elaborated code using if else
//        int largest;
//        if(a>b){
//            if(a>c){
//                largest = a;
//            }else{
//                largest = c;
//            }
//        }else{
//            if(b>c){
//                largest = b;
//            }else{
//                largest = c;
//            }
//        }
//        System.out.println(largest);

        // below we assuming max starting only
        int max = a;
        if(b > max){
            max = b;
        }
        if(c>max){
            max = c;
        }
        System.out.println(max);
    }
}
