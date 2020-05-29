import java.util.List;

public class Vlucht extends Reis {
    float cost;

    public Vlucht(float cst, Node bgn, Node best, List<Stap> stpn, String typ){
        super(bgn, best, stpn, typ);
        cost = cst;

    }


    public int compareTo(Vlucht other){
        return Float.compare(this.cost, other.cost);

    }


    @Override
    public String toString() {
        return "Reis{" +
                "begin=" + getBegin().getName() +
                ", bestemming=" + getBestemming().getName() +
                ", stappen=" + getStappenString() +
                ", Vervoer='" + getType() + '\'' +
                ", Kosten='" + cost + '\'' +
                '}';
    }


}
