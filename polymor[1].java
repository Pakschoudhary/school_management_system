//overloading and overriding
// Overriding
public class polymor {
    public static void main(String[] args) {
       child obj = new child();
       obj.display();
    }
}

public class parent {

    public void display() {
        System.out.println("Hi i am in parent");
    }
}

public class child extends parent{
    public void display()
    {
        System.out.println("Hi i am in child class");
    }
}