package shortestPath;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class TreinritTest {

    @Test
    public void testGetValue() {
        Node nodeA = new Node("A");
        Treinrit test1_Treinrit = new Treinrit(nodeA, 31);
        test1_Treinrit.setMin(96);
        assertEquals(96, test1_Treinrit.getValue());
    }

    @Test
    public void testTestToString() {
        Node nodeA = new Node("A");
        Treinrit test2_treinrit = new Treinrit(nodeA, 20);
        test2_treinrit.setMin(96);
        assertEquals("Tijd in Minuten: " + 100, test2_treinrit.toString());
    }
}