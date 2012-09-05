// 15 Write a method to replace all spaces in a string with ‘%20’
class Q5 {
    public static void main(String [] args) {
        if (args[0].equals("hard")) {
            hard(args[1]);
        }
        else if (args[0].equals("hard")) {
            soft(args[1]);
        }

    }

    public static void hard(String a) {
        int count = 0;
        int len = a.length();
        for (int i=0; i < len; i++) {
            if (a.charAt(i) == ' ') {
                count++;
            }
        } 

        char [] result = new char[len + count * 2];
        int j=0;
        for (int i=0; i < len; i++) {
            if (a.charAt(i) != ' ') {
                result[j++] = a.charAt(i);
            }
            else {
                result[j++] = '%';
                result[j++] = '2';
                result[j++] = '0';
            }
        }
        System.out.println(result);    
    }
}
