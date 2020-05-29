package shortestPath;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class RitTest {

    @Test
    public void testGetValue() {
        Node nodeA = new Node("A");
        Rit test1_Rit = new Rit(nodeA, 29);
        test1_Rit.setKM(26);
        assertEquals(26, test1_Rit.getValue());
    }

    @Test
    public void testTestToString() {
        Node nodeA = new Node("A");
        Rit test2_Rit = new Rit(nodeA, 20);
        test2_Rit.setKM(26);
        assertEquals("afstand km: " + 100, test2_Rit.toString());
    }
}