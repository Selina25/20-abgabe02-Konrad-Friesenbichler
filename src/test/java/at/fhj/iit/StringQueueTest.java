package at.fhj.iit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

/**
 * A JUnit 5 -Testclass to test the methods of StringQueue.java
 * 100% is intended to get covered
 */
@DisplayName("Testing StringQueue class")
class StringQueueTest {
    private StringQueue stringQueue1, stringQueue2;

    /**
     * inits longdrinks and respective liquids for EACH test
     */
    @BeforeEach
    void setup(){
        stringQueue1 = new StringQueue(5);
        stringQueue2 = new StringQueue(10);
        stringQueue1.offer("string1");
        stringQueue1.offer("string2");
        stringQueue1.offer("string3");
        stringQueue1.offer("string4");
        stringQueue1.offer("string5");
    }

    /**
     * checking if it is possible to add another String to the Queue based on the maxsize
     * if it is possible, the string will be added and true will be returned
     * otherwise false will be returned
     */
    @Test
    @DisplayName("Testing method offer 1")
    public void testOffer1(){
       assertEquals(false, stringQueue1.offer("string6"));
    }


    /**
     * checking if it is possible to add another String to the Queue based on the maxsize
     * if it is possible, the string will be added and true will be returned
     * otherwise false will be returned
     */
    @Test
    @DisplayName("Testing method offer 2")
    public void testOffer2(){
        assertEquals(true, stringQueue2.offer("string1"));
    }

    /**
     * checking if the first element will be the expected value
     * here: "string1"
     */
    @Test
    @DisplayName("Testing method peek 1")
    public void testPeek1(){
        assertEquals("string1", stringQueue1.peek());
    }

    /**
     * checking if the first element will be the expected value
     * here: with no value an Exception expected
     */
    @Test
    @DisplayName("Testing method peek 2")
    public void testPeek2(){
        assertEquals(null, stringQueue2.peek());
    }

    /**
     * checking if the return value of element is the expected value
     */
    @Test
    @DisplayName("Testing method element 1")
    public void testElement1(){
        assertEquals("string1", stringQueue1.element());
    }

    /**
     * checking if the return value will trigger an exception if there is no element in the list
     */
    @Test
    @DisplayName("Testing method element 2")
    public void testElement2(){
        assertThrows(NoSuchElementException.class,
            () ->{ stringQueue2.element();
        });
    }

    /**
     * checking if the the returned value is equivalent to the expected value
     */
    @Test
    @DisplayName("Testing method poll 1")
    public void testPoll1(){
        assertEquals("string1", stringQueue1.poll());
    }

    /**
     * checking if the return value is null if there is no element in the list
     */
    @Test
    @DisplayName("Testing method poll 2")
    public void testPoll2(){
        assertEquals(null, stringQueue2.poll());
    }

    /**
     * tests removing a string from the queue
     */
    @Test
    @DisplayName("Testing method remove 1")
    public void testRemove1(){
        assertEquals("string1", stringQueue1.remove());
    }

    /**
     * tests removing a string from an empty queue and checks if Exception will be thrown
     */
    @Test
    @DisplayName("Testing method remove 2")
    public void testRemove2(){
        assertThrows(NoSuchElementException.class,
            () ->{ stringQueue2.remove();
        });
    }
}