package Arrays.Fundamentals;

public class AcsOrDesc {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {5, 4, 3, 2, 1};
        int[] arr3 = {1, 3, 2, 4, 5};

        System.out.println(checkSorted(arr1)); // ASCENDING
        System.out.println(checkSorted(arr2)); // DESCENDING
        System.out.println(checkSorted(arr3)); // UNSORTED
    }
    public static String checkSorted(int[] arr) {
        boolean ascending = true;
        boolean descending = true;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                descending = false;
            } else if (arr[i] > arr[i + 1]) {
                ascending = false;
            }
        }

        if (ascending) return "ASCENDING";
        if (descending) return "DESCENDING";
        return "UNSORTED";
    }
}
