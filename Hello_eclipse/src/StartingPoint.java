import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// Exploration of lists
// http://www.exampledepot.com/egs/java.util/coll_Lists.html

// Important above allows you to create lists that grow dynamically as you add stuff to them.
// Also if you remove an item, it will remove that input and its position

public class StartingPoint {

	public static void main(String args[]) {

		List list = new LinkedList();
		list = new ArrayList();

		list.add("a");

		list.add("b");

		list.add(0, "b");

		System.out.println("The size of " + list + " is " + list.size());

		System.out.println(list.contains("a"));

		// Notice that the "a" must be with double quotes. Otherwise you'll get
		// an error
		list.remove("a");

		System.out.println(list.contains("a"));

		System.out.println(list);

	}
}
