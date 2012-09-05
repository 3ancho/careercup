class Q6 {
    public static void main(String [] args) {
        int m = Integer.parseInt(args[0]);
        // create
        int [][] a = new int[m][m];
        int index = 1, temp;

        for (int i=0; i<m; i++) {
            for (int j=0; j<m; j++) {
                a[i][j] = index++;
            }
        }
        print(a);

        for (int i=0; i<m; i++) {
            for (int j=i; j<m; j++) {
                temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }
        int [] temp2;
        for (int i=0; i<m/2; i++) {
            temp2 = a[i];
            a[i] = a[m-i-1];
            a[m-i-1] = temp2;
        }

        print(a);

    }

    public static void print(int[][] a) {
        int m = a.length;
        for (int i=0; i<m; i++) {
            for (int j=0; j<m; j++) {
                System.out.print(a[i][j] + "  ");
            }
            System.out.println();
            
        }

    }
}
