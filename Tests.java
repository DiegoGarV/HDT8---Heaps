import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import java.util.NoSuchElementException;

public class Tests {

    @Test
    public void testCompareTo() {
        Proceso p1 = new Proceso("p1", "u1", 5);
        Proceso p2 = new Proceso("p2", "u2", 10);
        assertTrue(p1.compareTo(p2) < 0);
        assertTrue(p2.compareTo(p1) > 0);
        assertEquals(p1.compareTo(p1), 0);
    }

    @Test
    public void testToString() {
        Proceso p = new Proceso("p1", "u1", 5);
        assertEquals(p.toString(), "p1, u1, 5, PR=125");
    }

    @Test
    public void testProcesosOrdenados() {
        Proceso p1 = new Proceso("p1", "u1", 5);
        Proceso p2 = new Proceso("p2", "u2", 10);
        Proceso p3 = new Proceso("p3", "u3", 1);
        Proceso[] procesos = { p1, p2, p3 };
        Proceso p = new Proceso("p1", "u1", 5);
        String orden = "p3, u3, 1, PR=121p1, u1, 5, PR=125p2, u2, 10, PR=130";
        assertEquals(p.procesosOrdenados(procesos), orden);
    }

    private VectorHeap<Integer> vectorHeap;

    @Before
    public void setUp() {
        vectorHeap = new VectorHeap<Integer>();
    }

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

    @Test
    public void testClear() {
        vectorHeap.add(1);
        vectorHeap.add(3);
        vectorHeap.add(2);
        vectorHeap.clear();
        assertTrue(vectorHeap.isEmpty());
    }

}
