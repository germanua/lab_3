import lab_3.Iterator;
import lab_3.OrderedList;
import lab_3.LinearList;
import lab_3.UnorderedList;
/**
 * Main class to demonstrate the usage of linear list implementations.
 */
public class Main {
    public static void main(String[] args) {
        LinearList unorderedList = new UnorderedList();
        unorderedList.add(3);
        unorderedList.add(2);
        unorderedList.add(9);
        Iterator unorderedIterator = unorderedList.iterator();
        while (unorderedIterator.hasNext()) {
            System.out.println("Sequential traversal: " + unorderedIterator.next());
        }

        LinearList orderedList = new OrderedList();
        orderedList.add(3);
        orderedList.add(2);
        orderedList.add(9);
        Iterator orderedIterator = orderedList.iterator();
        while (orderedIterator.hasNext()) {
            System.out.println("Sequential traversal in ordered structure: " + orderedIterator.next());
        }
    }
}