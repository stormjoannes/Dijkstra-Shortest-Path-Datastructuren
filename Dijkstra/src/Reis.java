import java.util.HashSet;
import java.util.Set;

public class Reis extends Graph {
    private String soortReis;

    public Set<String> bestRoute(Node eindNode,Graph graph,Node beginNode) {
        graph = graph.calculateShortestPathFromSource(graph, beginNode);
        Set<String> done = new HashSet<>();
        for (Node i : eindNode.getShortestPath()) {
            done.add(i.getName());
        }
        return done;
    }
}
