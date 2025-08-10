package Do_Whiles;

public class CountVowelsInString {
    public static void main(String[] args) {
        String str = "manikanta", caseStr = str.toLowerCase();

        int i = 0, count = 0;
        do {
            char ch = str.charAt(i);
            if ("aeiou".indexOf(ch) != -1) count++;
            i++;
        } while (i < str.length());
        System.out.println("Vowels: " + count);

//        Optimized code above using built-in library functions

//        int count = 0, len = str.length()-1;
//
//        do{
//            char c = caseStr.charAt(len);
//            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
//                count = count + 1;
//            }
//            len--;
//        }while(len >= 1);
//        System.out.print(count);
    }
}
