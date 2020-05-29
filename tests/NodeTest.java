import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NodeTest {

    @Test
    void getDistance() {
        List<Node> NodesAuto= new ArrayList<Node>();
        Node Amsterdam = new Node("Amsterdam");
        Node DenHaag = new Node("Den Haag");
        Node Utrecht = new Node("Utrecht");

        Amsterdam.addDestination(DenHaag, 10);
        Amsterdam.addDestination(Utrecht, 15);

        Graph graphAuto = new Graph();

        graphAuto.addNode(Amsterdam);
        graphAuto.addNode(DenHaag);
        graphAuto.addNode(Utrecht);

        //Geef hier het beginpunt aan
        Node beginpunt = Amsterdam;
        graphAuto = Dijkstra.calculateShortestPathFromSource(graphAuto, beginpunt);
        assertEquals(10, DenHaag.getDistance());


    }
}