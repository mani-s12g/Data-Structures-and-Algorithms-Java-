package Arrays.Fundamentals;

public class SecondLargestSmallestNo {
    public static void main(String[] args) {
        int[] arr = {5, 1, 9, 2, 7, 3};
        int[] arrWithDuplicates = {5, 1, 9, 2, 7, 9, 3, 1};
//        int[] arrWithDuplicates = {9 ,9, 9};

        findSecondLargestSmallest(arr);
        findSecondLargestSmallestSkipDuplicates(arrWithDuplicates);
    }
    static void findSecondLargestSmallest(int[] arr) {
        if(arr.length < 2) {
            System.out.println("Array must have at least 2 elements.");
            return;
        }
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int num: arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }

            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num < secondSmallest && num != smallest) {
                secondSmallest = num;
            }
        }

        System.out.println("Largest number: " + largest);
        System.out.println("Second Largest number: " + secondLargest);
        System.out.println("Smallest number: " + smallest);
        System.out.println("Second Smallest number: " + secondSmallest);
        System.out.println();
    }


        static void findSecondLargestSmallestSkipDuplicates(int[] arr) {
            if (arr.length < 2) {
                System.out.println("Array must have at least 2 distinct elements.");
                return;
            }

            int largest = Integer.MIN_VALUE;
            int secondLargest = Integer.MIN_VALUE;
            int smallest = Integer.MAX_VALUE;
            int secondSmallest = Integer.MAX_VALUE;

            for (int num : arr) {
                // Largest & second largest (skip duplicates)
                if (num > largest) {
                    secondLargest = largest;
                    largest = num;
                } else if (num > secondLargest && num < largest) {
                    secondLargest = num;
                }

                // Smallest & second smallest (skip duplicates)
                if (num < smallest) {
                    secondSmallest = smallest;
                    smallest = num;
                } else if (num < secondSmallest && num > smallest) {
                    secondSmallest = num;
                }
            }

            if (secondLargest == Integer.MIN_VALUE) {
                System.out.println("No second largest (all elements equal).");
            } else if (secondSmallest == Integer.MAX_VALUE) {
                System.out.println("No second smallest (all elements equal).");
            } else {
                System.out.println("Largest: " + largest);
                System.out.println("Second Largest: " + secondLargest);
                System.out.println("Smallest: " + smallest);
                System.out.println("Second Smallest: " + secondSmallest);
            }


}
}
