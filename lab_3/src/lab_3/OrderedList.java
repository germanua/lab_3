package lab_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Class implementing a linear list using an ordered structure.
 */
public class OrderedList implements LinearList {

    private List<Integer> elements;

    /**
     * Constructs an OrderedList object.
     */
    public OrderedList() {
        this.elements = new ArrayList<>();
    }

    @Override
    public void add(int element) {
        elements.add(element);
        Collections.sort(elements);
    }

    @Override
    public Iterator iterator() {
        return new OrderedListIterator(elements);
    }

    /**
     * Inner class implementing an iterator for ordered list traversal.
     */
    private class OrderedListIterator implements Iterator {

        private List<Integer> elements;
        private int position;

        /**
         * Constructs an OrderedListIterator object.
         *
         * @param elements List of elements to iterate over.
         */
        public OrderedListIterator(List<Integer> elements) {
            this.elements = elements;
            this.position = 0;
        }

        @Override
        public boolean hasNext() {
            return position < elements.size();
        }

        @Override
        public int next() {
            return elements.get(position++);
        }
    }
}