package Queues;

public class Main {
    public static void main(String[] args) throws Exception{
//        CustomQueue q = new CustomQueue();
        CircularQueue q = new DynamicQueue(5);
        q.insert(43);
        q.insert(3);
        q.insert(62);
        q.insert(24);
        q.insert(19);
        q.insert(192);

//        q.display();
//        System.out.println(q.isFull());
//        System.out.println(q.isEmpty());

//        q.remove();
//        q.display();

        q.insert(99);
        q.display();

//        System.out.println(q.front());

    }
}
