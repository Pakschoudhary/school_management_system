public class method {

    public static void fun() // Function fun Defination
    {
        System.out.println("Hello");
    }

    public static void fun1() // Function fun1 Defination
    {
        System.out.println("Developer");
    }

    public static void add() // Function add Defination
    {
        final int a = 2;
        final int b = 3;
        System.out.println("Result is: " + (a + b));
    }

    public static void sub() {
        final int c = 3;
        final int d = 5;
        System.out.println("Subtract is: " + (d - c));
    }

    public static void div(int x, int y) {
        x = 4;
        y = 2;
        final int z = x / y;
        System.out.println("Div is: " + z);
    }

    public static int funx(int a, int b) {
        int c;
        c = a * b;
        return c;
    }


    public static void main(String[] args) {
        fun(); // calling function fun
        fun(); // calling function fun
        fun1(); // calling function fun1
        add(); // calling function add
        sub();
        div(4, 2);
       int mult =  funx(2, 4);
       System.out.println("value is : " + mult);

    }
}
