package modell;

public class Palya {
    public static final int PALYA_HOSSZ = 3;
    private static final char[] PALYA_JEL = new char[]{'A', 'E', 'B'};
    private static final char TALALT_JEL = 'X';
    private static final char MELLE_JEL = 'O';
    
    private char[] palya;
    // Rossz megoldás
    private Lada aranyLada;
    private Lada ezustLada;
    private Lada bronzLada;

    public Palya() {
        palyaLetrehoz();
    }

    private void palyaLetrehoz() {
        palya = new char[PALYA_HOSSZ];
        for (int i = 0; i < PALYA_HOSSZ; i++) 
            palya[i] = PALYA_JEL[i];
        
        // Rossz megoldás
        aranyLada = new Lada(Lada.ARANY_LADA, "Én rejtem a kincset");
        ezustLada = new Lada(Lada.EZUST_LADA, "Nem én rejtem a kincset");
        bronzLada = new Lada(Lada.BRONZ_LADA, "Az arany láda hazudik");
    }
    
    public void tipp(String tipp) {
        if(Lada.tippEllenorzes(tipp).equals(Lada.TALALT)) 
            palya[0] = TALALT_JEL;
        else
            palya[0] = MELLE_JEL;
    }
    
    /* Getter Setterek */
    public char[] getPalya() {
        return palya;
    }
    public String getAranyLada() {
        return aranyLada.getLeiras();
    }
    public String getEzustLada() {
        return ezustLada.getLeiras();
    }
    public String getBronzLada() {
        return bronzLada.getLeiras();
    }
    
}
