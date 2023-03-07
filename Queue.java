public class Queue {
    int queue[] = new int[5];
    int size;
    int front;
    int rear;

    public void enqueue(int data)
    {
        queue[rear] = data;
        rear = (rear+1)%5;
        size++;
    }
    public int dequeue()
    {
        int data;
        data = queue[front];
        front = (front+1)%5;
        size--;
        return data;
    }
    public int size()
    {
        return size;
    }
    public boolean isEmpty()
    {
        return size()<=0;
    }
    public void show()
    {
        for(int i=0;i<size;i++)
        {
            System.out.println(queue[(front+i)%5]+" ");
        }
        System.out.println();
        for(int n : queue)
        {
            System.out.println(n+" ");
        }
    }
}