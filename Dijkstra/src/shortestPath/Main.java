package shortestPath;

public class Main {
    public static void main(String[] arg) {

        Node ritA = new Node("A");
        Node ritB = new Node("B");
        Node ritC = new Node("C");
        Node ritD = new Node("D");
        Node ritE = new Node("E");
        Node ritF = new Node("F");

        //10 is dit geval het aantal kilometers.
        //ook zet ik hier mijn connecties. In dit geval kun je dus van A naar B en C.
        Stap ritAB = new Rit(ritB, 10);
        Stap ritAC = new Rit(ritC, 15);

        Stap ritBD = new Rit(ritD, 12);
        Stap ritBF = new Rit(ritF, 15);

        Stap ritCE = new Rit(ritE, 10);

        Stap ritDE = new Rit(ritE, 2);
        Stap ritDF = new Rit(ritF, 1);

        Stap ritFE = new Rit(ritE, 5);

        //hier zet ik ik Node de waardes van de connecties met de afstanden daarvan
        ritA.addDestination(ritAB);
        ritA.addDestination(ritAC);

        ritB.addDestination(ritBD);
        ritB.addDestination(ritBF);

        ritC.addDestination(ritCE);

        ritD.addDestination(ritDE);
        ritD.addDestination(ritDF);

        ritF.addDestination(ritFE);

        //hier maak ik een lege graph aan met alle tot nu toe bestaande nodes, dus ook met alle verbindingen.
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

        //hierboven kun je het beginpunt kiezen en het eindpunten. Hier onder zal dan de kortste route voor je uitgerekend worden en uitgeprint.
        System.out.println(reisRit1.bestRoute(eindNodeRit, graphRit.calculateShortestPathFromSource(graphRit, beginNodeRit), beginNodeRit));
        System.out.println("");


        Node treinRitA = new Node("Breda");
        Node treinRitB = new Node("Roosendaal");
        Node treinRitC = new Node("Eindhoven");
        Node treinRitD = new Node("Bergen-op-zoom");
        Node treinRitE = new Node("Tilburg");
        Node treinRitF = new Node("Kielegat");

        //mn is het aantal minuten. 20 is in dit geval dus het aantal minuten van a naar b.
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

        System.out.println(reistTeinrit1.bestRoute(eindNodeTreinrit, graphTreinrit.calculateShortestPathFromSource(graphTreinrit, beginNodeTreinrit), beginNodeTreinrit));
        System.out.println("");



        Node vluchtA = new Node("Schiphol");
        Node vluchtB = new Node("Suvarnabhumi");
        Node vluchtC = new Node("Luchthaven Antwerpen");
        Node vluchtD = new Node("Luchthaven Eindhoven");
        Node vluchtE = new Node("Carcassonne");
        Node vluchtF = new Node("Stockholm-Arlanda");

        //bij vlucht ab is 200 de prijs van de vlucht en de 5 is vijf procent kans dat je bagage kwijt raakt. Aangezien ik de prrijs van de vlucht belangrijker vind dan de bagage heb ik de kans dat je bagage kwijtraakt gedeeld door 2 gedaan. Zo word de prijs een belangrijkere factor.

        Stap vluchtAB = new Vlucht(vluchtB, 200 * (5 / 2));
        Stap vluchtAC = new Vlucht(vluchtC, 185 * (8 / 2));

        Stap vluchtBD = new Vlucht(vluchtD, 126 * (14 / 2));
        Stap vluchtBF = new Vlucht(vluchtF, 75 * (33 / 2));

        Stap vluchtCE = new Vlucht(vluchtE, 99 * (27 / 2));

        Stap vluchtDE = new Vlucht(vluchtE, 72 * (39 / 2));
        Stap vluchtDF = new Vlucht(vluchtF, 113 * (19 / 2));

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

        Reis reisVlucht1 = new Reis("Vlucht");
        Node beginNodeVlucht = vluchtA;
        Node eindNodeVlucht = vluchtE;

        System.out.println(reisVlucht1.bestRoute(eindNodeVlucht, graphVlucht.calculateShortestPathFromSource(graphVlucht, beginNodeVlucht), beginNodeVlucht));
    }
}