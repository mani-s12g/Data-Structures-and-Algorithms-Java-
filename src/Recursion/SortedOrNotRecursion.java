package Recursion;

public class SortedOrNotRecursion {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
// 		System.out.println(isSorted(arr, 0));
        System.out.println(recursionIsSorted(arr, 0));
    }

    static boolean recursionIsSorted(int[] arr, int idx){
        if(idx == arr.length - 1){
            return true;
        }
        return arr[idx] < arr[idx + 1] && recursionIsSorted(arr, idx + 1);
    }
// 	static boolean isSorted(int[] arr){
// 	    int i = 0;
// 	    while(i < arr.length - 1){
// 	        if(arr[i] > arr[i + 1]){
// 	            return false;
// 	        }
// 	        i++;
// 	    }
// 	    return true;
// 	}
// 	static boolean isSorted(int[] arr){
// 	    for(int i = 0; i < arr.length - 1; i++){
// 	        if(arr[i] > arr[i + 1]){
// 	            return false;
// 	        }
// 	    }
// 	    return true;
// 	}
}
