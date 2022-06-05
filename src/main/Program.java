package main;

import modell.Lada;
import modell.Palya;
import view.talalosGUI;

public class Program {

    public static void main(String[] args) {
        /*
        Palya p = new Palya();
        System.out.println(p.getPalya());
        p.tipp(Lada.HELYES);
        System.out.println(p.getPalya());
        p.tipp("Arany láda");
        System.out.println(p.getPalya());
        System.out.println(p.getAranyLada());
        System.out.println(p.getEzustLada());
        System.out.println(p.getBronzLada());
        */
        new talalosGUI().setVisible(true);
    }
    
}
