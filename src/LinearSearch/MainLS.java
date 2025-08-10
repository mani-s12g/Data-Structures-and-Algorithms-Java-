package LinearSearch;

public class MainLS {
    public static void main (String[] args) {
        int[] nums = {23, 45, 1, 2, 8, 19, -3, 16, -11, 28};
        int target = 19;
//        System.out.println(linearSearch(nums, target));
//        System.out.println(linearSearch2(nums, target));
        System.out.println(linearSearch3(nums, target));
    }

    // search the target and return true or false
    static boolean linearSearch3(int[] arr, int target) {
        // edge case
        if(arr.length == 0) {
            return false;
        }
//        for (int i = 0; i < arr.length; i++)
//            if (target == arr[i]) return true;

        for(int i: arr) {
            if(i == target) return true;
        }
        return false;
    }

    // search the target and return the element
    static int linearSearch2(int[] arr, int target) {
        // edge case
        if(arr.length == 0) {
            return -1;
        }
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i] == target) {
//                return arr[i];
//            }
//        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != target) continue;
            return arr[i];
        }
        return -1;
    }

    // search in the array: return the index if item found
    // otherwise if item not found return -1
    static int linearSearch(int[] arr, int target) {
        // edge case
        if(arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
