package shortestPath;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class TreinritTest {

    @Test
    public void testGetKM() {
        Node nodeA = new Node("A");
        Treinrit test1 = new Treinrit(nodeA, 20);
        test1.setMin(96);
        assertEquals(96, test1.getKM());
    }

    @Test
    public void testTestToString() {
        Node nodeA = new Node("A");
        Treinrit test1 = new Treinrit(nodeA, 20);
        test1.setMin(96);
        assertEquals("Tijd in Minuten: " + 100, test1.toString());
    }
}