package shortestPath;

import shortestPath.Graph;
import shortestPath.Node;

import java.util.HashSet;
import java.util.Set;

public class Reis extends Graph {
    private String soortReis;

    public Reis(String soortReis) {
        this.soortReis = soortReis;
        if (soortReis == "Rit") {
            System.out.println("De kortste " + soortReis + " is:");
        } else if (soortReis == "Treinrit") {
            System.out.println("De snelste " + soortReis + " is:");
        } else if (soortReis == "Vlucht") {
            System.out.println("De goedkoopste en meest veilig voor je bagage route " + soortReis + " is:");
        }
    }

    public Set<String> bestRoute(Node eindNode, Graph graph, Node beginNode) {
        graph = graph.calculateShortestPathFromSource(graph, beginNode);
        Set<String> done = new HashSet<>();
        for (Node i : eindNode.getShortestPath()) {
            done.add(i.getName());
        }
        return done;
    }
}
