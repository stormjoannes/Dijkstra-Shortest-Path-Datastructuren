import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] arg) {

        Node ritA = new Node("A");
        Node ritB = new Node("B");
        Node ritC = new Node("C");
        Node ritD = new Node("D");
        Node ritE = new Node("E");
        Node ritF = new Node("F");

        Stap ritAB = new Rit(ritB, 10);
        Stap ritAC = new Rit(ritC, 15);

        Stap ritBD = new Rit(ritD, 12);
        Stap ritBF = new Rit(ritF, 15);

        Stap ritCE = new Rit(ritE, 10);

        Stap ritDE = new Rit(ritE, 2);
        Stap ritDF = new Rit(ritF, 1);

        Stap ritFE = new Rit(ritE, 5);

        ritA.addDestination(ritAB);
        ritA.addDestination(ritAC);

        ritB.addDestination(ritBD);
        ritB.addDestination(ritBF);

        ritC.addDestination(ritCE);

        ritD.addDestination(ritDE);
        ritD.addDestination(ritDF);

        ritF.addDestination(ritFE);

        Graph graphRit = new Graph();

        graphRit.addNode(ritA);
        graphRit.addNode(ritB);
        graphRit.addNode(ritC);
        graphRit.addNode(ritD);
        graphRit.addNode(ritE);
        graphRit.addNode(ritF);

        Reis reisRit1 = new Reis("Rit");
        Node beginNodeRit = ritA;
        Node eindNodeRit = ritE;

        System.out.println(reisRit1.bestRoute(eindNodeRit, graphRit.calculateShortestPathFromSource(graphRit, beginNodeRit), beginNodeRit));
        System.out.println("");




        Node treinRitA = new Node("Breda");
        Node treinRitB = new Node("Roosendaal");
        Node treinRitC = new Node("Eindhoven");
        Node treinRitD = new Node("Bergen-op-zoom");
        Node treinRitE = new Node("Tilburg");
        Node treinRitF = new Node("Kielegat");

        Stap treinRitAB = new Treinrit(treinRitB, 20);
        Stap treinRitAC = new Treinrit(treinRitC, 10);

        Stap treinRitBD = new Treinrit(treinRitD, 30);
        Stap treinRitBF = new Treinrit(treinRitF, 50);

        Stap treinRitCE = new Treinrit(treinRitE, 15);

        Stap treinRitDE = new Treinrit(treinRitE, 60);
        Stap treinRitDF = new Treinrit(treinRitF, 40);

        Stap treinRitFE = new Treinrit(treinRitE, 10);

        treinRitA.addDestination(treinRitAB);
        treinRitA.addDestination(treinRitAC);

        treinRitB.addDestination(treinRitBD);
        treinRitB.addDestination(treinRitBF);

        treinRitC.addDestination(treinRitCE);

        treinRitD.addDestination(treinRitDE);
        treinRitD.addDestination(treinRitDF);

        treinRitF.addDestination(treinRitFE);

        Graph graphTreinrit = new Graph();

        graphTreinrit.addNode(treinRitA);
        graphTreinrit.addNode(treinRitB);
        graphTreinrit.addNode(treinRitC);
        graphTreinrit.addNode(treinRitD);
        graphTreinrit.addNode(treinRitE);
        graphTreinrit.addNode(treinRitF);

        Reis reistTeinrit1 = new Reis("Treinrit");
        Node beginNodeTreinrit = treinRitA;
        Node eindNodeTreinrit = treinRitE;

        System.out.println(reistTeinrit1.bestRoute(eindNodeRit, graphTreinrit.calculateShortestPathFromSource(graphTreinrit, beginNodeRit), beginNodeRit));


//
//        Node vluchtA = new Node("A");
//        Node vluchtB = new Node("B");
//        Node vluchtC = new Node("C");
//        Node vluchtD = new Node("D");
//        Node vluchtE = new Node("E");
//        Node vluchtF = new Node("F");
//
//        Stap vluchtAB = new Vlucht(vluchtB, 10);
//        Stap vluchtAC = new Vlucht(vluchtC, 15);
//
//        Stap vluchtBD = new Vlucht(vluchtD, 12);
//        Stap vluchtBF = new Vlucht(vluchtF, 15);
//
//        Stap vluchtCE = new Vlucht(vluchtE, 10);
//
//        Stap vluchtDE = new Vlucht(vluchtE, 2);
//        Stap vluchtDF = new Vlucht(vluchtF, 1);
//
//        Stap vluchtFE = new Vlucht(vluchtE, 5);
//
//        vluchtA.addDestination(vluchtAB);
//        vluchtA.addDestination(vluchtAC);
//
//        vluchtB.addDestination(vluchtBD);
//        vluchtB.addDestination(vluchtBF);
//
//        vluchtC.addDestination(vluchtCE);
//
//        vluchtD.addDestination(vluchtDE);
//        vluchtD.addDestination(vluchtDF);
//
//        vluchtF.addDestination(vluchtFE);
//
//        Graph graphVlucht = new Graph();
//
//        graphVlucht.addNode(vluchtA);
//        graphVlucht.addNode(vluchtB);
//        graphVlucht.addNode(vluchtC);
//        graphVlucht.addNode(vluchtD);
//        graphVlucht.addNode(vluchtE);
//        graphVlucht.addNode(vluchtF);
//
//        Reis reisVlucht1 = new Reis("Vlucht");
//        Node beginNodeVlucht = vluchtA;
//        Node eindNodeVlucht = vluchtE;
//
//        System.out.println(reisVlucht1.bestRoute(eindNodeRit, graphVlucht.calculateShortestPathFromSource(graphVlucht, beginNodeRit), beginNodeRit));
    }
}