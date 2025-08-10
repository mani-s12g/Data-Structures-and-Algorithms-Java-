package Fundamentals;

public class CharacterCheckerOrClassify {
    public static void main(String[] args) {
        char ch = '3';
//        if (Character.isLetter(ch)) System.out.println("Alphabet"); // Character.isLetter()
//        else if (Character.isDigit(ch)) System.out.println("Digit"); // Character.isDigit()
//        else System.out.println("Special Character");
//        Optimized code above

        if( (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') ){
            System.out.println("Its an Alphabet !");
        } else if (ch >= '0') {
            System.out.println("Its an Integer !");
        }else{
            System.out.println("Its Special Character !");
        }

    }

}
