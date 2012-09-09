class Node {
    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    public Node(int data, Node a) {
        this.data = data;
        this.next = a;
    }

    public String toString() {
        return "data is: " + this.data;
    }

    public static void print_all(Node a) {
        Node pre;
        while (true) {
            System.out.println(a);
            if (a.next == null) {
                break;
            }
            pre = a;
            a = a.next;

        }
    }

    public static void clear(Node a) {
        Node cur = a,temp,temp_pre;

        while (cur.next != null) {
            System.out.println(cur.data);
            temp_pre = cur;
            temp = cur.next;
            while (true) {
                System.out.println(cur.data);
                if (temp.data == cur.data) {
                    temp_pre.next = temp.next;
                    temp = temp.next;
                }
                if (temp.next == null) break;
                temp_pre = temp;
                temp = temp.next;
            }

        }
    }
}

