package shortestPath;

import shortestPath.Node;
import shortestPath.Stap;

public class Vlucht extends Stap {
    public int euro;

    public Vlucht(Node cls, int akm) {
        this.euro = akm;
        this.eind = cls;
    }

    public int getKM() {
        return euro;
    }

    public void setEuro(int euro) {
        this.euro = euro;
    }

    public String toString() {
        return "afstand km: " + euro;
    }
}
