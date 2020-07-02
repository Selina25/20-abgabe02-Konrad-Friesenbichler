package at.fhj.iit;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;


/**
 * This class represents a Queue which is generic
 * @param <T> due to generics every datatype can be passed to this method
 */
public class GenericQueue<T>{
    private List<T> elements = new ArrayList<T>();
    private int maxSize = 5;

    /**
     * Constructor for a generic Queue
     * @param maxsize determines the number of elements which can belong to the queue
     */
    public GenericQueue(int maxsize) {
        this.maxSize = maxSize;
    }

    /**
     * Adds the element obj to the queue.
     * If the addition is successful, the method returns true else false.
     *
     * @param obj due to generics every datatype can be passed to this method
     * @return true if the addition was successful
     *         false if the addition was not successful
     */
    public boolean offer(T obj) {
        if (elements.size() != maxSize)
            elements.add(obj);
        else
            return false;

        return true;
    }

    /**
     * Returns the head (first) element and also deletes it. That is, we cannot get it again.
     * If no element exists (when queue is empty), the method returns null.
     *
     * @return due to generics a element of every datatype can be returned
     */
    public T poll() {
        T element = peek();

        if (elements.size() != 0) {
            elements.remove(0);
        }

        return element;
    }

    /**
     * It also returns and deletes the head element like poll(), but with a small difference.
     * This method throws NoSuchElementException if the queue is empty.
     *
     * @return due to generics a element of every datatype can be returned
     */
    public T remove() {
        T element = poll();
        if (element == null)
            throw new NoSuchElementException("there's no element any more");

        return element;
    }

    /**
     * Returns the head element but it does not delete it. That is, we can get it again.
     * Returns null when the queue is empty.
     *
     * @return due to generics a element of every datatype can be returned
     */
    public T peek() {
        T element;
        if (elements.size() > 0)
            element = elements.get(0);
        else
            element = null;

        return element;
    }

    /**
     * It works similar to peek() but with a small difference (returns but does not delete the element).
     * It throws NoSuchElementException when the queue is empty.
     *
     * @return due to generics a element of every datatype can be returned
     */
    public T element() {
        T element = peek();
        if (element == null)
            throw new NoSuchElementException("there's no element any more");

        return element;
    }

    public int getMaxSize() {
        return maxSize;
    }
}
