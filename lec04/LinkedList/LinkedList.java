public class LinkedList<T> {

  private Node head;

    //TODO: Constructor 
    public LinkedList() {
        this.head = new Node();
    }

  private class Node<T> {
    public T data;
    public Node next;

    public Node() {
      this.data = null;
      this.next = null;
    }

    public Node(T data) {
      this.data = data;
    }
  }

  public Node find(T data) {
    //start at the head and loop until 
    // (a) you hit the tail (node.next == null) OR
    // (b) you find the element (current node.data.equals(data))
      Node cur = head;
      while ( cur.next != null ) {
        cur = cur.next;
        //stop if we find the element
        if (cur.data.equals(data)) {
            return cur;
        }
      }
      return null;
  }

  public void insertHead(T data) {
    // 1. Create new node
    Node n = new Node(data);
    // 2. have new node next point to first element
    n.next = head.next;
    // 3. update the head to point to the new node
    head.next = n;
  }

  public void insertTail(T data) {
    // 1. create a new node
    Node n = new Node(data);
    // 2. find the last node
    Node last = head;
    while (last.next != null) {
        last = last.next;
    }
    // 3. make the last node point to newest
    last.next = n;
  }


  public void print() {
    Node currNode = head.next;

    while (currNode != null) {
      System.out.print(currNode.data + " -> ");
      currNode = currNode.next;
    }
    System.out.println();
  }

  public static void main(String[] args) {
    LinkedList<Integer> list = new LinkedList<>();
    list.print();

    list.insertTail(0);
    list.print();
    list.insertTail(1);
    list.print();
    list.insertHead(2);
    list.print();
  }

}
