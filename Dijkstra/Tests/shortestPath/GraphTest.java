package shortestPath;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class GraphTest {

    @Test
    public void testAddNode() {
        Node treinRitA = new Node("Breda");
        Graph graphTreinrit = new Graph();
        graphTreinrit.addNode(treinRitA);

        System.out.println(graphTreinrit);
        System.out.println(treinRitA);
        assertNotEquals(graphTreinrit, treinRitA);
    }

    @Test
    public void testCalculateShortestPathFromSource() {
        Node ritA = new Node("A");
        Node ritB = new Node("B");
        Node ritC = new Node("C");

        Stap ritAB = new Rit(ritB, 10);
        Stap ritAC = new Rit(ritC, 15);

        ritA.addDestination(ritAB);
        ritA.addDestination(ritAC);

        Graph graphtestRit = new Graph();

        graphtestRit.addNode(ritA);
        graphtestRit.addNode(ritB);
        graphtestRit.addNode(ritC);

        Reis reisRit1 = new Reis("Rit");
        Node beginNodeRit = ritA;

        assertEquals(reisRit1, graphtestRit.calculateShortestPathFromSource(reisRit1, beginNodeRit));
    }
}