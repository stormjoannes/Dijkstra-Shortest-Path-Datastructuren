package shortestPath;

public class Vlucht extends Stap {
    public int euro;

    public Vlucht(Node cls, int eu) {
        this.eind = cls;
        this.euro = eu;
    }

    public int getValue() {
        return euro;
    }

    public void setEuro(int euro) {
        this.euro = euro;
    }

    public String toString() {
        return "afstand km: " + euro;
    }
}
