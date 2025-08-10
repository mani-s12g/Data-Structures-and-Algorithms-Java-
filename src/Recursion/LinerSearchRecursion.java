package Recursion;

import java.util.ArrayList;

public class LinerSearchRecursion {
    public static void main(String[] args) {
        int[] arr = {11, 42, 42, 23, 77};
        int target = 42;
// 		System.out.println(linerSearch(arr, target));
// 		System.out.println(LSrecursion(arr, target, 0));
// 		System.out.println(isLSrecursion(arr, target, 0));
// 		System.out.println(ReverseLSrecursion(arr, target, arr.length - 1));
// 		ArrayList<Integer> ans = LSFindAllrecursion(arr, target, 0);
// 		int[] drr = new int[ans.size()];
// 	    for(int i = 0; i < ans.size(); i++){
// 	       drr[i] = ans.get(i);
// 	    }
// 		System.out.println(Arrays.toString(drr));

        // LSFindAllrecursion2(arr, target, 0);
        // System.out.println(list);

        // System.out.println(LSFindAllrecursion3(arr, target, 0 , new ArrayList<>()));

        System.out.println(conceptLSFindAllRecursion(arr, target, 0));
    }

    // 	static int linerSearch(int[] arr, int target){
// 	    for(int i = 0; i < arr.length; i++){
// 	        if(arr[i] == target){
// 	            return arr[i];
// 	        }
// 	    }
// 	    return -1;
// 	}

    // return boolen to check if target is matched using LS using recursion
//     static boolean isLSrecursion(int[] arr, int target, int idx){
// 	    if(idx == arr.length){
// 	        return false;
// 	    }
// 	    return arr[idx] == target || isLSrecursion(arr, target, idx + 1);
// 	}

    // Liner Search using recursion
// 	static int LSrecursion(int[] arr, int target, int idx){
// 	    if(idx == arr.length){
// 	        return -1; // not found so return -1 to fn call where it was called
// 	    }
// 	    if(arr[idx] != target){
// 	        return LSrecursion(arr, target, idx + 1); // here returns -1 if target not found
// 	    }else {
// 	        return idx;
// 	    }
// 	}

    // Reverse Liner search using recursion
//     static int ReverseLSrecursion(int[] arr, int target, int idx){
// 	    if(idx == -1){
// 	        return -1;
// 	    }
// 	    if(arr[idx] != target){
// 	        return ReverseLSrecursion(arr, target, idx - 1);
// 	    }else {
// 	        return idx;
// 	    }
// 	}

    // Liner Search using recursion (Find all indices)
    static ArrayList<Integer> list = new ArrayList<>();
// 	static ArrayList<Integer> LSFindAllrecursion(int[] arr, int target, int idx){
// 	   // int[] drr = new int[list.size()];
// 	    if(idx == arr.length){
// 	       return list;
// 	    }
// 	    if(arr[idx] != target){
// 	        return LSFindAllrecursion(arr, target, idx + 1);
// 	    }else {
// 	        list.add(idx);
// 	        return LSFindAllrecursion(arr, target, idx + 1);
// 	    }
// 	}

// 	static ArrayList<Integer> LSFindAllrecursion2(int[] arr, int target, int idx){
// 	    if(idx == arr.length){
// 	       return list;
// 	    }
// 	    if(arr[idx] == target){
// 	        list.add(idx);
// 	    }
// 	    return LSFindAllrecursion2(arr, target, idx + 1);
// 	}


//     static ArrayList<Integer> LSFindAllrecursion3(int[] arr, int target, int idx, ArrayList<Integer> listArr){
// 	    if(idx == arr.length){
// 	       return listArr;
// 	    }
// 	    if(arr[idx] == target){
// 	        listArr.add(idx);
// 	    }
// 	    return LSFindAllrecursion3(arr, target, idx + 1, listArr);
// 	}

//     static ArrayList<Integer> LSFindAllrecursion3(int[] arr, int target, int idx, ArrayList<Integer> listArr){
// 	    if(idx == arr.length){
// 	       return listArr;
// 	    }
// 	    if(arr[idx] == target){
// 	        listArr.add(idx);
// 	    }
// 	    return LSFindAllrecursion3(arr, target, idx + 1, listArr);
// 	}

    static ArrayList<Integer> conceptLSFindAllRecursion(int[] arr, int target, int idx){
        ArrayList<Integer> conceptList = new ArrayList<>();
        if(idx == arr.length){
            return conceptList;
        }
        if(arr[idx] == target){
            conceptList.add(idx);
        }
        ArrayList<Integer> checkListHere = conceptLSFindAllRecursion(arr, target, idx + 1);
        conceptList.addAll(checkListHere);
        return conceptList;
    }
}
