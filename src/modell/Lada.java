package modell;

public class Lada {
    public static String TALALT = "talált";
    public static String MELLE = "mellé";
    public static String HELYES = "arany";

    private String[] ladak;
    
    int[] poziciok;
    
    public Lada(String[] ladak) {
        this.ladak = ladak;
    }
    
    public static String tippEllenorzes(String tipp) {
        if (tipp.equals(HELYES))
            return TALALT;
        else
            return MELLE;
    }
    
}
