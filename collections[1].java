
// framework provides architecture to store and manipulategrp of object
/*
Single unit of objects
searching, sorting,insertion,deletion etc on data 
it provides many interfaces
java.util
array list uses dynamin array for storing data
*/
//ArrayList
//Linked List
//Vector
import java.util.*;

public class collections {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Mango");
        list.add("Apple");
        list.add("Kiwi");
        Iterator i = list.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
        LinkedList<String> list1 = new LinkedList<String>();
        list1.add("Diwali");
        list1.add("Ugadi");
        list1.add("Christmas");
        Iterator j = list1.iterator();
        while (j.hasNext()) {
            System.out.println(j.next());
        }
        Vector<String> list2 = new Vector<String>();
        list2.add("Akshay");
        list2.add("Abhay");
        list2.add("Deepa");
        Iterator k = list2.iterator();
        while (k.hasNext()) {
            System.out.println(k.next());
        }
    }
}