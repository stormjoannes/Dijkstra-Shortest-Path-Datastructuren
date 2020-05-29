import java.util.ArrayList;

public class Main {
    public static void main(String[] arg) {
//        Reis rit = new Reis();

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

//        nodeA.addDestination(nodeB, 10);
//        nodeA.addDestination(nodeC, 15);
//
//        nodeB.addDestination(nodeD, 12);
//        nodeB.addDestination(nodeF, 15);
//
//        nodeC.addDestination(nodeE, 10);
//
//        nodeD.addDestination(nodeE, 2);
//        nodeD.addDestination(nodeF, 1);
//
//        nodeF.addDestination(nodeE, 5);
//
        Graph graph = new Graph();

        graph.addNode(nodeA);
        graph.addNode(nodeB);
        graph.addNode(nodeC);
        graph.addNode(nodeD);
        graph.addNode(nodeE);
        graph.addNode(nodeF);


        graph = graph.calculateShortestPathFromSource(graph, nodeA);
        ArrayList<String> done = new ArrayList<>();
        for (Node i : nodeE.getShortestPath()) {
            done.add(i.getName());
        }
        System.out.println(done);
    }
}