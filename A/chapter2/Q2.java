class Q2 {
    public static Node result;
    public static int count = -1;

    public static void main(String [] args) {
        Node head = new Node(1, new Node(2, new Node(3, new Node(4))));
        Node.print_all(head);
        last(head, Integer.parseInt(args[0]));
        System.out.println("The result data is " + result.data);
    }

    public static int last(Node a, int n) {
        if (a == null) {
            return 1;
        }
        int temp = last(a.next, n);
        if (temp == n) {
            System.out.println("got result");
            result = a; 
        }
        return temp + 1;
    }

}
