public class QueueRunner {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);
        queue.enqueue(7);
        queue.enqueue(8);
        queue.dequeue();
        System.out.println("Removed element is: "+queue.dequeue());
        System.out.println("Size of the queue is : "+queue.size());
        if(queue.isEmpty())
        {
            System.out.println("Queue is empty.");
        }
        else 
        {
            System.out.println("Queue is not empty.");
        }
        queue.show();
    }
}
