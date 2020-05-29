package shortestPath;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class VluchtTest {

    @Test
    public void testGetKM() {
        Node nodeA = new Node("A");
        Vlucht test1 = new Vlucht(nodeA, 20);
        test1.setEuro(100);
        assertEquals(100, test1.getKM());
    }

    @Test
    public void testTestToString() {
        Node nodeA = new Node("A");
        Vlucht test1 = new Vlucht(nodeA, 20);
        test1.setEuro(100);
        assertEquals("afstand km: " + 100, test1.toString());
    }
}