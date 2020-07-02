package at.fhj.iit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;


@DisplayName("Testing GenericQueue implementation")
public class GenericQueueTest {

    private GenericQueue<String> queue;
    private GenericQueue<String> empty;


    /**
     * inits an generic queue with the data type string to test the class GenericQueue
     */
    @BeforeEach
    void setup() {
        // SETUP PHASE
        queue = new GenericQueue<String>(5);
        queue.offer("hello1");
        queue.offer("hello2");
        queue.offer("hello3");
        queue.offer("hello4");
        empty= new GenericQueue<String>(0);
    }

    /**
     * tests the constructor of the class GenericQueue with strings
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
        assertEquals(true, queue.offer("hello5"));
        assertEquals(false, queue.offer("hello6"));

    }


    /**
     * tests the element-method of the class Generic Queue
     */
    @Test
    @DisplayName("Testing the method element")
    public void testMethodElement() {
        assertEquals( "hello1", queue.element());


    }
    /**
     * tests the element-method of the class Generic Queue with an empty queue
     */
    @Test
    @DisplayName("Testing the method element")
    public void testMethodElement2() {
        assertThrows(NoSuchElementException.class, () ->{
            empty.element();
        });

    }
    /**
     * tests the peek-method of the class Generic Queue
     */
    @Test
    @DisplayName("Testing the method peek")
    public void testMethodPeek() {
        assertEquals( "hello1", queue.peek());


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
        assertEquals( "hello1", queue.poll());



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
        assertEquals( "hello1", queue.remove());


    }


    /**
     * tests the remove-method of the class Generic Queue with an empty queue
     */
    @Test
    @DisplayName("Testing the method remove")
    public void testMethodRemove2() {
        assertThrows(NoSuchElementException.class, () ->{
            empty.remove();
        });

    }
}