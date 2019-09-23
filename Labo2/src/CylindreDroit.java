public class CylindreDroit extends Forme3D {
    public Rectangle base;
    public int hauteur;

    public CylindreDroit(Rectangle base, int hauteur) {
        this.base = base;
        this.hauteur = hauteur;
    }

    @Override
    public String toString() {
        return "CylindreDroit{" +
                "base=" + base +
                ", hauteur=" + hauteur +
                '}';
    }

    @Override
    public double calculVolume() {
        return (base.hauteur*base.largeur)*hauteur;
    }
}
