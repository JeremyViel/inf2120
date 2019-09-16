public class Principale {

    public static void main(String [] args){
        Bien tab[] = new Bien[3];
        tab[0] = new Livre(10);
        tab[1] = new Meuble(10);
        tab[2] = new Legume(10);
        System.out.println(facture(tab));
    }

    public static double facture(Bien tab[]) {
        double prixFinal = 0;
        for(int i = 0; i<tab.length; i++){
            prixFinal = prixFinal + tab[i].prix();
        }
        return prixFinal;
    }
}
