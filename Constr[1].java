public class Constr {
    public static void main(String[] args) {
        Details obj = new Details(2);
        System.out.println(obj.name);
    }
}

class Details {

    String name = "Akshay";

    public Details() {
        System.out.println("Inside default constructor");
    }

    public Details(int a) // default
    {
        System.out.println("Inside Parametrized constructor");
        System.out.println(a);
    }
}
// default constructor
// const is a Member method
// const name and class name are same
// const will never return anything
// const is used to allocate memory
// whenever var is created, const will be called auto
// types- default, parametrized, overloading