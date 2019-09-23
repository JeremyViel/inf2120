public class Principale {

    public static void main(String args[]) {
        Cercle a = new Cercle(2);
        System.out.println(a.toString());
        System.out.println(a.calculAire());

        Rectangle b = new Rectangle(2,3);
        System.out.println(b.toString());
        System.out.println(b.calculAire());

        Sphere c = new Sphere(2);
        System.out.println(c.toString());
        System.out.println(c.calculVolume());

        CylindreDroit d = new CylindreDroit(b, 3);
        System.out.println(d.toString());
        System.out.println(d.calculVolume());
    }
}
