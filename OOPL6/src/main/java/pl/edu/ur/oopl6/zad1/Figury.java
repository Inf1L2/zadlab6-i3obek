package pl.edu.ur.oopl6.zad1;

public class Figury {

    /**
     * Inicjalizator statyczny
     */
    static {
        System.out.println("Biblioteka obliczająca wielkość figur geometrycznych!!!");
    }

    /**
     * Metoda statyczna obliczająca pole koła
     */
    public static double PoleKola(double r){
        return Math.PI*Math.pow(r,2);
    }

    /**
     * Metoda statyczna obliczająca obwód koła
     */
    public static double ObwodKola(double r){
        return 2*Math.PI*r;
    }

    /**
     * Metoda statyczna obliczająca pole kwadratu
     */
    public static double PoleKwadrat(double a){
        return a*a;
    }

    /**
     * Metoda statyczna obliczająca obwód kwadratu
     */
    public static double ObwodKwadrat(double a){
        return 4*a;
    }

    /**
     * Metoda statyczna obliczająca pole prostokątu
     */
    public static double PoleProstokat(double a,double b){
        return a*b;
    }

    /**
     * Metoda statyczna obliczająca obwód prostokątu
     */
    public static double ObwodProstokat(double a,double b) {
        return 2*(a+b);
    }

    /**
     * Metoda statyczna obliczająca pole stożka
     */
    public static double PoleStozek(double r,double l){
        return Math.PI*r*(r+l);
    }

    /**
     * Metoda statyczna obliczająca obwód Stożka
     */
    public static double ObjetoscStozek(double r,double l,double h){
        return (1/3)*Math.PI*r*r*h;
    }

    /**
     * Metoda statyczna obliczająca pole walca
     */
    public static double PoleWalec(double r,double h){
        return (2*Math.PI*r*r)+(2*Math.PI*r*h);
    }

    /**
     * Metoda statyczna obliczająca obwód walca
     */
    public static double ObjetoscWalec(double r,double h){
        return Math.PI*r*r*h;
    }

}