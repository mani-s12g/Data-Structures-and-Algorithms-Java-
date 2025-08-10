package LinkedList;

public class LL {
    // LL variables
    private Node head;
    private Node tail;
    private int size;
    public LL () {
        this.size = 0;
    }

    // Node class of LL
    private class Node {
        private int value;
        private Node next;

        public Node (int value) {
            this.value = value;
        }
        public Node (int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    // LL functions
    public void insertFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }
        size += 1;
    }

    public void insertLast(int value) {
        if(tail == null){
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size ++;
    }

    public void insert(int value, int index) {
        if(index == 0){
            insertFirst(value);
            return;
        }
        if(index == size){
            insertLast(value);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(value, temp.next);
        temp.next = node;
        size ++;
    }

    public int deleteFirst() {
        int val = head.value;
        head = head.next;
        if(head == null){  // if we only have 1 element, then head points to null so
            tail = null;
        }
        size --;
        return val;
    }

    public int deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }

        Node secondLast = get(size - 2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        size--;
        return val;
    }

    public Node find(int value) {
        Node node = head;
        while (node != null) {
            if (node.value == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public Node get(int index) {
        Node node = head;
        for (int i = 1; i <= index ; i++) {
            node = node.next;
        }
        return node;
    }

    // display function
    public void display(){
        if(head == null){
            System.out.print("LL is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
}
