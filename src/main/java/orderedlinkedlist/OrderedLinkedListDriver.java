package orderedlinkedlist;
import java.util.PriorityQueue;
import comparable.ComparableItem;
/**
 * A driver for the generic list of ordered linked nodes
 * 
 * @author William McDaniel Albritton
 * @author Edoardo Biagioni
 */
public class OrderedLinkedListDriver{

	/**
	 * Method main is used as a driver to test the class. Note that this is
	 * similar to the OrderedArrayList test!
	 * 
	 * @param args
	 *            Not used.
	 */
	public static void main(String[] args) {
		// test list of Strings
		String name = new String("Nami");
		List<String> stringList = new OrderedLinkedList<String>();
		stringList.add(name);
		name = new String("Kai");
		stringList.add(name);
		name = new String("Satsuki");
		stringList.add(name);
		name = new String("Chihiro");
		stringList.add(name);
		System.out.println(stringList + "\n");

		// test constructor
		List<ComparableItem> list = new OrderedLinkedList<ComparableItem>();
		System.out.println(list + "\n");
      
      PriorityQueue <ComparableItem> pq = new PriorityQueue<>();

		// test add
		ComparableItem item = new ComparableItem("fork", 4);
		list.add(item);
      pq.offer(item);
		System.out.println(list + "\n");
      System.out.println(pq + "\n");
		item = new ComparableItem("eel", 4);
		list.add(item);
		pq.offer(item);
		System.out.println(list + "\n");
      System.out.println(pq + "\n");
		item = new ComparableItem("carrot", 6);
		list.add(item);
		pq.offer(item);
		System.out.println(list + "\n");
      System.out.println(pq + "\n");
		item = new ComparableItem("doughnut", 89);
		list.add(item);
		pq.offer(item);
		System.out.println(list + "\n");
      System.out.println(pq + "\n");
		item = new ComparableItem("banana", 2);
		list.add(item);
		pq.offer(item);
		System.out.println(list + "\n");
      System.out.println(pq + "\n");
		item = new ComparableItem("zucchini", 7);
		list.add(item);
		pq.offer(item);
		System.out.println(list + "\n");
      System.out.println(pq + "\n");

		// test remove
		list.remove(list.size() - 1);
		System.out.println(list + "\n");
		list.remove(3);
		System.out.println(list + "\n");
		list.remove(1);
		System.out.println(list + "\n");

		// test exceptions
		try {
			list.remove(50);
		} catch (ListException exception) {
			System.out.println("Correctly caught remove exception for position 50:");
			System.out.println(exception);
		}
	}// end of main()
}// end of class

/*PROGRAM OUTPUT:
1, Chihiro
2, Kai
3, Nami
4, Satsuki




1, fork, 10


1, eel, 20
2, fork, 10


1, carrot, 30
2, eel, 20
3, fork, 10


1, carrot, 30
2, doughnut, 40
3, eel, 20
4, fork, 10


1, banana, 50
2, carrot, 30
3, doughnut, 40
4, eel, 20
5, fork, 10


1, banana, 50
2, carrot, 30
3, doughnut, 40
4, eel, 20
5, fork, 10
6, zucchini, 60


1, banana, 50
2, carrot, 30
3, doughnut, 40
4, eel, 20
5, fork, 10


1, banana, 50
2, carrot, 30
3, eel, 20
4, fork, 10


1, carrot, 30
2, eel, 20
3, fork, 10


ListException: 50 is outside list range. 
 */

