// Single level Inheritance
// multi level 
public class inheritance {
    public static void main(String[] args) {
        div obj = new div();
        obj.num1 = 4;
        obj.num2 = 2;
        obj.add();
        obj.multiply();
        obj.division();
    }
}

public class sum {
    int num1, num2;
    
    public void add() {
        int sum = num1 + num2;
        System.out.println("Sum is: " + sum);
    }
}

public class mult extends sum {

    public void multiply() {
        int res = num1 * num2;
        System.out.println("mult= " + res);
    }
}

public class div extends mult {
    public void division() {
        int d = num1/num2;
        System.out.println("Division is= " + d);
    }

}