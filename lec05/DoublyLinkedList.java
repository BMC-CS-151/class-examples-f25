public class DoublyLinkedList<T> {

    private Node head;
    private Node tail; //NOTICE TAIL

    public DoublyLinkedList() {
        head = new Node();
        tail = new Node();

        head.next = tail; //In an empty linked list, head and tail point to eachother
        tail.prev = head;
    }

    private class Node<T> {

        public T data;
        public Node next;
        public Node prev;

        public Node() {
            this.next = null;
            this.prev = null;
        }

        public Node(T data) {
            this.data = data;
        }
    }

    //TODO 2: copy over and fix insertHead 
    public void insertHead(T data) {
        // new: fix prev and tail accordingly
        //// 1. Create new node
        Node n = new Node(data);
        // 2. update the pointers on the new node
        n.next = head.next;
        n.prev = head;
        // 3. update the head to point to the new node
        head.next.prev = n;
        head.next = n;
    }


    //TODO 3: copy over and fix insertTail 
    public void insertTail(T data) {
        // 1. create a new node
        Node n = new Node(data);
        // 2. find the last node
        Node last  = tail.prev;
        //update links on the new node first
        n.next = tail;
        n.prev = last;
       //update links in the LL 
       last.next = n;
       tail.prev = n;
    }
}
