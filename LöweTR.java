
/**
 * Beschreiben Sie hier die Klasse LöweTR.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class LöweTR extends Tier
{
    // Attribute
    String Name;
    int Groesse;
    int Gewicht;

    
    public LöweTR()
    {  
        Name = "Claus";
        Groesse = 200;
        Gewicht = 250;
        
    }

    public LöweTR(String naNeu, int grNeu,int geNeu)

    { 
        Name = naNeu;
        Groesse = grNeu;
        Gewicht = geNeu;
        



    }
      public void setzeGewicht(int i) { 
        Gewicht = i; 
    }

       public String gibName() { 
        return Name; 
    }

       public int gibGroesse() { 
        return Groesse; 
    } 

       public int gibgewicht() { 
        return Gewicht; 
    }

       public String gibLaut() { 
        return "Gav"; 
    }

    
}
