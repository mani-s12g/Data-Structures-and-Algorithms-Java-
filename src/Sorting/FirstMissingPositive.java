package Sorting;

public class FirstMissingPositive {
    public static void main(String[] args) {
//        int[] arr = {1,2,0};
//        int[] arr = {3,4,1,2};
        int[] arr = {3,4,-1,1};
//        int[] arr = {7,8,9,11,12};
        System.out.println(FindMissingNumber(arr));
    }

    static int FindMissingNumber(int[] arr){
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if(arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correct]){
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            }else{
                i++;
            }
        }
        for(int j = 0; j < arr.length; j++){
            if(arr[j] != j + 1){
                return j + 1;
            }
        }
        return arr.length + 1;
    }
}
