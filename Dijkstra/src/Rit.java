
import java.util.HashMap;

public class Rit extends Stap {
    public int KM;

    public Rit(Node cls, int akm) {
        this.KM = akm;
        this.eind = cls;
    }

    public int getKM() {
        return KM;
    }

    //    public Integer getKM()
//
//    public HashMap<Stap, Integer> doorsturen() {
//        node_distance.put(eind, KM);
//        return node_distance;
//    }

    public String toString() {
        return "afstand km: " + KM;
    }
}
