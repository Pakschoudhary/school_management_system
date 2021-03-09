import java.util.*;
/*
key value
d={"one": 1}
*/
public class dictionary {
   public static void main(String[] args) {
      Hashtable<Integer,String> ht = new Hashtable<Integer,String>();
      ht.put(1,"Akshay");
      ht.put(2,"Deepa");
      ht.put(3,"Abhay");
     
      for(Map.Entry i:ht.entrySet())
      {
         System.out.println(i.getKey() + " " + i.getValue());
      }
   }
}
