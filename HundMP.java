/**
 * Beschreiben Sie hier die Klasse GiraffeMP.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class HundMP
{
    // Attribute
    String name;
    int groesse;
    int gewicht;

    /**
     * Konstruktor für Objekte der Klasse GiraffeMP
     */
    public HundMP()
    {
        name = "Bello";
        groesse = 3;
        gewicht = 2;
    }
    public HundMP(String naNeu, int grNeu, int geNeu)
    {
        name = naNeu;
        groesse = grNeu;
        gewicht = geNeu;
    }
    public void setzeName(String s)
    { 
        name = s; 
    }

    public void setzeGroesse(int i) 
    { 
        groesse = i; 
    }

    public void setzeGewicht(int i) 
    { 
        gewicht = i; 
    }

    public String gibName()
    {
        return name; 
    }

    public int gibGroesse() 
    {
        return groesse; 
    } 

    public int gibgewicht() 
    { 
        return gewicht; 
    }

    public String gibLaut() 
    { 
        return "Wuff"; 
    }
    // weitere Methoden




}