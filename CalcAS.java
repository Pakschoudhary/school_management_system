public class CalcAS {

    public static void add(int x, int y) {
        final int a = 2;
        final int b = 3;
        System.out.println("Result is: " + (a + b));
    }

    public static void sub(int x, int y) {
        final int c = 3;
        final int d = 5;
        System.out.println("Subtract is: " + (d - c));
    }

    public static void mult(int x, int y) {
        int c;
        c = x * y;
        System.out.println("Multplication is: " +c);
    }

    public static void div(int x, int y) {
        x = 4;
        y = 2;
        final int z = x / y;
        System.out.println("Div is: " + z);
    }

    public static void main(String[] args) {
        add(10, 20);
        sub(10, 20);
        mult(10, 20);
        div(10, 20);

    }
}
