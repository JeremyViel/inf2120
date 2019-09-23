public class Cercle extends Forme2D {
    public int rayon;

    public Cercle(int rayon) {
        this.rayon = rayon;
    }

    @Override
    public String toString() {
        return "Cercle{" +
                "rayon=" + rayon +
                '}';
    }

    @Override
    public double calculAire() {
        return Math.PI*rayon*rayon;
    }
}
