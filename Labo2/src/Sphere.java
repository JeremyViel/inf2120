public class Sphere extends Forme3D {

    public int rayon;

    public Sphere(int rayon) {
        this.rayon = rayon;
    }

    @Override
    public double calculVolume() {
        return (4*Math.PI)/(rayon*rayon*rayon);
    }

    @Override
    public String toString() {
        return "Sphere{" +
                "rayon=" + rayon +
                '}';
    }
}
