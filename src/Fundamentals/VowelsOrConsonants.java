package Fundamentals;

public class VowelsOrConsonants {
    public static void main(String[] args){
        char ch = 'o';
        ch = Character.toLowerCase(ch);
        System.out.println((ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') ? "Vowel" : "Consonant");

//        optimized code above
        String letter = "e"; // this string type with "" double quotes
//        char letter = 'e'; // this is character with '' single quotes
        char c = letter.toLowerCase().charAt(0);
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
//        System.out.print(isVowelFn(c, vowels));
    }
    static boolean isVowelFn(char c, char[] vowels){
        boolean isVowelValue = false;
        for (int i = 0; i < vowels.length; i++) {
            if(c == vowels[i]){
                isVowelValue = true;
                break;
            }
        }
//        for (char ele: vowels){
//            if(c == ele){
//                isVowelValue = true;
//                break;
//            }
//        }
        return isVowelValue;
    }
}
