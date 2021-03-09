public class looping {
    public static void main(String args[]) {

        int i, j, row = 2;
        for (i = 0; i <= row; i++) {
            for (j = 0; j <= row; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}