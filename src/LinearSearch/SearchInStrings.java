package LinearSearch;

public class SearchInStrings {
    public static void main(String[] args) {
        String name = "Kunal";
        char target = 'a';
//        System.out.println(isPresent(name, target));
//        System.out.println(isPresent2(name, target));
        System.out.println(isPresent3(name, target));
    }
    static boolean isPresent(String name, char target) {
        if(name.length() == 0) return false;
//        if(name.indexOf(target) != -1) {
//            return true;
//        }
        return name.indexOf(target) != -1;
    }

    static boolean isPresent2(String str, char target) {
        if(str.length() == 0) return false;
        for (int i = 0; i < str.length(); i++) {
            if(target == str.charAt(i)) return true;
        }
        return false;
    }

    static boolean isPresent3(String str, char target) {
        if(str.length() == 0) return false;
        for (char ch: str.toCharArray()) {
            if(target == ch) return true;
        }
        return false;
    }
}
