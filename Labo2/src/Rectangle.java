public class Rectangle extends Forme2D {
    public int hauteur;
    public int largeur;

    public Rectangle(int hauteur, int largeur) {
        this.hauteur = hauteur;
        this.largeur = largeur;
    }

    @Override
    public double calculAire() {
        return hauteur*largeur;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "hauteur=" + hauteur +
                ", largeur=" + largeur +
                '}';
    }
}
