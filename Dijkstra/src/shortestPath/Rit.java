package shortestPath;

import shortestPath.Node;

public class Rit extends Stap {
    public int KM;

    public Rit(Node cls, int akm) {
        this.KM = akm;
        this.eind = cls;
    }

    public int getKM() {
        return KM;
    }

    public String toString() {
        return "afstand km: " + KM;
    }
}
