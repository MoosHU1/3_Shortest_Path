public class Stap{

    private Node start;
    private Node end;
    private float weight;


    public Stap(Node bgn, Node nd){
        start = bgn;
        end= nd;


    }

    public void setstart(Node start) {
        this.start = start;
    }

    public void setend(Node end) {
        this.end = end;
    }

    public Node getstart() {
        return start;
    }

    public Node getend() {
        return end;
    }

    public String stapToString() {
        return (start.getName() + " naar " + end.getName());

    }


}
