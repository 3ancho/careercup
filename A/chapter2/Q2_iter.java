class Q2_iter {
    public static void main(String [] args) {
        Node head = new Node(1, new Node(2, new Node(3, new Node(4))));
        Node.print_all(head);
        System.out.println(last(head, Integer.parseInt(args[0])));
    }

    public static int last(Node a, int n) {
        Node start = a, end = a;
        for ( int i = 0; i < n; i++) {
            end = end.next;
        } 

        while (end != null) {
            start = start.next;
            end = end.next;
        }
        return start.data;
    }
}
