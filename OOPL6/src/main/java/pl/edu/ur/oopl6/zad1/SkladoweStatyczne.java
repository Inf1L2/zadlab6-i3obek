package pl.edu.ur.oopl6.zad1;

public class SkladoweStatyczne {

    public static void main(String[] args) {
        // TODO zad 3

        System.out.println(Figury.PoleKola(0.5));
        System.out.println(Figury.ObwodKola(0.5));
        System.out.println(Figury.PoleKwadrat(0.75));
        System.out.println(Figury.ObwodKwadrat(0.75));
        System.out.println(Figury.PoleProstokat(0.75,0.75));
        System.out.println(Figury.ObwodProstokat(0.75,0.85));
        System.out.println(Figury.PoleStozek(2.25,3.33));
        System.out.println(Figury.ObjetoscStozek(2.25,3.33,5.55));
        System.out.println(Figury.PoleWalec(2.22,4.44));
        System.out.println(Figury.ObjetoscWalec(7.77,6.13));
    }

}