//Interface Program
public class Interface implements FirstParent, SecondParent, ThirdParent {
    public void display() {
        FirstParent.super.display();
        SecondParent.super.display();
        ThirdParent.super.display();
    }

    public static void main(String[] args) {
        Interface obj = new Interface();
        obj.display();

    }
}

interface FirstParent {
    default void display() {
        System.out.println("First Interface");
    }
}

interface SecondParent {
    default void display() {
        System.out.println("Second Interface");
    }
}

interface ThirdParent {
    default void display()
    {
        System.out.println("Third Interface");
    }
}