public class constoverloading {
   public static void main(String[] args) {
       number obj = new number(4);
       System.out.println(obj.num);
   }
}
public class number {
 int num=3;
    public number() {
        System.out.println("number in default");
    }

    public number(int a) 
    {
        System.out.println("Number in overloading constructor");
        System.out.println(a);
    }
}
// default constructor is called autometically when the variable is created of the class name
// parameterized constructor is called when some parameter is passed inside a default constructor