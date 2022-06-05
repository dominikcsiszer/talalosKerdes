package modell;

public class Lada {
    public static String TALALT = "talált";
    public static String MELLE = "mellé";
    public static String HELYES = "A";
    public static String ARANY_LADA = "Arany láda";
    public static String EZUST_LADA = "Ezüst láda";
    public static String BRONZ_LADA = "Bronz láda";

    private String nev;
    private String leiras;
    
    public Lada(String nev, String leiras) {
        this.nev = nev;
        this.leiras = leiras;
    }
    
    public static String tippEllenorzes(String tipp) {
        if (tipp.equals(HELYES))
            return TALALT;
        else
            return MELLE;
    }

    @Override
    public String toString() {
        return leiras;
    }
    
    public String getLeiras() {
        return leiras;
    }
    
    
    
}
