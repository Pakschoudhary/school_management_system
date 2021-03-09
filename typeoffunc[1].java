public class typeoffunc {

         public static void fun() // Function fun Defination
    {
        System.out.println("Hello");
    }
        public static void fun1(int x, int y) {
        x = 4;
        y = 2;
        int z = x / y;
        System.out.println("Div is: " + z);
    }
   public static void main(String[] args) {
        fun();
        fun1(2,3);
   }
}
//There are 2 types of functions one is paramiterized and non parametrized
// above is shown parametrized and non parametrized constructor