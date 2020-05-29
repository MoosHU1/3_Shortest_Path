import java.util.List;

public class Rit extends Reis{
    float kilometer;

    public Rit(float klm, Node bgn, Node best, List<Stap> stpn, String typ){
        super(bgn, best, stpn, typ);
        kilometer = klm;

    }

    public int compareTo(Rit other){
        return Float.compare(this.kilometer, other.kilometer);


    }

    @Override
    public String toString() {
        return "Reis{" +
                "begin=" + getBegin().getName() +
                ", bestemming=" + getBestemming().getName() +
                ", stappen=" + getStappenString() +
                ", type='" + getType() + '\'' +
                ", Kilometer='" + kilometer + '\'' +
                '}';
    }

}
