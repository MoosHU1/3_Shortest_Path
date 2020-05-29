import java.util.*;
public class Main {


    public static void main(String arg[]){
        //Auto
        List<Node> NodesAuto= new ArrayList<Node>();
        Node Amsterdam = new Node("Amsterdam");
        NodesAuto.add(Amsterdam);
        Node DenHaag = new Node("Den Haag");
        NodesAuto.add(DenHaag);
        Node Utrecht = new Node("Utrecht");
        NodesAuto.add(Utrecht);
        Node Enschede = new Node("Enschede");
        NodesAuto.add(Enschede);
        Node Schagen = new Node("Schagen");
        NodesAuto.add(Schagen);
        Node Rotterdam = new Node("Rotterdam");
        NodesAuto.add(Rotterdam);


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
        System.out.println(r1.toString());

        //Vliegtuig
        List<Node> NodesVliegtuig= new ArrayList<Node>();
        Node NewYork = new Node("New York");
        NodesAuto.add(NewYork);
        Node Tokio = new Node("Tokio");
        NodesAuto.add(Tokio);
        Node LosAngeles = new Node("Los Angeles");
        NodesAuto.add(LosAngeles);
        Node Istanbul = new Node("Istanbul");
        NodesAuto.add(Istanbul);
        Node Parijs = new Node("Parijs");
        NodesAuto.add(Parijs);


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
        graphAuto = Dijkstra.calculateShortestPathFromSource(graphAuto, beginpuntVliegtuig);


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


        Vlucht r2 = new Vlucht(bestemming.getDistance(), beginpuntVliegtuig, bestemmingVliegtuig, stappenVliegtuig, "Vliegtuig");
        System.out.println(r2 .toString());




        






    }


}
