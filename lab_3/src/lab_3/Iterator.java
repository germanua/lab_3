package lab_3;

/**
 * Interface defining operations for an iterator.
 */
public interface Iterator {
    /**
     * Checks if there are more elements in the iteration.
     *
     * @return true if the iteration has more elements, false otherwise.
     */
    boolean hasNext();

    /**
     * Returns the next element in the iteration.
     *
     * @return the next element in the iteration.
     */
    int next();
}