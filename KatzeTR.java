<<<<<<< HEAD

/**
 * Beschreiben Sie hier die Klasse KatzeTR.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class KatzeTR
{
    // Attribute
    String name; 
    int groesse;
    int gewicht;

    /**
     * Konstruktor für Objekte der Klasse KatzeTR
     */
    public KatzeTR()
    { 
        name = "Vinny";
        groesse = 6; 
        gewicht = 4;
    }

    // weitere Methoden
     public KatzeTR(String naNeu, int grNeu, int geNeu)
    {
        name = naNeu;
        groesse = grNeu;
        gewicht = geNeu;
    }

    public void setzeName(String s) { name = s; }

    public void setzeGroesse(int i) { groesse = i; }

    public void setzeGewicht(int i) { gewicht = i; }

    public String gibName() { return name; }

    public int gibGroesse() { return groesse; } 

    public int gibgewicht() { return gewicht; }

    public String gibLaut() { return "Mau"; }

}





public class KatzeTR
{
    String name;
    int groesse;
    int gewicht;

    public KatzeTR()
    {
        name = "Mathilda";
        groesse = 5;
        gewicht = 7;
    }

    public KatzeTR(String naNeu, int grNeu, int geNeu)
    {
        name = naNeu;
        groesse = grNeu;
        gewicht = geNeu;
    }

    public void setzeName(String s) { name = s; }

    public void setzeGroesse(int i) { groesse = i; }

    public void setzeGewicht(int i) { gewicht = i; }

    public String gibName() { return name; }

    public int gibGroesse() { return groesse; } 

    public int gibgewicht() { return gewicht; }

    public String gibLaut() { return "meow"; }

}
>>>>>>> 006aca3

