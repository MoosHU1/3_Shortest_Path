import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DijkstraTest {

    @Test
    void calculateShortestPathFromSource() {
        List<Node> NodesVliegtuig= new ArrayList<Node>();
        Node NewYork = new Node("New York");
        Node Tokio = new Node("Tokio");
        Node LosAngeles = new Node("Los Angeles");
        Node Istanbul = new Node("Istanbul");
        Node Parijs = new Node("Parijs");

        NewYork.addDestination(Tokio, 5);
        NewYork.addDestination(Istanbul, 3);

        Tokio.addDestination(Parijs, 15);
        Tokio.addDestination(LosAngeles , 10);
        Tokio.addDestination(Istanbul , 5);

        Istanbul.addDestination(LosAngeles, 2);

        LosAngeles.addDestination(Parijs, 3);


        Graph graphVliegtuig = new Graph();

        graphVliegtuig.addNode(NewYork);
        graphVliegtuig.addNode(Tokio);
        graphVliegtuig.addNode(LosAngeles);
        graphVliegtuig.addNode(Istanbul);
        graphVliegtuig.addNode(Parijs);

        //Geef hier het beginpunt aan
        Node beginpuntVliegtuig = NewYork;
        graphVliegtuig = Dijkstra.calculateShortestPathFromSource(graphVliegtuig, beginpuntVliegtuig);
        assertEquals(5, LosAngeles.getWeight());


    }


}