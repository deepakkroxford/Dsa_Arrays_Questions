public class pattern {
    public static void main(String[] args) {
        int i, j;
        int n = 5;
        for (i = 0; i <= n; i++) {
            for (j = 0; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.printf("1");
                } else {
                    System.out.printf("0");
                }
            }
            System.out.printf("\n");
        }
    }
}
