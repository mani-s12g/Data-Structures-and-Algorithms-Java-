package Fundamentals;

public class SearchInString {
    public static void main(String[] args) {
        String str = "Mani";
        char target = 'a';
        System.out.print(ReturnIndexOfChar(str, target));
    }
    static int ReturnIndexOfChar(String str, char target){
        for (int i = 0; i < str.length(); i++) {
             return str.indexOf(target);
//            if(str.charAt(i) == target) return i;
        }
        return -1;
    }
}
