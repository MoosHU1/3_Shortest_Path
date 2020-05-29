import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class VluchtTest {

    @org.junit.jupiter.api.Test
    void compareTo() {
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


        //Geef hier de bestemming aan
        Node bestemmingVliegtuig = Parijs;




        List<Node> routeVliegtuig = bestemmingVliegtuig.getShortestPath();
        Stap stap1Vliegtuig = new Stap(routeVliegtuig.get(0), routeVliegtuig.get(1));
        Stap stap2Vliegtuig = new Stap(routeVliegtuig.get(1), routeVliegtuig.get(2));
        Stap stap3Vliegtuig = new Stap(routeVliegtuig.get(2), bestemmingVliegtuig);

        ArrayList<Stap> stappenVliegtuig = new ArrayList<Stap>();
        stappenVliegtuig.add(stap1Vliegtuig);
        stappenVliegtuig.add(stap2Vliegtuig);
        stappenVliegtuig.add(stap3Vliegtuig);


        Vlucht r2 = new Vlucht(10, beginpuntVliegtuig, bestemmingVliegtuig, stappenVliegtuig, "Vliegtuig");
        Vlucht r3 = new Vlucht(3, beginpuntVliegtuig, bestemmingVliegtuig, stappenVliegtuig, "Vliegtuig");


        assertEquals(1, r2.compareTo(r3));
    }
}