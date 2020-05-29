import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] arg) {

        Node nodeA = new Node("A");
        Node nodeB = new Node("B");
        Node nodeC = new Node("C");
        Node nodeD = new Node("D");
        Node nodeE = new Node("E");
        Node nodeF = new Node("F");

        Stap nodeAB = new Rit(nodeB, 10);
        Stap nodeAC = new Rit(nodeC, 15);

        Stap nodeBD = new Rit(nodeD, 12);
        Stap nodeBF = new Rit(nodeF, 15);

        Stap nodeCE = new Rit(nodeE, 10);

        Stap nodeDE = new Rit(nodeE, 2);
        Stap nodeDF = new Rit(nodeF, 1);

        Stap nodeFE = new Rit(nodeE, 5);

        nodeA.addDestination(nodeAB);
        nodeA.addDestination(nodeAC);

        nodeB.addDestination(nodeBD);
        nodeB.addDestination(nodeBF);

        nodeC.addDestination(nodeCE);

        nodeD.addDestination(nodeDE);
        nodeD.addDestination(nodeDF);

        nodeF.addDestination(nodeFE);

        Graph graph = new Graph();

        graph.addNode(nodeA);
        graph.addNode(nodeB);
        graph.addNode(nodeC);
        graph.addNode(nodeD);
        graph.addNode(nodeE);
        graph.addNode(nodeF);

        Reis reis1 = new Reis("Rit");
        Node beginNode = nodeA;
        Node eindNode = nodeE;

        System.out.println(reis1.bestRoute(eindNode, graph.calculateShortestPathFromSource(graph, beginNode), beginNode));
    }
}