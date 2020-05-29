package shortestPath;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class VluchtTest {

    @Test
    public void testGetValue() {
        Node nodeA = new Node("A");
        Vlucht test1_Vlucht = new Vlucht(nodeA, 20);
        test1_Vlucht.setEuro(100);
        assertEquals(100, test1_Vlucht.getValue());
    }

    @Test
    public void testTestToString() {
        Node nodeA = new Node("A");
        Vlucht test2_vlucht = new Vlucht(nodeA, 20);
        test2_vlucht.setEuro(100);
        assertEquals("afstand km: " + 100, test2_vlucht.toString());
    }
}