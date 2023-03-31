import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import java.util.NoSuchElementException;

public class Tests {

    private VectorHeap<Integer> vectorHeap;

    /**
     * The function compares the priority of two processes and returns a value based on the comparison
     */
    @Test
    public void testCompareTo() {
        Proceso p1 = new Proceso("p1", "u1", 5);
        Proceso p2 = new Proceso("p2", "u2", 10);
        assertTrue(p1.compareTo(p2) < 0);
        assertTrue(p2.compareTo(p1) > 0);
        assertEquals(p1.compareTo(p1), 0);
    }

    /**
     * This function tests the toString method of the Proceso class
     */
    @Test
    public void testToString() {
        Proceso p = new Proceso("p1", "u1", 5);
        assertEquals(p.toString(), "p1, u1, 5, PR=125");
    }

    /**
     * This function is used to set up the vector heap before the test is run.
     */
    @Before
    public void setUp() {
        vectorHeap = new VectorHeap<Integer>();
    }

   /**
    * The testAdd() method tests the add() method of the VectorHeap class
    */
    @Test
    public void testAdd() {
        vectorHeap.add(1);
        assertEquals(1, vectorHeap.size());
        assertEquals(new Integer(1), vectorHeap.getFirst());
        vectorHeap.add(3);
        assertEquals(2, vectorHeap.size());
        assertEquals(new Integer(1), vectorHeap.getFirst());
        vectorHeap.add(2);
        assertEquals(3, vectorHeap.size());
        assertEquals(new Integer(1), vectorHeap.getFirst());
    }

    /**
     * The function tests the remove method of the vectorHeap class
     */
    @Test
    public void testRemove() {
        vectorHeap.add(1);
        vectorHeap.add(3);
        vectorHeap.add(2);
        assertEquals(new Integer(1), vectorHeap.remove());
        assertEquals(new Integer(2), vectorHeap.getFirst());
        assertEquals(2, vectorHeap.size());
        assertEquals(new Integer(2), vectorHeap.remove());
        assertEquals(new Integer(3), vectorHeap.getFirst());
        assertEquals(1, vectorHeap.size());
        assertEquals(new Integer(3), vectorHeap.remove());
        assertTrue(vectorHeap.isEmpty());
    }

    /**
     * This function tests the clear method of the vectorHeap class
     */
    @Test
    public void testClear() {
        vectorHeap.add(1);
        vectorHeap.add(3);
        vectorHeap.add(2);
        vectorHeap.clear();
        assertTrue(vectorHeap.isEmpty());
    }

}
