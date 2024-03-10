package lab_3;

import java.util.ArrayList;
import java.util.List;

/**
 * Class implementing a linear list using an unordered structure.
 */
public class UnorderedList implements LinearList {

    private List<Integer> elements;

    /**
     * Constructs an UnorderedList object.
     */
    public UnorderedList() {
        this.elements = new ArrayList<>();
    }

    @Override
    public void add(int element) {
        elements.add(element);
    }

    @Override
    public Iterator iterator() {
        return new UnorderedListIterator(elements);
    }

    /**
     * Inner class implementing an iterator for unordered list traversal.
     */
    private class UnorderedListIterator implements Iterator {

        private List<Integer> elements;
        private int position;

        /**
         * Constructs an UnorderedListIterator object.
         *
         * @param elements List of elements to iterate over.
         */
        public UnorderedListIterator(List<Integer> elements) {
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