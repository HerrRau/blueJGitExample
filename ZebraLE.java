
public class ZebraLE extends Tier
{
    // Attribute
    String name;
    String farbe;
    int gewicht;

    public ZebraLE()
    {
        name = "anton";
        farbe = "gruen";
        gewicht = 150;
    }

    // weitere Methoden
    public ZebraLE (String nameNeu, String farbeNeu, int gewichtNeu)
    {
        name = nameNeu;
        farbe = farbeNeu;
        gewicht = gewichtNeu;
    }

    
    public void setzeName(String s) { name = s; }

    public void setzeFarbe(String i) { farbe = i; }

    public void setzeGewicht(int i) { gewicht = i; }

    public String gibName() { return name; }

    public String gibFarbe() { return "farbe" ; } 

    public int gibgewicht() { return gewicht; }

    public String gibLaut() { return "AHH"; }



}
