
public class KuhTR 
{
    String name;
    int groesse;
    int gewicht;

    public KuhTR()
    {
        name = "Fritz";
        groesse = 5;
        gewicht = 7;
    }

    public KuhTR(String naNeu, int grNeu, int geNeu)
    {
        name = naNeu;
        groesse = grNeu;
        gewicht = geNeu;
    }

    public void setzeName(String s) { 
        name = s; 
    }

    public void setzeGroesse(int i) { 
        groesse = i; 
    }

    public void setzeGewicht(int i) { 
        gewicht = i; 
    }

    public String gibName() { 
        return name; 
    }

    public int gibGroesse() { 
        return groesse; 
    } 

    public int gibgewicht() { 
        return gewicht; 
    }

    public String gibLaut() { 
        return "Muh"; 
    }

}
