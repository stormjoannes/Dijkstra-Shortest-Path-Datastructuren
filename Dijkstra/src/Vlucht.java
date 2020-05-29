public class Vlucht extends Stap{
    public int euro;

    public Vlucht(Node cls, int akm) {
        this.euro = akm;
        this.eind = cls;
    }

    public int getKM() {
        return euro;
    }

    public String toString() {
        return "afstand km: " + euro;
    }
}
