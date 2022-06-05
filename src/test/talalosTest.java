package test;

import modell.Lada;
import modell.Palya;

public class talalosTest {

    public static void main(String[] args) {
        Palya p = new Palya();
        
        /* Tippelés helyesen */
        System.out.println(p.getPalya());
        p.tipp(Lada.HELYES);
        
        /* Tippelés elrontva, akkor úgy adja vissza mintha hibásan tippeltünk volna. */
        System.out.println(p.getPalya());
        p.tipp("Arany láda");
        System.out.println(p.getPalya());
    }
}