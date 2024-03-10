package lab_3;

/**
 * Interface defining operations for a linear list of integers.
 */
public interface LinearList {
    /**
     * Adds an integer element to the list.
     *
     * @param element Integer element to be added.
     */
    void add(int element);

    /**
     * Returns an iterator over the elements in this list.
     *
     * @return an iterator over the elements in this list.
     */
    Iterator iterator();
}