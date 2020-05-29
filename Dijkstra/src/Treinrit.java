public class Treinrit extends Stap{
    public int Min;

    public Treinrit(Node cls, int akm) {
        this.Min = akm;
        this.eind = cls;
    }

    public int getKM() {
        return Min;
    }

    public String toString() {
        return "Tijd in Minuten: " + Min;
    }
}
