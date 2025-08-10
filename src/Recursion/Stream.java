package Recursion;

public class Stream {
    public static void main(String[] args) {
//        System.out.println(skip("baccad", ""));

        // processed & unprocessed method
//        processed_unprocessed("", "baccad");

        System.out.println(skip("baccad"));
//        System.out.println(skipApple("bdapplefg"));
//        System.out.println(skipAppNotApple("bdapplfg"));
    }

    // Processed & Unprocessed Method
    static void processed_unprocessed(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);  // Processed answer...
            return;
        }
        char ch = up.charAt(0);

        if(ch == 'a'){
            processed_unprocessed(p, up.substring(1));
        }else{
            processed_unprocessed(p + ch, up.substring(1));
        }
    }

//    static String skip(String str, String ans){
//        if(str.isEmpty()){
//            return ans;
//        }
//        if(str.charAt(0) == 'a'){
//            return skip(str.substring(1), ans);
//        }else{
//            ans += str.charAt(0);
//            return skip(str.substring(1), ans);
//        }
//    }



    static String skip(String up) {
        if (up.isEmpty()) {
            return "";
        }
        char ch = up.charAt(0);

        if (ch == 'a') {
            return skip(up.substring(1));
        }else {
            return ch + skip(up.substring(1));
        }
    }

    static String skipApple(String up) {
        if(up.isEmpty()) {
            return "";
        }
        if(up.startsWith("apple")){
            return skipApple(up.substring(5));
        }else {
            return up.charAt(0) + skipApple(up.substring(1));
        }
    }

    static String skipAppNotApple(String up) {
        if(up.isEmpty()) {
            return "";
        }
        if(up.startsWith("app") && !up.startsWith("apple")){
            return skipAppNotApple(up.substring(3));
        }else {
            return up.charAt(0) + skipAppNotApple(up.substring(1));
        }
    }

}
