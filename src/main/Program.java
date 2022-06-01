package main;

import modell.Lada;
import modell.Palya;

public class Program {

    public static void main(String[] args) {
        Palya p = new Palya();
        System.out.println(p.getPalya());
        p.tipp(Lada.HELYES);
        System.out.println(p.getPalya());
        p.tipp("Arany láda");
        System.out.println(p.getPalya());
    }
    
}
