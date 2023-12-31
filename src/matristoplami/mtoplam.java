package matristoplami;

public class mtoplam {
    public static void main(String[] args) {
        int num1[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int num2[][] = {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}};

        try {
            int sonuc[][] = Topla(num1, num2);

            for (int i = 0; i < num1.length; i++) {
                for (int j = 0; j < num1[0].length; j++) {
                    System.out.printf(" %d", sonuc[i][j]);
                }
                System.out.printf("\n");
            }
        } 
		catch (IllegalArgumentException e) {
            System.out.println("Matrisler toplanamaz: " + e.getMessage());
        }
    }

    public static int[][] Topla(int a1[][], int a2[][]) {
        if (a1.length != a2.length || a1[0].length != a2[0].length) {
            throw new IllegalArgumentException("Toplama için matrislerin boyutları aynı olmalıdır");
        }

        int i, j;
        int s[][] = new int[a1.length][a1[0].length];

        for (i = 0; i < a1.length; i++) {
            for (j = 0; j < a1[0].length; j++) {
                s[i][j] = a1[i][j] + a2[i][j];
            }
        }

        return s;
    }
}
