package modell;

public class Palya {
    public static final int PALYA_HOSSZ = 3;
    private static final char[] PALYA_JEL = new char[]{'A', 'E', 'B'};
    private static final char TALALT_JEL = 'X';
    private static final char MELLE_JEL = 'O';
    
    private char[] palya;
    private Lada lada;

    public Palya() {
        palyaLetrehoz();
    }

    private void palyaLetrehoz() {
        palya = new char[PALYA_HOSSZ];
        for (int i = 0; i < PALYA_HOSSZ; i++) 
            palya[i] = PALYA_JEL[i];
        
        lada = new Lada(new String[]{"Arany", "Ezüst", "Bronz"});
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
    
}
