package pl.edu.ur.oopl6.zad3;

import java.util.*;

public class Complex {
    double re,im;

    public Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public Complex(double x){
        re = x;
        im = 0.0;
    }

    public static Complex modul(Complex c) {
        return new Complex(Math.hypot(c.re,c.im));
    }

    public static Complex sumaA(Complex c1,Complex c2){
        return new Complex(c1.re+c2.re,c1.im+c2.im);
    }

    public static Complex sumaW(){
        return new Complex(0);
    }

    public static Complex roznicaA(Complex c1,Complex c2){
        return new Complex(c1.re-c2.re,c1.im-c2.im);
    }

    public static Complex iloczynA(Complex c1,Complex c2){
        return new Complex((c1.re*c2.re)-(c1.im*c2.im),(c1.re*c2.im)+(c1.im*c2.re));
    }

    public static Complex ilorazA(Complex c1,Complex c2){
        return new Complex((c1.re*c2.re+c1.im*c2.im)/(c2.re*c2.re+c2.im*c2.im),(c1.im*c2.re-c1.re*c2.im)/(c2.re*c2.re+c2.im*c2.im));
    }

    public static Complex ilorazW(){
        return new Complex(0);
    }

    @Override
    public String toString() {
        return "{" +
                "re=" + re +
                ", im=" + im +
                "i }";
    }

    public static void main(String [] argv){
        Complex c1 = new Complex(5,7);
        Complex c2 = new Complex(2,3);

        System.out.println("\nModuł z\t"+c1+"\t= "+modul(c1));
        System.out.println("Suma\t"+c1+"\toraz\t"+c2+"\t= "+sumaA(c1,c2));
        System.out.println("Różnica\t"+c1+"\toraz\t"+c2+"\t= "+roznicaA(c1,c2));
        System.out.println("Iloczyn\t"+c1+"\toraz\t"+c2+"\t= "+iloczynA(c1,c2));
        System.out.println("Iloraz\t"+c1+"\toraz\t"+c2+"\t= "+ilorazA(c1,c2));
    }
}
