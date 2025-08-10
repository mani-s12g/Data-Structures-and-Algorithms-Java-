package Heaps;

import java.lang.reflect.Array;
import java.util.ArrayList;

// Comparable is how we compare 2 objects -> oops videos for generics topics
class Heap<T extends Comparable<T>> {
    private ArrayList<T> list;
    public Heap() {
        list = new ArrayList<>();
    }

    // formulas
    private int parent(int index) {
        return (index - 1) / 2;
    }
    private int left(int index) {
        return 2 * index + 1;
    }
    private int right(int index) {
        return 2 * index + 2;
    }

    // swap
    private void swap(int first, int second) {
        T temp = list.get(first);
        T ele = list.get(second);

        list.set(first, ele);
        list.set(second, temp);
    }
    // insert
    public void insert(T value) {
        list.add(value);
        upHeap(list.size() - 1);
    }
    // upHeap - traverse up the heap tree from down
    private void upHeap(int index) {
        if(index == 0) {
            return;
        }
        int p = parent(index);
        if(list.get(index).compareTo(list.get(p)) < 0) {
            swap(index, p);
            upHeap(p);
        }
    }

    // remove
    public T remove() throws Exception {
        if (list.isEmpty()) {
            throw new Exception("Removing from an empty heap!");
        }
        T firstElement = list.get(0);

        T lastElement = list.remove(list.size() - 1);
        if(!list.isEmpty()) {
            list.set(0, lastElement);
            downHeap(0);
        }

        return firstElement;
    }
    // downHeap - travese down the heap tree from up
    private void downHeap(int fIndex) {
        int min = fIndex;
        int left = left(fIndex);
        int right = right(fIndex);

        if (left < list.size() && list.get(min).compareTo(list.get(left)) > 0) {
            min = left;
        }
        if (right < list.size() && list.get(min).compareTo(list.get(right)) > 0) {
            min = right;
        }
        if (min != fIndex) {
            swap(min, fIndex);
            downHeap(min);
        }
    }

    // Heap Sort
    public ArrayList<T> heapSort() throws Exception {
        ArrayList<T> data = new ArrayList<>();
        while(!list.isEmpty()) {
            data.add(this.remove());
        }
        return data;
    }

}