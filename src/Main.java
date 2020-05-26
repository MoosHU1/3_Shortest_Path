import java.util.*;
public class Main {


    public static void main(String arg[]){
        List<Node> Nodes= new ArrayList<Node>();
        Node nodeA = new Node("A");
        Nodes.add(nodeA);
        Node nodeB = new Node("B");
        Nodes.add(nodeB);
        Node nodeC = new Node("C");
        Nodes.add(nodeC);
        Node nodeD = new Node("D");
        Nodes.add(nodeD);
        Node nodeE = new Node("E");
        Nodes.add(nodeE);
        Node nodeF = new Node("F");
        Nodes.add(nodeF);



        nodeA.addDestination(nodeB, 10);
        nodeA.addDestination(nodeC, 15);

        nodeB.addDestination(nodeD, 12);
        nodeB.addDestination(nodeF, 15);

        nodeC.addDestination(nodeE, 10);

        nodeD.addDestination(nodeE, 2);
        nodeD.addDestination(nodeF, 1);

        nodeF.addDestination(nodeE, 5);

        Graph graph = new Graph();

        graph.addNode(nodeA);
        graph.addNode(nodeB);
        graph.addNode(nodeC);
        graph.addNode(nodeD);
        graph.addNode(nodeE);
        graph.addNode(nodeF);

        //Geef hier het beginpunt aan
        Node beginpunt = nodeA;
        graph = Dijkstra.calculateShortestPathFromSource(graph, beginpunt);

        //Geef hier de bestemming aan
        Node bestemming = nodeF;





    }


}
