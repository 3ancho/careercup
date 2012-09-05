import java.util.*;
class Q3 {
    public static void main(String [] args) {
        String a = " " + args[0];

        char [] array = a.toCharArray();
        int start = 0, end = 0;

        for (int i=1; i< array.length; i++) {
            boolean new_e = true;
            for (int j=start; j < end; j++) {
                if (array[j] == array[i] ) {
                    System.out.println(i);
                    new_e = false;
                }
            } 
            if (new_e && end != array.length -1)
                array[end++] = array[i];
        }
        System.out.println(end);
        a = new String(array);
        String b = a.substring(0, end);
        System.out.println(b);
    }
}
