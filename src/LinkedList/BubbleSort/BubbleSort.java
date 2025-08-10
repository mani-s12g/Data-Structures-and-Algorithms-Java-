//package LinkedList.BubbleSort;
//
//public class BubbleSort {
//    public static void main(String[] args) {
//        bubbleSortLL(size - 1, 0);
//    }
//
//    public void bubbleSortLL(int row, int col) {
//
//        if(r == 0) {
//            return;
//        }
////        Node head = node;
////        Node first = head;
////        Node second = head.next;
//
//        if(col < row) {
//            Node first = get(col);
//            Node second = get(col + 1);
//
//            if (first.value > second.value) {
//                // case 1 - If first == head
//                if (first == head) {
//                    head = second;
//                    first.next = second.next;
//                    second.next = first;
//                } else if (second == tail) {
//                    Node previous = get(col - 1);
//                    previous.next = second;
//                    tail = first;
//                    first.next = null;
//                    second.next = first;
//                } else {
//                    Node previous = get(col - 1);
//                    previous.next = second;
//                    first.next = second.next;
//                    second.next = first;
//                }
//            }
//            bubbleSortLL(node, r, c + 1);
//        } else {
//            bubbleSortLL(node, r - 1, 0);
//        }
//    }
//
//    // Reverse the Linked List
//    public void reverseLLUsingRecursion(Node node) {
//        if(node == tail) {
//            head = tail;
//            return;
//        }
//
//        reverseLL(node.next);
//        tail.next = node;
//        tail = node;
//        tail.next = null;
//    }
//
//    // Reverse Linked List using Iteration or In Place Reversal LL
//    public Node node reverseLLUsingIteration() {
//        Node head = node;
//        Node first = head;
//        Node last = head;
//
//        while (last != null) {
//            last = last.next;
//        }
//
//        while (first != last) {
//            first.value = last.value;
//            last.value = first.value;
//            first = first.next;
//            last = last.next;
//        }
//        return node;
//    }
//
//    // Reverse Linnked List In - Place Reversal
//    public void reverseLLInPlace() {
//        Node head = node;
//        Node prev = null;
//        Node pres = head;
//        Node next = head.next;
//
//        while (pres != null) {
//            pres.next = prev;
//            prev = pres;
//            pres = next;
//            next = next.next; // check for null pointer exception
//        }
//        head = prev;
//    }
//}
