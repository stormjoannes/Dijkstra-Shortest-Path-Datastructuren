package shortestPath;

public class Rit extends Stap {
    public int KM;

    public Rit(Node cls, int akm) {
        this.KM = akm;
        this.eind = cls;
    }

    public int getValue() {
        return KM;
    }

    public void setKM(int KM) {
        this.KM = KM;
    }

    public String toString() {
        return "afstand km: " + KM;
    }
}
