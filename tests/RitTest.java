import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RitTest {

    @Test
    void compareTo() {
        List<Node> NodesAuto= new ArrayList<Node>();
        Node Amsterdam = new Node("Amsterdam");
        Node DenHaag = new Node("Den Haag");
        Node Utrecht = new Node("Utrecht");
        Node Enschede = new Node("Enschede");
        Node Schagen = new Node("Schagen");
        Node Rotterdam = new Node("Rotterdam");

        Amsterdam.addDestination(DenHaag, 10);
        Amsterdam.addDestination(Utrecht, 15);

        DenHaag.addDestination(Enschede, 10);
        DenHaag.addDestination(Rotterdam, 15);

        Utrecht.addDestination(Schagen, 10);

        Enschede.addDestination(Schagen, 2);
        Enschede.addDestination(Rotterdam, 1);

        Rotterdam.addDestination(Schagen, 5);

        Graph graphAuto = new Graph();

        graphAuto.addNode(Amsterdam);
        graphAuto.addNode(DenHaag);
        graphAuto.addNode(Utrecht);
        graphAuto.addNode(Enschede);
        graphAuto.addNode(Schagen);
        graphAuto.addNode(Rotterdam);

        //Geef hier het beginpunt aan
        Node beginpunt = Amsterdam;
        graphAuto = Dijkstra.calculateShortestPathFromSource(graphAuto, beginpunt);


        //Geef hier de bestemming aan
        Node bestemming = Rotterdam;

        List<Node> route = bestemming.getShortestPath();
        Stap stap1Auto = new Stap(route.get(0), route.get(1));
        Stap stap2Auto = new Stap(route.get(1), route.get(2));
        Stap stap3Auto = new Stap(route.get(2), bestemming);

        ArrayList<Stap> stappen1 = new ArrayList<Stap>();
        stappen1.add(stap1Auto);
        stappen1.add(stap2Auto);
        stappen1.add(stap3Auto);


        Rit r1 = new Rit(bestemming.getDistance(), beginpunt, bestemming, stappen1, "Auto");
        Rit r2 = new Rit(5, beginpunt, bestemming, stappen1, "Auto");


        assertEquals(1, r1.compareTo(r2));

    }
}