package comparable;
import java.util.ArrayList;
import java.util.Collections;
/** example of sorting with compareTo
* @since 3/20/23
*/

public class sortingExample {

   public static void main(String[] args) {
   
      ArrayList<ComparableItem> aList = new ArrayList<>();
      ComparableItem item1 = new ComparableItem("Apple", 15);
      ComparableItem item2 = new ComparableItem("banana", 8);
      ComparableItem item3 = new ComparableItem("acai", 9);
      ComparableItem item4 = new ComparableItem("carrot", 9);
      ComparableItem item5 = new ComparableItem("cabbage", 15); 
     
      
      System.out.println(item1.compareTo(item2));
      System.out.println(item2.compareTo(item1));
      System.out.println(item1.compareTo(item1));
      
      aList.add(item1);
      aList.add(item2);
      aList.add(item3);
      aList.add(item4);
      aList.add(item5);
      System.out.println("Unsorted list: ");
      for(ComparableItem i:aList){
         System.out.println(i);
      }
      Collections.sort(aList);
      System.out.println("Sorted list: ");
      for(ComparableItem i:aList){
         System.out.println(i);
      }
 
   
   ArrayList<String> strList = new ArrayList<>();
   
   strList.add("zebra");
   strList.add("giraffe");
   strList.add("horse");
   strList.add("dog");
   strList.add("CAT");
   strList.add("cat");
   strList.add("ape");
   
   for(String s: strList){
      System.out.println(s);
   }
   
   Collections.sort(strList);
   System.out.println("\nSorted:");
   for(String s: strList){
      System.out.println(s);
   }
   
      Collections.sort(strList, Collections.reverseOrder());
   System.out.println("\nSorted in reverse:");
   for(String s: strList){
      System.out.println(s);
   }
  }

}