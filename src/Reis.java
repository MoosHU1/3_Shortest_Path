import java.util.ArrayList;
import java.util.List;

public class Reis {
    private Node begin;
    private Node bestemming;
    private List<Stap> stappen;
    private String type;



    public Reis(Node bgn, Node best,List<Stap> stpn, String typ){
        begin = bgn;
        bestemming = best;
        stappen = stpn;
        type = typ;


    }



    public Node getBegin() {
        return begin;
    }

    public Node getBestemming() {
        return bestemming;
    }


    public List<Stap> getStappen() {

        return stappen;
    }

    public List<String> getStappenString() {
        List<String> stappenString =  new ArrayList<String>();
        for (Stap stap: getStappen()){
            String temp = stap.stapToString();
            stappenString.add(temp);
        }
        return stappenString;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {

        return "Reis{" +
                "begin=" + begin.getName() +
                ", bestemming=" + bestemming.getName() +
                ", stappen=" + getStappenString() +
                ", type='" + type + '\'' +
                ", weight'" + type + '\'' +
                '}';
    }
}



