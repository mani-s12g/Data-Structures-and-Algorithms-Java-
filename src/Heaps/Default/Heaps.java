
// PriorityQueue -> By default is min Heap
// Following is default implementations of Heaps
//What is Collections.reverseOrder()?
//This method returns a Comparator that reverses the natural ordering of elements.
//
//By default, PriorityQueue in Java is a Min Heap (i.e., smallest element has the highest priority).
//
//To make it behave like a Max Heap, we provide a custom comparator that sorts elements in descending order.

package Heaps.Default;

import java.util.Collections;
import java.util.PriorityQueue;

public class Heaps {
    public static void main(String[] args) {
        minHeap();
        System.out.println();
        maxHeap();
    }

    static void minHeap() {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        minHeap.add(40);
        minHeap.add(30);
        minHeap.add(10);

        while (!minHeap.isEmpty()) {
            System.out.println(minHeap.poll());
        }
    }
    static void maxHeap() {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        maxHeap.add(40);
        maxHeap.add(30);
        maxHeap.add(10);

        while (!maxHeap.isEmpty()) {
            System.out.println(maxHeap.poll());
        }
    }
}
