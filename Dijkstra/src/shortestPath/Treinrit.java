package shortestPath;

public class Treinrit extends Stap {
    public int Min;

    public Treinrit(Node cls, int mn) {
        this.Min = mn;
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
