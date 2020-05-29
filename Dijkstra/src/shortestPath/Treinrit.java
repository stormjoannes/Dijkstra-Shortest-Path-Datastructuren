package shortestPath;

import shortestPath.Node;
import shortestPath.Stap;

public class Treinrit extends Stap {
    public int Min;

    public Treinrit(Node cls, int akm) {
        this.Min = akm;
        this.eind = cls;
    }

    public int getValue() {
        return Min;
    }

    public void setMin(int min) {
        Min = min;
    }

    public String toString() {
        return "Tijd in Minuten: " + Min;
    }
}
