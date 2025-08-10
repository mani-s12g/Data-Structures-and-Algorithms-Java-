package LinearSearch;

public class FindMin {
    public static void main(String[] args) {
        int[] arr = {2, 18, 12, 7, 3, 14, 28};
        System.out.println(min(arr));
    }

    static int min(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i: arr) {
            if(i < min) min = i;
        }
        return min;
    }
}
