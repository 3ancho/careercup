import java.util.Hashtable;
import java.util.Arrays;
import java.util.ArrayList;

class Q2 {
    public static void main(String [] args) {
        String a = new String("abcde\n");
        System.out.println(a);
        StringBuffer b = new StringBuffer();
        for (int i = 0; i < a.length() - 1; i++) {
            b.insert(0, a.charAt(i));
        } 
        b.append("\n");
        System.out.println(b);


    }
}
