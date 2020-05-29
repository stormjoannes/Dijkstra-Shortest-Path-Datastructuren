package shortestPath;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class StapTest {

    @Test
    public void testGetValue() {
        Node nodeA = new Node("A");
        Rit test1_Stap = new Rit(nodeA, 63);
        test1_Stap.setKM(26);
        assertEquals(26, test1_Stap.getValue());
    }
}