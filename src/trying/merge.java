package trying;

import java.util.Arrays;

public class merge
{
    public static void main (String[] args)
    {
        int[] arr = {5, 2, 1, 4, 3};
        int[] ans = mergeSort(arr);
        System.out.println(Arrays.toString(ans));
    }

    static int[] mergeSort(int[] arr){
        if(arr.length == 1){
            return arr;
        }
        int m = arr.length / 2;

        int left[] = mergeSort(Arrays.copyOfRange(arr, 0, m));
        int right[] = mergeSort(Arrays.copyOfRange(arr, m, arr.length));

        return merge(left, right);
    }
    static int[] merge(int[] first, int[] second){
        int i = 0, j = 0, k = 0;
        int[] mix = new int[first.length + second.length];

        while (i < first.length && j < second.length){
            if(first[i] > second[j]){
                mix[k] = second[j];
                j++;
            }else{
                mix[k] = first[i];
                i++;
            }
            k++;
        }

        while(i < first.length){
            mix[k] = first[i];
            i++;
            k++;
        }
        while(j < second.length){
            mix[k] = second[j];
            j++;
            k++;
        }

        return mix;
    }
}

