import java.util.*;
class Q1{
    public static void main(String [] args) {
        ThreeStack a = new ThreeStack();
        System.out.println(a.peak(0));
        System.out.println(a.init_size);
        a.push(0, 1);
        a.push(0, 2);
        a.push(0, 3);
        a.push(0, 3);
        a.push(0, 3);
        a.push(0, 3);
        a.push(0, 3);
        a.push(1, 3);
        a.push(1, 3);
        a.push(1, 3);
        a.push(2, 2);
        a.push(2, 2);

        System.out.println("lens");
        System.out.println(a.stack_len[0]);
        System.out.println(a.stack_len[1]);
        System.out.println(a.stack_len[2]);
        a.pop(0);

        System.out.println("end lens");
        System.out.println(a.stack_len[0]);
        System.out.println(a.stack_len[1]);
        System.out.println(a.stack_len[2]);
         
    }
}

