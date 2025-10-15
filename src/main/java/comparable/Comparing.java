import java.util.*;
public class Comparing {
   public static void main(String[] args) {
      ArrayList<String> al = new ArrayList<>();
      String s1 = "cat";
      String s2 = "dog";
      String s3 = "cot";
      
      al.add(s1);
      al.add(s2);
      al.add(s3);
      
      System.out.println(al);
      Collections.sort(al);
      System.out.println(al);
      System.out.println(s1.compareTo(s2));
      System.out.println(s3.compareTo(s1));
   
   }

}