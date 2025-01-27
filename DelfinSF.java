
public class DelfinSF 
{
    String name;
    int laenge;
    int gewicht;

    public DelfinSF()
    {
        name = "Adrian";
        laenge = 5;
        gewicht = 7;
    }

    public DelfinSF(String naNeu, int grNeu, int geNeu)
    {
        name = naNeu;
        laenge = grNeu;
        gewicht = geNeu;
    }

    public void setzeName(String s) { name = s; }

    public void setzeGroesse(int i) { laenge = i; }

    public void setzeGewicht(int i) { gewicht = i; }

    public String gibName() { return name; }

    public int gibGroesse() { return laenge; } 

    public int gibgewicht() { return gewicht; }

    public String gibLaut() { return "Ae"; }

}
