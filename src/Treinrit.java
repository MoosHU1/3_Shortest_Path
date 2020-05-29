import java.util.List;

public class Treinrit extends Reis {
    float time;

    public Treinrit(float tm, Node bgn, Node best, List<Stap> stpn, String typ){
        super(bgn, best, stpn, typ);
        time = tm;

    }

    public int compareTo(Treinrit other){
        return Float.compare(this.time, other.time);

    }

    @Override
    public String toString() {
        return "Reis{" +
                "begin=" + getBegin().getName() +
                ", bestemming=" + getBestemming().getName() +
                ", stappen=" + getStappenString() +
                ", Vervoer='" + getType() + '\'' +
                ", Tijd='" + time + '\'' +
                '}';
    }


}
