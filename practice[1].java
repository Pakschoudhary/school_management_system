public class practice {
   public static void main(String[] args) {
       details obj = new details();
       obj.add();
   }
}
public class details{
   int a=4, b=5;

    public void add(){
        int sum=a+b;
        System.out.println("Sum is= " +sum);
    }
}