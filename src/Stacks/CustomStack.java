package Stacks;

public class CustomStack {
    // CustomStack class variables
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    int pointer = -1;

    // CustomStack constructors
    // default
    public CustomStack() {
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size) {
        this.data = new int[size];
    }

    // CustomStack functions
    public boolean push (int item) {
        if (isFull()) {
            System.out.println(" Stack is Full !!");
            return false;
        }
        pointer++;
        data[pointer] = item;
        return true;
    }

    public int pop () throws StackException {
        if (isEmpty()) {
            throw new StackException("Cannot pop from an empty stack!!");
        }
        return data[pointer--];
    }

    public int peek () throws StackException {
        if (isEmpty()) {
            throw new StackException("Cannot peek from an empty stack!!");
        }
        return data[pointer];
    }

    public boolean isFull () {
        return pointer == data.length - 1;  // ptr is at last index
    }

    public boolean isEmpty () {
        return pointer == - 1;
    }
}
