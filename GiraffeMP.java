
/**
 * Beschreiben Sie hier die Klasse GiraffeMP.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class GiraffeMP extends Tier
{
    // Attribute
    String name;
    int groesse;
    int gewicht;

    /**
     * Konstruktor für Objekte der Klasse GiraffeMP
     */
    public GiraffeMP()
    {
        name = "Berta";
        groesse = 10;
        gewicht = 8;
    }
    public GiraffeMP(String naNeu, int grNeu, int geNeu)
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
        return "Raschel"; 
    }
    // weitere Methoden




}
