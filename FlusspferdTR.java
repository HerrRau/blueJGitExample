
/**
 * Beschreiben Sie hier die Klasse Flusspferd.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class FlusspferdTR
{
    // Attribute
    String name;
    int laenge;
    int gewicht;

    /**
     * Konstruktor für Objekte der Klasse Flusspferd
     */
    public FlusspferdTR()
    {
        name = "Freddy";
        laenge = 5;
        gewicht = 300;
        
        
    }

    // weitere Methoden
    public FlusspferdTR(String naNeu, int laNeu, int geNeu)
    {
        name = naNeu;
        laenge = laNeu;
        gewicht = geNeu;
        
    }
    public void setzeName(String s) { name = s; }

    public void setzeLaenge(int i) { laenge = i; }

    public void setzeGewicht(int i) { gewicht = i; }

    public String gibName() { return name; }

    public int gibLaenge() { return laenge; } 

    public int gibgewicht() { return gewicht; }

    public String gibLaut() { return "Roaaaa"; }





}
