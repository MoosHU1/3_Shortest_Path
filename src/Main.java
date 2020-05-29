import java.util.*;
public class Main {


    public static void main(String arg[]){
        //Auto
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


        Rit r1 = new Rit(bestemming.getWeight(), beginpunt, bestemming, stappen1, "Auto");
        System.out.println(r1.toString());

        //Vliegtuig
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

        Vlucht r2 = new Vlucht(bestemmingVliegtuig.getWeight(), beginpuntVliegtuig, bestemmingVliegtuig, stappenVliegtuig, "Vliegtuig");
        System.out.println(r2 .toString());

        //Compare
        Vlucht compareVoorbeeld = new Vlucht(5, beginpuntVliegtuig, bestemmingVliegtuig, stappenVliegtuig, "Vliegtuig");
        if (r2.compareTo(compareVoorbeeld) == 1){
            System.out.println("Rijs 2 is duurder dan rijs voorbeeld ");

        }
        else{
            System.out.println("Rijs 2 is goedkoper dan rijs voorbeeld ");
        }

        






    }


}
