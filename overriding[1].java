public class overriding {
    public static void main(String[] args) {
        mult obj = new mult();
        obj.add(2,3);

    }
}

public class sum {

    public void add(int num1,int num2) {
        int sum = num1 + num2;
        System.out.println("Sum is: " + sum);
    }
}

public class mult extends sum {

    public void add(int num1,int num2) {
        int mult = num1 * num2;
        System.out.println("Mult is: " + mult);
    }
}
