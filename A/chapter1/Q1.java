import java.util.Hashtable;
import java.util.Arrays;
import java.util.ArrayList;

class Q1 {
    public static void main(String [] args) {
        if (args.length < 1) {
            System.out.println("need on argument");
        }

        System.out.println(Arrays.toString(args));

        
        System.out.println("type " + args.getClass());
        System.out.println("args 1 type " + args[0].getClass());
        System.out.println("args 1 " + args[0]);


        ArrayList<Character> list = new ArrayList<Character>();

        String string = new String(); 
        if (args[0] != null) {
            string = args[0];
        }
        else {
            string = "123";
        }


        for (int i=0; i < string.length(); i++) {
            System.out.println(string.charAt(i));
            if (list.indexOf(string.charAt(i)) == -1) {
                list.add(string.charAt(i));
            }
            else {
                System.out.println("not unique!");
                return;
            }
        }

        if (list.size() == string.length()) {
            System.out.println("unique!");
        }
        System.out.println(list.toString());



        char a = 'A';
        int b = a;
        float c = a;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
    //public static void print(
}
