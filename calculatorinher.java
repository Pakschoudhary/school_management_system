public class calculatorinher {
   public static void main(String[] args) {
       div obj= new div();
       obj.no1=5;
       obj.no2=10;
       obj.add();
       obj.sub();
       obj.mult();
       obj.div();
   }
}
public class add {
    int no1, no2;
    
    public void add() {
        int sum = no1 + no2;
        System.out.println("Addition is: " + sum);
    }
}

public class sub extends add {

    public void sub() {
        int sub = no1 - no2;
        System.out.println("Subtraction is: " + sub);
    }
}

public class mult extends sub {
    public void mult() {
        int mult = no1*no2;
        System.out.println("Multiplication is: " + mult);
    }

}
public class div extends mult {
    public void div() {
        int div = no1/no2;
        System.out.println("Division is: " + div);
    }
}
//Single level inheritance is nothing but inheriting only one class ie "public class sub extends add"
// Multi level inheritance is nothing but inheriting all the class like sub,multand div from its parent class