public class functionoverloadingoverriding {
   public static void main(String[] args) {
       child obj = new child();
       obj.add(2,3);
       obj.add(2,3,4);
       chi obj1 = new chi();
       obj1.sub(4,3);
   }
}
//function overloading is defined as same class name but different augements or parameters
public class parent {
    public void add(int a, int b) {
        int sum = a + b;
        System.out.println("Sum= " + sum);
    }
}

public class child extends parent {
    public void add(int a, int b, int c) {
        int sum = a + b + c;
        System.out.println("sum is= " + sum);
    }
}
//function overriding is defined as same class name and parameters but different body
public class par {
    public void sub(int x, int y) {
        int sum = x - y;
        System.out.println("Sum= " + sum);
    }
}

public class chi extends par {
    public void sub(int x, int y) {
        int res = x * y ;
        System.out.println("Result is= " + res);
    }
}