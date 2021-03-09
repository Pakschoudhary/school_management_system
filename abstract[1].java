class demo1 extends demo 
{
     void show()
    {
        System.out.println("abstract method");
    }
 public static void main(String[] args) {
       demo obj = new demo1();
       obj.show();
 }
}
abstract class demo
{
    abstract void show();
}
