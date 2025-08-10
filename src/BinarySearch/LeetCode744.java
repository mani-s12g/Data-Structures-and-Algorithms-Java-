//744. Find Smallest Letter Greater Than Target
//https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/

package BinarySearch;

public class LeetCode744 {
    public static void main(String[] args){
        char[] letters = {'c','f','j'};
        char target = 'f';
        System.out.println(smallestLetterGreaterTarget(letters, target));
    }

    static char smallestLetterGreaterTarget(char[] letters, char target){
        int start = 0;
        int end = letters.length - 1;

        while (start <= end){
            int mid = start + (end - start)/2;
            if ( letters[mid] > target ){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        // here taking start bcoz
        // smallest character greater than target so
        // if smallest character lesser than target then we can use end
        // bcoz at the end of loop start exceeds end always so start will be
        // greater than end (so start here we can use)
        return letters[start % letters.length];
        // using %(modulo) bcoz here in question if target not found then
        // we should return 1st element so (index of last start was there %
        // length of array will give us 0th index only)

        // And if not start = 1 and array length = 3 then 1%3 will give
        // remainder 1 only so.
    }
}
