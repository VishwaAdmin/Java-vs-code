public class LLRunner {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.insert(6);
        list.insertAtStart(76);
        list.insertAt(3, 45);
        list.deleteAt(3);
        list.deleteAt(0);

        System.out.println("LinkedList elements are :");
        list.show();    
    }
}
