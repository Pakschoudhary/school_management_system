public class overloading {
    public static void main(String[] args) {
        child obj = new child();
        obj.add(3, 4);
        obj.add(3, 4, 2);

    }
}

public class sum {
    public void add(int a, int b) {
        int sum = a + b;
        System.out.println("Sum= " + sum);
    }
}

public class child extends sum {
    public void add(int a, int b, int c) {
        int r = a * b * c;
        System.out.println("Result is= " + r);
    }
}