package shortestPath;

import org.testng.annotations.Test;

import java.util.ArrayList;

import static org.testng.Assert.*;

public class ReisTest {

    @Test
    public void testBestRoute() {
        Node vluchtA = new Node("Schiphol");
        Node vluchtB = new Node("Suvarnabhumi");
        Node vluchtC = new Node("Luchthaven Antwerpen");
        Node vluchtD = new Node("Luchthaven Eindhoven");
        Node vluchtE = new Node("Carcassonne");
        Node vluchtF = new Node("Stockholm-Arlanda");

        Stap vluchtAB = new Vlucht(vluchtB, 113 * (5 / 2));
        Stap vluchtAC = new Vlucht(vluchtC, 72 * (8 / 2));

        Stap vluchtBD = new Vlucht(vluchtD, 126 * (14 / 2));
        Stap vluchtBF = new Vlucht(vluchtF, 301 * (33 / 2));

        Stap vluchtCE = new Vlucht(vluchtE, 193 * (27 / 2));

        Stap vluchtDE = new Vlucht(vluchtE, 72 * (39 / 2));
        Stap vluchtDF = new Vlucht(vluchtF, 75 * (19 / 2));

        Stap vluchtFE = new Vlucht(vluchtE, 111 * (21 / 2));

        vluchtA.addDestination(vluchtAB);
        vluchtA.addDestination(vluchtAC);

        vluchtB.addDestination(vluchtBD);
        vluchtB.addDestination(vluchtBF);

        vluchtC.addDestination(vluchtCE);

        vluchtD.addDestination(vluchtDE);
        vluchtD.addDestination(vluchtDF);

        vluchtF.addDestination(vluchtFE);

        Graph graphVlucht = new Graph();

        graphVlucht.addNode(vluchtA);
        graphVlucht.addNode(vluchtB);
        graphVlucht.addNode(vluchtC);
        graphVlucht.addNode(vluchtD);
        graphVlucht.addNode(vluchtE);
        graphVlucht.addNode(vluchtF);

        Reis reisVlucht1 = new Reis("shortestPath.Vlucht");
        Node beginNodeVlucht = vluchtA;
        Node eindNodeVlucht = vluchtE;

        System.out.println(reisVlucht1.bestRoute(eindNodeVlucht, graphVlucht.calculateShortestPathFromSource(graphVlucht, beginNodeVlucht), beginNodeVlucht));
        ArrayList<String> test_juiste_nodes = new ArrayList<>();
        test_juiste_nodes.add("Suvarnabhumi");
        test_juiste_nodes.add("Carcassonne");
        test_juiste_nodes.add("Schiphol");
        test_juiste_nodes.add("Luchthaven Eindhoven");
        assertEquals(test_juiste_nodes, reisVlucht1.bestRoute(eindNodeVlucht, graphVlucht.calculateShortestPathFromSource(graphVlucht, beginNodeVlucht), beginNodeVlucht));
    }
}