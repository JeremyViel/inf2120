public class Couleur {
    private int rouge;
    private int vert;
    private int bleu;


    public Couleur(int rouge, int vert, int bleu) {
        this.rouge = rouge;
        this.vert = vert;
        this.bleu = bleu;
    }

    @Override
    public String toString() {
        return "Couleur{" +
                "rouge=" + rouge +
                ", vert=" + vert +
                ", bleu=" + bleu +
                '}';
    }

    public void setRouge(int rouge) {
        if (rouge>=0 && rouge<=255) {
            this.rouge = rouge;
        }
    }

    public void setVert(int vert) {
        if (vert>=0 && vert<=255) {
            this.vert = vert;
        }
    }

    public void setBleu(int bleu) {
        if (vert>=0 && vert<=255) {
            this.bleu = bleu;
        }
    }

    public int getRouge() {
        return rouge;
    }

    public int getVert() {
        return vert;
    }

    public int getBleu() {
        return bleu;
    }

    public static void main( String [] args ) {
        Couleur c1 = new Couleur( 1, 4, 6 );
        Couleur c2 = c1;
        System.out.println( c2.toString() );
        c2.setRouge( 100 );
        System.out.println( c1.toString() );
        System.out.println( c2.toString() );
        c1.blanchir();
        System.out.println( c1.toString() );
        System.out.println( c2.toString() );
    }

    private void blanchir() {
        this.rouge = (this.rouge + 255) / 2;
        this.vert = (this.vert +255) / 2;
        this.bleu = (this.bleu + 255) / 2;
    }
}
