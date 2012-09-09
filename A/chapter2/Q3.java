class Q3 {
    public static void main(String [] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        Node c = new Node(3, new Node(4, new Node(5)));
        head.next.next = c;

        Node.print_all(head);
        remove(c);
        Node.print_all(head);
    }
    public static void remove(Node c){
        Node cur = c;
        Node pre = c;
        while (cur.next != null) {
            cur.data = cur.next.data;
            pre = cur;
            cur = cur.next;  

        }
        pre.next = null;
    }

}
