package at.fhj.iit;

import static org.junit.jupiter.api.Assertions.*;

import at.fhj.iit.GenericQueue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;


@DisplayName("Testing GenericQueue implementation")
public class GenericQueueTest2 {

    private GenericQueue<Integer> queue;
    private GenericQueue<Integer> empty;


    /**
     * inits an generic queue with the data type integer to test the class GenericQueue
     */
    @BeforeEach
    void setup() {
        // SETUP PHASE
        queue = new GenericQueue<Integer>(5);
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        empty = new GenericQueue<Integer>(0);
    }

    /**
     * tests the constructor of the class GenericQueue with integers
     */
    @Test
    @DisplayName("Testing constructor")
    public void testConstructor() {
        assertEquals(5, queue.getMaxSize());
    }

    /**
     * tests the offer-method of the class Generic Queue
     */
    @Test
    @DisplayName("Testing the method offer")
    public void testMethodOffer() {
        assertEquals(true, queue.offer(5));
        assertEquals(false, queue.offer(6));


    }

    /**
     * tests the element-method of the class Generic Queue
     */
    @Test
    @DisplayName("Testing the method element")
    public void testMethodElement() {
        assertEquals(1, queue.element());


    }

    /**
     * tests the element-method of the class Generic Queue with an empty queue
     */
    @Test
    @DisplayName("Testing the method element")
    public void testMethodElement2() {
        assertThrows(NoSuchElementException.class, () -> {
            empty.element();
        });

    }

    /**
     * tests the peek-method of the class Generic Queue
     */
    @Test
    @DisplayName("Testing the method peek")
    public void testMethodPeek() {
        assertEquals(1, queue.peek());


    }

    /**
     * tests the peek-method of the class Generic Queue with an empty queue
     */
    @Test
    @DisplayName("Testing the method peek")
    public void testMethodPeek2() {

        assertEquals(null, empty.peek());

    }

    /**
     * tests the poll-method of the class Generic Queue
     */
    @Test
    @DisplayName("Testing the method poll")
    public void testMethodPoll() {
        assertEquals(1, queue.poll());


    }

    /**
     * tests the poll-method of the class Generic Queue with an empty queue
     */
    @Test
    @DisplayName("Testing the method poll")
    public void testMethodPoll2() {
        assertEquals(null, empty.poll());

    }

    /**
     * tests the remove-method of the class Generic Queue
     */
    @Test
    @DisplayName("Testing the method remove")
    public void testMethodRemove() {
        assertEquals(1, queue.remove());


    }


    /**
     * tests the remove-method of the class Generic Queue with an empty queue
     */
    @Test
    @DisplayName("Testing the method remove")
    public void testMethodRemove2() {
        assertThrows(NoSuchElementException.class, () -> {
            empty.remove();
        });

    }
}