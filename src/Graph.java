import java.util.*;
public class Graph {

    private Set<Node> nodes = new HashSet<>();

    public void addNode(Node nodeA) {
        nodes.add(nodeA);
    }

    // getters and setters

    public Set<Node> getNodes() {
        return nodes;
    }

}