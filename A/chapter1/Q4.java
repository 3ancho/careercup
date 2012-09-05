class Q4 {
    public static void main(String [] args) {
        char [] a = args[0].toCharArray();
        char [] b = args[1].toCharArray();
        int aa = 0, bb = 0;

        // if length not equal quit
        for (int i=0; i < a.length; i++) {
            aa += (int)a[i];
            bb += (int)b[i];
        }

        System.out.println(aa == bb);
        System.out.println(aa);
        System.out.println(bb);
    }
}
