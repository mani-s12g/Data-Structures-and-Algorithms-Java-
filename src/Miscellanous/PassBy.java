// Following describes:
// Pass by value & Pass by the copy of the value of the reference

// Pass by value:
    // for primitives like int, float, double etc

// Pass by the copy of the value of the reference
    // for non primitives or for data types of Object and References

package Miscellanous;

import java.util.Arrays;

public class PassBy {
    public static void main(String[] args) {
        String str = "mani";
        // Pass by the copy of the value of the reference
//        pass(str);
        // after fn call str here will remain same in o/p, doesn't change str even if we are trying to change it in fn below
//        System.out.println(str); //  str value doesn't change bcoz String cannot be modified in java (String are immutable in java)

        int a = 10;
        int b = 20;
        // Pass by value (passing only values of a & b, not references of a & b)
//        pass1(a, b);
//        System.out.println(a);
//        System.out.println(b);

        //  Pass by the copy of the value of the reference
        int[] arr = {10, 20, 30, 40};
        pass2(arr);
        // here the result is changed to [99, 20, 30, 40]
        // bcoz we have passed copy of value of reference here. References of array will be pointing to same Object so when we changed value in fn it also changed it value in original array as well.
        System.out.println(Arrays.toString(arr));

    }
    static void pass(String modifyStr) {
        // here trying to modify or change str to something else, but cannot change and
        // ended up creating new object of string as "change mani", to which modifyStr is pointing
        // creating new object "change mani" to which modifyStr reference is pointing
        modifyStr = "change mani";
        System.out.println(modifyStr);
    }

    static void pass1(int changeA, int changeB) {
        // creating new object 200 to which changeA is pointing & 300 to which changeB is pointing
        changeA = 200;
        changeB = 500;
    }

    static void pass2(int[] nums) {
        nums[0] = 99;
    }
}
