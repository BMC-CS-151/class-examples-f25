public Node rearrangeEvenOdd(LinkedList ll) {
    //traverse 
    //pointers

    Node cur = ll.head.next;
    Node o = cur.next;
    Node firstOdd = o;

    while(cur != null && o != null) {
        cur.next = cur.next.next;
        o.next = o.next.next;

        cur = cur.next;
        o = o.next;
    }

    cur.next = firstOdd;
}

